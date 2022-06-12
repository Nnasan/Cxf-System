package com.aike.service.impl;

import com.aike.mapper.RecordMapper;
import com.aike.pojo.Checker;
import com.aike.pojo.Record;
import com.aike.pojo.RecordExample;
import com.aike.service.CheckerService;
import com.aike.service.RecordService;
import com.aike.service.StudentService;
import com.aike.service.vo.SelectRecord;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class RecordServiceImpl implements RecordService {
    @Resource
    RecordMapper recordMapper;

    @Resource
    StudentService studentService;

    @Resource
    CheckerService checkerService;

    @Override
    public PageInfo<Record> selectAllCondition(SelectRecord selectRecord) {
        PageHelper.startPage(selectRecord.getPageIndex(),selectRecord.getPageSize());
        List<Record> records = recordMapper.selectAllCondition(selectRecord);
        PageInfo<Record> pageInfo = new PageInfo<>(records);
        return pageInfo;
    }

    @Override
    public int dataerInsert(Record record) {
        int insert = recordMapper.dataerInsert(record);
        return insert;
    }

    @Override
    public int delete(int rid) {
        int delete = -1;
        if(statusIsOk(rid)) {
            delete = recordMapper.deleteByPrimaryKey(rid);
        }
        return delete;
    }

    @Override
    public int update(Record record) {
        int update = -1;
        if(statusIsOk(record)){
            //update = recordMapper.updateByPrimaryKeySelective(record);
            update = recordMapper.updateByPrimaryKey(record);
        }
        return update;
    }

    @Override
    @Transactional
    public int checkerUpdate(Record record) {
        //System.out.println(record);
        boolean isOK = statusIsOk(record);
        int i1 = 1;
        int i2 = -1;
        if(isOK == record.getStatus()){
            //说明是更改 需要对分数进行处理
            //System.out.println(record);
            Double rollbackscore = isOK ? record.getUpdatescore() : 0-record.getUpdatescore();
            i1 = studentService.updateStudentPoint(record.getsId(), rollbackscore);
            //System.out.println(i1);
        }
        Checker checker = checkerService.selectToId(record.getcSno());
        if(checker!=null){
            record.setcId(checker.getcId());
            //System.out.println(record);
            i2 = recordMapper.updateByPrimaryKeySelective(record);
            //System.out.println(i2);
        }
        if(i1 <= 0 || i2 <= 0){
            throw new RuntimeException();
        }
        return i2;
    }

    @Override
    @Transactional
    public boolean checkerAll(int cSno) {
        //拿到所有的未被批准的数据
        Checker checker = checkerService.selectToId(cSno);
        RecordExample recordExample = new RecordExample();
        RecordExample.Criteria criteria = recordExample.createCriteria();
        criteria.andStatusEqualTo(false);
        criteria.andCIdIsNull();
        List<Record> records = recordMapper.selectByExample(recordExample);
        for(Record record : records){
            record.setcSno(cSno);
            record.setStatus(true);
            record.setcId(checker.getcId());
            int update = checkerUpdate(record);
            if(update<=0){
                throw new RuntimeException();
            }
        }
        return true;
    }

    //判断状态 true表示 数据库的状态是false
    public boolean statusIsOk(Record record){
        Record record1 = recordMapper.selectByPrimaryKey(record.getrId());
        return record1 != null && !record1.getStatus();
    }

    public boolean statusIsOk(int rid){
        Record record1 = recordMapper.selectByPrimaryKey(rid);
        return record1 != null && !record1.getStatus();
    }
}
