import{r as a,o as l,e as s,f as e,g as n,w as r,p as d,i as o,h as t}from"./vendor.12f57d03.js";const u={name:"permission"},c=a=>(d("data-v-a9c1b7d0"),a=a(),o(),a),i={class:"crumbs"},m=c((()=>e("i",{class:"el-icon-lx-warn"},null,-1))),f=t(" 权限测试 "),p={class:"container"},b=c((()=>e("h1",null,"管理员权限页面",-1))),v=c((()=>e("p",null,"只有用 admin 账号登录的才拥有管理员权限，才能进到这个页面，其他账号想进来都会跳到403页面，重新用管理员账号登录才有权限。",-1))),_=t(" 想尝试一下，请 "),g=t("退出登录"),h=t("，随便输入个账号名，再进来试试看。 ");u.render=function(d,o,t,u,c,w){const x=a("el-breadcrumb-item"),j=a("el-breadcrumb"),k=a("router-link");return l(),s("div",null,[e("div",i,[n(j,{separator:"/"},{default:r((()=>[n(x,null,{default:r((()=>[m,f])),_:1})])),_:1})]),e("div",p,[b,v,e("p",null,[_,n(k,{to:"/login",class:"logout"},{default:r((()=>[g])),_:1}),h])])])},u.__scopeId="data-v-a9c1b7d0";export default u;
