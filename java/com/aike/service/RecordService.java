package com.aike.service;

import com.aike.pojo.Record;
import com.aike.service.vo.SelectRecord;
import com.github.pagehelper.PageInfo;

public interface RecordService {
    PageInfo<Record> selectAllCondition(SelectRecord selectRecord);

    int dataerInsert(Record record);

    int delete(int rid);

    int update(Record record);

    int checkerUpdate(Record record);

    boolean checkerAll(int cSno);
}
