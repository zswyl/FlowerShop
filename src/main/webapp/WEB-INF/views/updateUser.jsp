<%--
  Created by IntelliJ IDEA.
  User: 江七
  Date: 2020/12/17
  Time: 14:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="cp" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>佩奇花店</title>
    <link href="${cp}/css/bootstrap.min.css" rel="stylesheet">
    <link href="${cp}/css/style.css" rel="stylesheet">

    <script src="${cp}/js/jquery.min.js" type="text/javascript"></script>
    <script src="${cp}/js/bootstrap.min.js" type="text/javascript"></script>
    <script src="${cp}/js/layer.js" type="text/javascript"></script>

</head>
<body>
<!--导航栏部分-->
<jsp:include page="include/header.jsp"/>

<!-- 中间内容 -->
<div class="container-fluid">
    <h1 class="title center">修改用户信息</h1>
    <br/>
    <div class="col-sm-offset-2 col-md-offest-2">
        <!-- 表单输入 -->
        <div  class="form-horizontal">
            <div class="form-group">
                <label for="inputEmail" class="col-sm-2 col-md-2 control-label">用户名</label>
                <div class="col-sm-6 col-md-6">
                    <input type="text" class="form-control" id="inputUserName"  readonly>
                </div>
            </div>
            <div class="form-group">
                <label for="inputNickname" class="col-sm-2 col-md-2 control-label">昵称</label>
                <div class="col-sm-6 col-md-6">
                    <input type="text" class="form-control" id="inputNickname"  />
                </div>
            </div>

            <div class="form-group">
                <label for="inputPhoneNumber" class="col-sm-2 col-md-2 control-label">手机号码</label>
                <div class="col-sm-6 col-md-6">
                    <input type="text" class="form-control" id="inputPhoneNumber" placeholder="131xxxxxxxx" />
                </div>
            </div>
            <div class="form-group">


            <div class="form-group">
                <label for="postcodes" class="col-sm-2 col-md-2 control-label">邮政编码</label>
                <div class="col-sm-6 col-md-6">
                    <input type="text" class="form-control" id="postcodes" placeholder="233100" />
                </div>
            </div>
            <div class="form-group">
                <label for="address" class="col-sm-2 col-md-2 control-label">地址</label>
                <div class="col-sm-6 col-md-6">
                    <input type="text" class="form-control" id="address" />
                </div>
            </div>
            <div class="form-group">
                <div class="col-sm-offset-2 col-sm-6">
                    <button class="btn btn-lg btn-primary btn-block" type="submit" onclick="startUpdate()">确认修改</button>
                </div>
            </div>
        </div>
        <br/>
    </div>
</div>

<!--尾部-->
<jsp:include page="include/foot.jsp"/>
<script type="text/javascript">
    initData();
    function initData() {
        var userId = ${upUser.id};
        var user = getUserById(userId);
        var userDetail = getUserDetailById(userId);
        document.getElementById("inputUserName").value = user.name;
        document.getElementById("inputNickname").value = user.nickName;
        document.getElementById("inputPhoneNumber").value = userDetail.phoneNumber;
        document.getElementById("postcodes").value = userDetail.postNumber;
        document.getElementById("address").value = userDetail.address;
    }
    function startUpdate() {
        var loading = layer.load(0);
        var user = {};
        user.userName = document.getElementById("inputUserName").value;
        user.nickName = document.getElementById("inputNickname").value;
        user.phoneNumber = document.getElementById("inputPhoneNumber").value;
        user.postNumber = document.getElementById("postcodes").value;
        user.address = document.getElementById("address").value;
        if(user.userName == ''){
            layer.msg('用户名不能为空',{icon:2});
            return;
        }
        else if(user.userName.length >= 12){
            layer.msg('用户名长度不能超过12个字符',{icon:2});
            return;
        }
        if(user.nickName == ''){
            layer.msg('昵称不能为空',{icon:2});
            return;
        }
        else if(user.nickName.length >= 15){
            layer.msg('用户名长度不能超过15个字符',{icon:2});
            return;
        }
        var registerResult = null;
        $.ajax({
            async : false, //设置同步
            type : 'POST',
            url : '${cp}/doUpdateUser',
            data : user,
            dataType : 'json',
            success : function(result) {
                registerResult = result.result;
            },
            error : function(result) {
                layer.alert('查询用户错误');
            }
        });
        if(registerResult == 'success'){
            layer.close(loading);
            layer.msg('修改成功',{icon:1});
            window.location.href="${cp}/control";
        }
        else if(registerResult == 'fail'){
            layer.msg('服务器异常',{icon:2});
        }
    }

    function getUserById(id) {
        var userResult = "";
        var user = {};
        user.id = id;
        $.ajax({
            async : false, //设置同步
            type : 'POST',
            url : '${cp}/getUserById',
            data : user,
            dataType : 'json',
            success : function(result) {
                userResult = result.result;
            },
            error : function(result) {
                layer.alert('查询错误');
            }
        });
        userResult = JSON.parse(userResult);
        return userResult;
    }

    function getUserDetailById(id) {
        var userDetailResult = "";
        var user = {};
        user.id = id;
        $.ajax({
            async : false, //设置同步
            type : 'POST',
            url : '${cp}/getUserDetailById',
            data : user,
            dataType : 'json',
            success : function(result) {
                userDetailResult = result.result;
            },
            error : function(result) {
                layer.alert('查询错误');
            }
        });
        userDetailResult = JSON.parse(userDetailResult);
        return userDetailResult;
    }
</script>
</body>
</html>