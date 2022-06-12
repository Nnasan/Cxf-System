import{f as e}from"./index.cf81e116.js";import{C as a,D as t,E as l,L as n,r as d,o,e as r,f as s,g as u,w as p,h as i,t as c,p as m,i as g}from"./vendor.12f57d03.js";import{$ as f}from"./jquery.5edb227f.js";const b={name:"baseform",setup(){const d=a([]),o=a([]),r=a(0),s=a(0),u=a(null),p=t({sName:"",dName:"",sSno:"",dSno:"",date:"",updatescore:"",status:"",remarks:""}),i=t({sName:"",dName:"",sSno:"",dSno:"",date:"",updatescore:"",status:"",remarks:""}),c=t({erReId:"",erReason:""}),m=t({name:"",sno:"",classname:"",pageIndex:1,pageSize:10}),g=t({sSno:"",pageIndex:1,pageSize:10}),b=()=>{e(m,"./select/student").then((e=>{d.value=e.list,r.value=e.total||0}))},S=a=>{a&&(e=>{i.sName=e.sName,i.sSno=e.sSno})(a),g.sSno=i.sSno;e(g,"./record/selectAllCondition").then((e=>{o.value=e.list,s.value=e.total||0}))},h=a(!1),y=a(!1),V=()=>(new Date).getFullYear()+"/"+((new Date).getMonth()+1)+"/"+(new Date).getDate()+" "+(new Date).getHours()+":"+((new Date).getMinutes()<10?"0"+(new Date).getMinutes():(new Date).getMinutes())+":"+((new Date).getSeconds()<10?"0"+(new Date).getSeconds():(new Date).getSeconds());b();return{editVisibleOptions:y,editVisibleStudent:h,saveEditStudent:()=>{u.value.validate((e=>{e?(h.value=!1,f.ajax({type:"POST",url:"/record/insert",async:!1,data:i,dataType:"text",success:function(e){null!=e&&""!==e?(l.success("添加成功,请等待审核"),u.value.resetFields(),S()):l.error("添加失败，请检查信息是否正确")}}).responseText):l.error("添加失败，请检查信息是否正确")}))},saveEditOptions:()=>{u.value.validate((e=>{e?(y.value=!1,c.status?l.error("修改失败,此请求已经通过"):f.ajax({type:"POST",url:"/record/update",async:!1,data:c,dataType:"text",success:function(e){null!=e&&""!==e?(l.success("修改成功,请等待审核"),u.value.resetFields(),S()):(l.error("修改失败,请求已经通过"),S())}}).responseText):l.error("修改失败，请检查信息是否正确")}))},handleEditStudent:()=>{i.dName=localStorage.getItem("ms_realName"),i.dSno=localStorage.getItem("ms_username"),i.date=V(),i.status=!1,""!==i.sName?h.value=!0:l.error("请选择要操作的学生")},handleEditOptions:(e,a)=>{!a.status&&a.cId?l.error("申请失败,此数据已经驳回"):(c.erReId=a.rId,y.value=!0)},pageTotalOptions:s,pageTotalStudent:r,queryStudent:m,queryOptions:g,handleDeleteOptions:(e,a)=>{n.confirm("确定要撤销吗？","提示",{type:"warning"}).then((()=>{c.status?l.error("撤销失败,此请求已经通过"):(c.rId=a.rId,c.sName=a.sName,c.dName=localStorage.getItem("ms_realName"),c.sSno=a.sSno,c.dSno=localStorage.getItem("ms_username"),c.date=V(),c.status=!1,c.updatescore=a.updatescore,c.remarks=a.remarks,f.ajax({type:"POST",url:"/record/delete",async:!1,data:c,dataType:"text",success:function(e){null!=e&&""!==e?(l.success("撤销成功"),S()):l.error("撤销失败，请联系管理")}}).responseText,S())})).catch((()=>{}))},handlePageChangeStudent:e=>{m.pageIndex=e,b()},handleSearchOptions:()=>{g.pageIndex=1,S()},handlePageChangeOptions:e=>{console.log(e),g.pageIndex=e,S()},handleSearchStudent:()=>{m.pageIndex=1,b()},getDataOptions:S,getDataStudent:b,tableDataStudent:d,tableDataOptions:o,formRef:u,formUpdate:c,form:p,temp:i,addReject:()=>{y.value=!1,e(c,"./errorcode/add").then((e=>{null!==e&&!1!==e?l.success("申请成功,请等待驳回"):l.error("请勿重复申请")}))}}}},S=e=>(m("data-v-351f62cb"),e=e(),g(),e),h={class:"crumbs"},y=S((()=>s("i",{class:"el-icon-lx-calendar"},null,-1))),V=i(" 表单 "),_=i("操行分录入"),v={class:"container"},x=S((()=>s("div",{class:"clearfix"},[s("span",null,"学生管理")],-1))),w=i("查看 "),C={class:"pagination"},D={class:"clearfix"},N=S((()=>s("span",null,"操作记录",-1))),O=i("编辑 "),k=i("申请撤销 "),I={class:"pagination"},q={class:"dialog-footer"},T=i("取 消"),U=i("确 定"),R={class:"dialog-footer"},j=i("取 消"),z=i("确 定");b.render=function(e,a,t,l,n,m){const g=d("el-breadcrumb-item"),f=d("el-breadcrumb"),b=d("el-input"),S=d("el-col"),E=d("el-row"),P=d("el-table-column"),K=d("el-button"),M=d("el-table"),F=d("el-pagination"),A=d("el-card"),H=d("el-tag"),L=d("el-form-item"),Y=d("el-form"),$=d("el-dialog");return o(),r("div",null,[s("div",h,[u(f,{separator:"/"},{default:p((()=>[u(g,null,{default:p((()=>[y,V])),_:1}),u(g,null,{default:p((()=>[_])),_:1})])),_:1})]),s("div",v,[u(E,{gutter:10},{default:p((()=>[u(S,null,{default:p((()=>[u(A,{shadow:"hover"},{header:p((()=>[x])),default:p((()=>[u(E,{type:"flex",class:"row-bg"},{default:p((()=>[u(S,{span:8},{default:p((()=>[s("div",null,[u(b,{onKeyup:l.getDataStudent,modelValue:l.queryStudent.name,"onUpdate:modelValue":a[0]||(a[0]=e=>l.queryStudent.name=e),class:"handle-input mr20",placeholder:"学生名"},null,8,["onKeyup","modelValue"])])])),_:1}),u(S,{span:8},{default:p((()=>[s("div",null,[u(b,{onKeyup:l.getDataStudent,modelValue:l.queryStudent.sno,"onUpdate:modelValue":a[1]||(a[1]=e=>l.queryStudent.sno=e),class:"handle-input mr20",placeholder:"学号"},null,8,["onKeyup","modelValue"])])])),_:1}),u(S,{span:8},{default:p((()=>[s("div",null,[u(b,{onKeyup:l.getDataStudent,modelValue:l.queryStudent.classname,"onUpdate:modelValue":a[2]||(a[2]=e=>l.queryStudent.classname=e),class:"handle-input mr20",placeholder:"班级"},null,8,["onKeyup","modelValue"])])])),_:1})])),_:1}),u(M,{"highlight-current-row":"",data:l.tableDataStudent,border:"",class:"table",ref:"multipleTable","header-cell-class-name":"table-header"},{default:p((()=>[u(P,{prop:"sSno",label:"学号",align:"center"}),u(P,{prop:"sName",label:"学生名",align:"center"}),u(P,{prop:"sSex",label:"性别",align:"center"}),u(P,{prop:"sPoint",label:"分数",align:"center"}),u(P,{prop:"sAge",label:"年龄",align:"center"}),u(P,{prop:"sClass.clName",label:"班级",align:"center"}),u(P,{label:"操作",align:"center"},{default:p((e=>[u(K,{type:"text",icon:"el-icon-search",onClick:a=>l.getDataOptions(e.row)},{default:p((()=>[w])),_:2},1032,["onClick"])])),_:1})])),_:1},8,["data"]),s("div",C,[u(F,{background:"",layout:"total, prev, pager, next","current-page":l.queryStudent.pageIndex,"page-size":l.queryStudent.pageSize,total:l.pageTotalStudent,onCurrentChange:l.handlePageChangeStudent},null,8,["current-page","page-size","total","onCurrentChange"])])])),_:1})])),_:1}),u(S,null,{default:p((()=>[u(A,{shadow:"hover"},{default:p((()=>[s("div",D,[N,u(K,{type:"text",icon:"el-icon-edit",onClick:l.handleEditStudent},{default:p((()=>[O])),_:1},8,["onClick"])]),u(M,{data:l.tableDataOptions,border:"",class:"table",ref:"multipleTable","header-cell-class-name":"table-header"},{default:p((()=>[u(P,{prop:"sSno",label:"学号",align:"center"}),u(P,{prop:"sName",label:"学生名",align:"center"}),u(P,{prop:"dName",label:"录入员",align:"center"}),u(P,{prop:"updatescore",label:"分数更新",align:"center"}),u(P,{prop:"date",label:"录入日期",align:"center"}),u(P,{prop:"remarks",label:"备注",align:"center"}),u(P,{prop:"status",label:"状态",align:"center"},{default:p((e=>[u(H,{type:e.row.status?"success":e.row.cId?"info":"danger"},{default:p((()=>[i(c(e.row.status?"已批准":e.row.cId?"已驳回":"未批准"),1)])),_:2},1032,["type"])])),_:1}),u(P,{label:"操作",align:"center"},{default:p((e=>[u(K,{type:"text",icon:"el-icon-delete",onClick:a=>l.handleEditOptions(e.$index,e.row)},{default:p((()=>[k])),_:2},1032,["onClick"])])),_:1})])),_:1},8,["data"]),s("div",I,[u(F,{background:"",layout:"total, prev, pager, next","current-page":l.queryOptions.pageIndex,"page-size":l.queryOptions.pageSize,total:l.pageTotalOptions,onCurrentChange:l.handlePageChangeOptions},null,8,["current-page","page-size","total","onCurrentChange"])])])),_:1})])),_:1})])),_:1})]),u($,{title:"录入信息",modelValue:l.editVisibleStudent,"onUpdate:modelValue":a[10]||(a[10]=e=>l.editVisibleStudent=e),width:"30%"},{footer:p((()=>[s("span",q,[u(K,{onClick:a[8]||(a[8]=e=>l.editVisibleStudent=!1)},{default:p((()=>[T])),_:1}),u(K,{type:"primary",onClick:a[9]||(a[9]=e=>l.saveEditStudent())},{default:p((()=>[U])),_:1})])])),default:p((()=>[u(Y,{ref:"formRef",model:l.temp,"label-width":"70px"},{default:p((()=>[u(L,{prop:"sName",label:"学生"},{default:p((()=>[u(b,{disabled:"",readonly:"",modelValue:l.temp.sName,"onUpdate:modelValue":a[3]||(a[3]=e=>l.temp.sName=e)},null,8,["modelValue"])])),_:1}),u(L,{prop:"dName",label:"录入员"},{default:p((()=>[u(b,{disabled:"",readonly:"",modelValue:l.temp.dName,"onUpdate:modelValue":a[4]||(a[4]=e=>l.temp.dName=e)},null,8,["modelValue"])])),_:1}),u(L,{prop:"date",label:"日期"},{default:p((()=>[u(b,{disabled:"",readonly:"",modelValue:l.temp.date,"onUpdate:modelValue":a[5]||(a[5]=e=>l.temp.date=e)},null,8,["modelValue"])])),_:1}),u(L,{prop:"updatescore",rules:{required:!0,message:"请填写修改分值",trigger:["blur","change"]},label:"更改分值"},{default:p((()=>[u(b,{modelValue:l.temp.updatescore,"onUpdate:modelValue":a[6]||(a[6]=e=>l.temp.updatescore=e)},null,8,["modelValue"])])),_:1}),u(L,{prop:"remarks",rules:{required:!0,message:"请填写备注",trigger:["blur","change"]},label:"备注"},{default:p((()=>[u(b,{modelValue:l.temp.remarks,"onUpdate:modelValue":a[7]||(a[7]=e=>l.temp.remarks=e)},null,8,["modelValue"])])),_:1})])),_:1},8,["model"])])),_:1},8,["modelValue"]),u($,{title:"申请撤销记录",modelValue:l.editVisibleOptions,"onUpdate:modelValue":a[13]||(a[13]=e=>l.editVisibleOptions=e),width:"30%"},{footer:p((()=>[s("span",R,[u(K,{onClick:a[12]||(a[12]=e=>l.editVisibleOptions=!1)},{default:p((()=>[j])),_:1}),u(K,{type:"primary",onClick:l.addReject},{default:p((()=>[z])),_:1},8,["onClick"])])])),default:p((()=>[u(Y,{ref:"formRef",model:l.formUpdate,"label-width":"70px"},{default:p((()=>[u(L,{prop:"erReason",rules:{required:!0,message:"请填写撤销原因",trigger:["blur","change"]},label:"撤销原因"},{default:p((()=>[u(b,{modelValue:l.formUpdate.erReason,"onUpdate:modelValue":a[11]||(a[11]=e=>l.formUpdate.erReason=e)},null,8,["modelValue"])])),_:1})])),_:1},8,["model"])])),_:1},8,["modelValue"])])},b.__scopeId="data-v-351f62cb";export default b;
