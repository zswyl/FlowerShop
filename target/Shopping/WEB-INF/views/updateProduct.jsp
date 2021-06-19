<%--
  Created by IntelliJ IDEA.
  User: 江七
  Date: 2020/12/16
  Time: 23:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>佩奇花店</title>
    <link href="${cp}/css/bootstrap.min.css" rel="stylesheet">
    <link href="${cp}/css/style.css" rel="stylesheet">

    <script src="${cp}/js/jquery.min.js" type="text/javascript"></script>
    <script src="${cp}/js/ajaxfileupload.js" type="text/javascript"></script>
    <script src="${cp}/js/bootstrap.min.js" type="text/javascript"></script>
    <script src="${cp}/js/layer.js" type="text/javascript"></script>

</head>
<body>
<!--导航栏部分-->
<jsp:include page="include/header.jsp"/>
<form class="col-md-12" action="doUpdateProduct">
    <hr/>
    <div class="col-sm-offset-2 col-md-offest-2">
        <!-- 表单输入 -->
        <div class="form-horizontal">
            <div class="form-group">
                <label for="productName" class="col-sm-2 col-md-2 control-label">鲜花名称</label>
                <div class="col-sm-6 col-md-6">
                    <input type="text" class="form-control" name="productName" value="${upProduct.name}"/>
                </div>
            </div>
            <div class="form-group">
                <label for="productDescribe" class="col-sm-2 col-md-2 control-label">花语</label>
                <div class="col-sm-6 col-md-6">
                        <textarea type="text" class="form-control" name="productDescribe" value="${upProduct.description}"
                        >${upProduct.description}</textarea>
                </div>
            </div>
            <div class="form-group">
                <label for="keyWord" class="col-sm-2 col-md-2 control-label">关键词</label>
                <div class="col-sm-6 col-md-6">
                    <textarea type="text" class="form-control" name="keyWord" value="${upProduct.keyWord}">${upProduct.keyWord}</textarea>
                </div>
            </div>
            <div class="form-group">
                <label for="productPrice" class="col-sm-2 col-md-2 control-label">鲜花价格</label>
                <div class="col-sm-6 col-md-6">
                    <input type="text" class="form-control" name="productPrice" value="${upProduct.price}"/>
                </div>
            </div>
            <div class="form-group">
                <label for="productCount" class="col-sm-2 col-md-2 control-label">鲜花数量</label>
                <div class="col-sm-6 col-md-6">
                    <input type="text" class="form-control" name="productCount" value="${upProduct.counts}"/>
                </div>
            </div>
            <div class="form-group">
                <label for="productType" class="col-sm-2 col-md-2 control-label">商品类别</label>
                <div class="col-sm-6 col-md-6">
                    <select name="productType" class="form-control" name="productType" value="${upProduct.type}">
                        <option value="1">爱情鲜花</option>
                        <option value="2">生日鲜花</option>
                        <option value="3">探病慰问</option>
                        <option value="4">商务鲜花</option>
                        <option value="5">祝福庆贺</option>
                        <option value="6">婚庆鲜花</option>
                        <option value="7">道歉鲜花</option>
                        <option value="8">哀思鲜花</option>
                    </select>
                </div>
            </div>
            <div class="form-group">
                <div class="col-sm-offset-2 col-sm-6">
                    <button class="btn btn-lg btn-primary btn-block" type="submit">提交修改
                    </button>
                </div>
            </div>
        </div>
        <br/>
    </div>
</div>
</div>
</form>
<!--尾部-->
    <jsp:include page="include/foot.jsp"/>

</body>
</html>
