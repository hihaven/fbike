<%@page import="action.UserAction"%>
<%@page import="action.BookAction"%>
<%@page import="javax.servlet.http.HttpSession"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>FBike</title>
    <link href="../../css/index.css" rel="stylesheet" type="text/css">
    <link href="../../bootstrap-3.3.5/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
    <script src="../../js/myjs.js"></script>
</head>
<body>

 <!-- 弹出层开始 -->
    <div id="light" class="white_content">
        <div class="close"><a href="javascript:void(0)" onclick="hide('light')"> 关闭</a></div>
        <div class="con">
        
            <iframe scrolling="no" src="gouwuche.html" style="height:400px;width:650px;border:0;"></iframe>
        </div>
    </div>
    <div id="light2" class="white_content1">
        <div class="close"><a href="javascript:void(0)" onclick="hide('light2')"> 关闭</a></div>
        <div class="con">
            <!--<form class="logintanchu">
                <table style="position:relative;left:30px">
                    <tr><td></td><td style="text-align:center">登陆</td><td></td></tr>
                    <tr><td>用户名：</td><td><input id="Text1" type="text"/></td></tr>
                    <tr><td>密码：</td><td><input id="Password1" type="password" /></td></tr>
                </table>
                
                <br>
                <input id="Submit1" type="submit" value="登陆" style="position:relative;left:170px;" class="btn btn-primary"/>
            </form>-->
            <div class="container" style="height:200px;width:300px;">
                <form class="form-signin" action="login" method="get">
                    <h2 class="form-signin-heading">登陆</h2>
                    <label class="sr-only" for="inputEmail">账户号</label>
                    <input class="form-control" id="inputUserName" name="inputUserName" autofocus="" required="" type="text" placeholder="用户名">
                    <label class="sr-only" for="inputPassword">密码</label>
                    <input class="form-control" id="inputPassword" name="inputPassword" required="" type="password" placeholder="密码">
                    <div class="checkbox">
                        <label>
                            <input type="checkbox" value="remember-me"> 记住账号
                        </label>
                    </div>
                    <button class="btn btn-lg btn-primary btn-block" type="submit">确认</button>
                </form>
            </div>
        </div>
    </div>
    <div id="light3" class="white_content2">
        <div class="close"><a href="javascript:void(0)" onclick="hide('light3')"> 关闭</a></div>
        <div class="con">
            <div class="cheLiang1">
        <a style="text-align:center;"><h3>注册账号</h3></a>
       <div style="height:200px;width:250px;margin-left:200px;margin-top:200px; margin:0 auto 0 auto;">
       <form action="register" method="get">
       <table>
       <tr>
       <td>用户名：</td>
       <td><input type="text" name="yonghuming"></td>
       </tr>
       <tr>
       <td>密码：</td>
       <td><input type="text" name="password"></td>
       </tr>
       <tr>
       <td>确认密码：</td>
       <td><input type="text" name="checkpassword"></td>
       </tr>
       <tr>
       <td>用户地址：</td>
       <td><input type="text" name="useraddress"></td>
       </tr>
       <tr>
       <td>用户头像：</td>
       <td><input type="text" name="userimage"></td>
       </tr>
       <tr>
       <td>用户角色：</td>
       <td><input type="text" name="userrole"></td>
       </tr>
       <tr>
       <td></td>
       <td><button style="margin-left: 10px;" type=submit>确认</button><button style="margin-left: 30px;">取消</button></td>
       </tr>
       </table>
       </form>
       </div> 
    </div>
        </div>
    </div>
    <div id="fade" class="black_overlay"></div>
    <!-- 弹出层结束 -->
    <div class="index">
        <div class="headerWrapper">
            <div class="headerlogin">
                 <!--弹出层调用--> 
                 <% boolean f=false;
              	String str=(String)session.getAttribute("loginName");
                    		if(str==null){
                    			f=false;%>
               
                 <div id="div1" style="display: block;">
                <a href="javascript:void(0)" onclick="show('light2')">登录</a>
                <a href="javascript:void(0)" onclick="show('light3')">注册</a>
                </div>
                 <%}else{ %>
				<div id="div2" style="display:block;"><a>欢迎你：<%=str%></a>
             <a href="GeRenZhongXing.html" target="iframe01">个人中心</a>
             </div>
             <%} %>
                <a href="javascript:void(0)" onclick="show('light')">购物车</a>
                <a href="logout.action">退出</a>
            </div>
        </div>
        
        <div class="nvbar01">
            <div class="nvbar01_1">
                <a href="xuanche.html" target="iframe01">选车</a>
                <a href="xuanshangpu.html" target="iframe01">挑选商铺</a>
                <!--<a href="cheLiangXiangYe.html" target="iframe01">查看这辆车</a>-->
            </div>
            <div class="nvbar01_1_1">
                <input type="search" id="1">
                <input type="button" value="搜索" class="btn btn-sm btn-primary">
            </div>
        </div>
        
        <div class="zhuti">            
            <div class="gonggao01">
                <div class="gonggao01_1">
                    <h2>达人选购</h2>
                </div>
                <div class="gonggao01_2">
                    <ul>
                        <li class="gonggao01_2_1">
                            <img src="../../img/03.png">
                            <a href="cheLiangXiangYe.html" target="iframe01">查看这辆车</a>
                        </li>
                        <li class="gonggao01_2_1">
                            <img src="../../img/03.png">
                            <a href="cheLiangXiangYe.html" target="iframe01">查看这辆车</a>
                        </li>
                        <li class="gonggao01_2_1">
                            <img src="../../img/03.png">
                            <a href="cheLiangXiangYe.html" target="iframe01">查看这辆车</a>
                        </li>
                        <li class="gonggao01_2_1">
                            <img src="../../img/03.png">
                            <a href="cheLiangXiangYe.html" target="iframe01">查看这辆车</a>
                        </li>
                    </ul>
                </div>
            </div>
            <iframe name="iframe01" class="iframe01" scrolling="no" src="xuanche.html"></iframe>
           
        </div>


    </div>
</body>
</html>