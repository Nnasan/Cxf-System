import{D as e,C as a,r as l,o as n,e as t,f as o,g as s,w as r,F as d,k as u,c as p,p as c,i,h as m}from"./vendor.12f57d03.js";import{f as g}from"./index.cf81e116.js";const b={name:"basetable",setup(){const l=e({sno:"",name:"",classname:"",option:"",pageIndex:1,pageSize:10}),n=a([]),t=a(0),o=()=>{g(l,"./select/student").then((e=>{n.value=e.list,t.value=e.total||0}))};o();return{query:l,tableData:n,pageTotal:t,handleSearch:()=>{l.pageIndex=1,o()},handlePageChange:e=>{l.pageIndex=e,o()},options:[{key:"asc",value:"按分数低排序",label:"按分数低排序"},{key:"desc",value:"按分数高排序",label:"按分数高排序"}]}}},h={class:"crumbs"},y=(e=>(c("data-v-4e450a86"),e=e(),i(),e))((()=>o("i",{class:"el-icon-lx-cascades"},null,-1))),v=m(" 操行分查询 "),f={class:"container"},V={class:"handle-box"},q=m("搜索"),x={class:"pagination"};b.render=function(e,a,c,i,m,g){const b=l("el-breadcrumb-item"),C=l("el-breadcrumb"),k=l("el-input"),_=l("el-option"),S=l("el-select"),w=l("el-button"),I=l("el-table-column"),z=l("el-table"),U=l("el-pagination");return n(),t("div",null,[o("div",h,[s(C,{separator:"/"},{default:r((()=>[s(b,null,{default:r((()=>[y,v])),_:1})])),_:1})]),o("div",f,[o("div",V,[s(k,{modelValue:i.query.sno,"onUpdate:modelValue":a[0]||(a[0]=e=>i.query.sno=e),placeholder:"学号",class:"handle-input mr10"},null,8,["modelValue"]),s(k,{modelValue:i.query.name,"onUpdate:modelValue":a[1]||(a[1]=e=>i.query.name=e),placeholder:"学生名",class:"handle-input mr10"},null,8,["modelValue"]),s(k,{modelValue:i.query.classname,"onUpdate:modelValue":a[2]||(a[2]=e=>i.query.classname=e),placeholder:"班级",class:"handle-input mr10"},null,8,["modelValue"]),s(S,{modelValue:i.query.option,"onUpdate:modelValue":a[3]||(a[3]=e=>i.query.option=e),placeholder:"查询规则"},{default:r((()=>[(n(!0),t(d,null,u(i.options,(e=>(n(),p(_,{key:e.key,label:e.label,value:e.key},null,8,["label","value"])))),128))])),_:1},8,["modelValue"]),s(w,{type:"primary",icon:"el-icon-search",onClick:i.handleSearch},{default:r((()=>[q])),_:1},8,["onClick"])]),s(z,{data:i.tableData,border:"",class:"table",ref:"multipleTable","header-cell-class-name":"table-header"},{default:r((()=>[s(I,{prop:"sSno",label:"学号",width:"160",align:"center"}),s(I,{prop:"sName",label:"学生名",align:"center"}),s(I,{prop:"sSex",label:"性别",width:"160",align:"center"}),s(I,{prop:"sPoint",label:"分数",width:"160",align:"center"}),s(I,{prop:"sAge",label:"年龄",width:"160",align:"center"}),s(I,{prop:"sClass.clName",label:"班级",align:"center"})])),_:1},8,["data"]),o("div",x,[s(U,{background:"",layout:"total, prev, pager, next","current-page":i.query.pageIndex,"page-size":i.query.pageSize,total:i.pageTotal,onCurrentChange:i.handlePageChange},null,8,["current-page","page-size","total","onCurrentChange"])])])])},b.__scopeId="data-v-4e450a86";export default b;