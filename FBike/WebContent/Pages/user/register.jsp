<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title></title>
    <meta charset="utf-8" />
    <link href="../../css/index.css" rel="stylesheet" type="text/css" />
    <script src="../../js/myjs.js"></script>
    <style>
    tr{
    	height: 40px;
    }
    </style>
</head>
<body>
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
</body>
</html>