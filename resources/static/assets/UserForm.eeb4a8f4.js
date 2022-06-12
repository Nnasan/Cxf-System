import{C as e,D as l,E as r,r as a,o as t,e as s,f as o,g as u,w as n,F as d,k as c,c as i,h as m}from"./vendor.12f57d03.js";import{$ as f}from"./jquery.5edb227f.js";import{f as p}from"./index.cf81e116.js";const g={name:"baseform",methods:{handleSelect(e){this.form.desc3=e.clId},giveValue(e){const l=e.target.value;for(var r=0;r<this.restaurants.length;r++)this.restaurants[r].value===l&&(this.form.desc3=this.restaurants[r].clIds)},querySearch(e,l){p(null,"./class/selectall").then((r=>{for(var a=0;a<r.length;a++)r[a].value=r[a].clName;this.restaurants=r;var t=r,s=e?t.filter(this.createFilter(e)):t;l(s)}))},createFilter:e=>l=>l.value.toLowerCase().indexOf(e.toLowerCase())>-1},setup(){const a=e(null),t=l({temp:"",region:"",desc1:"",desc2:"",desc3:"",desc4:""});const s=()=>{a.value.resetFields(),t.temp=""};return{restaurants:[],options:[{key:"checker",value:"审核员",label:"审核员"},{key:"dataer",value:"录入员",label:"录入员"}],rules:{region:[{required:!0,message:"请选择账号类型",trigger:["blur","change"]}],desc1:[{required:!0,message:"请输入注册学号",trigger:"blur"}],desc2:[{required:!0,message:"请输入学生姓名",trigger:"blur"}],desc3:[{required:!0,message:"请输入所在班级",trigger:["blur","change"]}],desc4:[{required:!0,message:"请输入初始密码",trigger:"blur"}]},formRef:a,form:t,onSubmit:()=>{a.value.validate((e=>{var l;e?f.ajax({type:"POST",url:"/"+(l=t.region,l.key+"/register"),async:!1,data:JSON.stringify(t),dataType:"text",contentType:"application/json",success:function(e){null!=e&&""!==e?(r.success("注册成功"),s()):r.error("注册失败，请检查信息是否正确")}}).responseText:r.error("注册失败，请填写完毕")}))},onReset:s}}},b={class:"crumbs"},h=o("i",{class:"el-icon-lx-calendar"},null,-1),v=m(" 账号创建 "),y={class:"container"},V={class:"form-box"},x=m("表单提交"),_=m("重置表单");g.render=function(e,l,r,m,f,p){const g=a("el-breadcrumb-item"),k=a("el-breadcrumb"),S=a("el-option"),q=a("el-select"),w=a("el-form-item"),C=a("el-input"),j=a("el-autocomplete"),U=a("el-button"),F=a("el-form");return t(),s("div",null,[o("div",b,[u(k,{separator:"/"},{default:n((()=>[u(g,null,{default:n((()=>[h,v])),_:1})])),_:1})]),o("div",y,[o("div",V,[u(F,{ref:"formRef",rules:m.rules,model:m.form,"label-width":"80px"},{default:n((()=>[u(w,{label:"账号类型",prop:"region"},{default:n((()=>[u(q,{modelValue:m.form.region,"onUpdate:modelValue":l[0]||(l[0]=e=>m.form.region=e),placeholder:"请选择"},{default:n((()=>[(t(!0),s(d,null,c(m.options,(e=>(t(),i(S,{key:e.key,label:e.label,value:e},null,8,["label","value"])))),128))])),_:1},8,["modelValue"])])),_:1}),u(w,{label:"学号",prop:"desc1"},{default:n((()=>[u(C,{type:"textarea",rows:"1",modelValue:m.form.desc1,"onUpdate:modelValue":l[1]||(l[1]=e=>m.form.desc1=e)},null,8,["modelValue"])])),_:1}),u(w,{label:"姓名",prop:"desc2"},{default:n((()=>[u(C,{type:"textarea",rows:"1",modelValue:m.form.desc2,"onUpdate:modelValue":l[2]||(l[2]=e=>m.form.desc2=e)},null,8,["modelValue"])])),_:1}),u(w,{label:"班级",prop:"desc3"},{default:n((()=>[u(j,{class:"inline-input",modelValue:m.form.temp,"onUpdate:modelValue":l[3]||(l[3]=e=>m.form.temp=e),"fetch-suggestions":p.querySearch,"trigger-on-focus":!1,onBlur:p.giveValue,onSelect:p.handleSelect},null,8,["modelValue","fetch-suggestions","onBlur","onSelect"])])),_:1}),u(w,{label:"初始密码",prop:"desc4"},{default:n((()=>[u(C,{type:"textarea",rows:"1",modelValue:m.form.desc4,"onUpdate:modelValue":l[4]||(l[4]=e=>m.form.desc4=e)},null,8,["modelValue"])])),_:1}),u(w,null,{default:n((()=>[u(U,{type:"primary",onClick:m.onSubmit},{default:n((()=>[x])),_:1},8,["onClick"]),u(U,{onClick:m.onReset},{default:n((()=>[_])),_:1},8,["onClick"])])),_:1})])),_:1},8,["rules","model"])])])])};export default g;