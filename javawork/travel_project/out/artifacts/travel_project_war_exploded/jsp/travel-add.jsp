<%--
  Created by IntelliJ IDEA.
  User: 81434
  Date: 2024/3/26
  Time: 18:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>报名</title>
    <style>
        .back{
            position: absolute;
            top:0;
            bottom: 0;
            left: 0;
            right:0;
            background-color: lightskyblue;
            background-size: 100%,100%;
            background-repeat: no-repeat;
        }
        .container-round{
            background-color: rgba(255,255,255,0.5);
            width: 736px;
            border-radius: 10px;
        }

    </style>
</head>
<script src = "<%=path%><%!private Object path;
%>/jquery/jquery-1.7.2.js"></script>
<script>

    $(function (){

        //通过ajax往后端请求班级数据
        $.ajax({
            //提交到后端的地址
            url : "http://localhost:8088/web/travel?flag=findClassAll",
            //提交的方式
            type : "post",
            //提交到后端的数据
            data : {},
            //请求成功之后的回调函数
            success : function (obj){
                //完成对下拉框班级数据的追加
                for (let i in obj){
                    $("#cid").append("<option value="+obj[i].cid+">"+obj[i].className+"</option>")
                }
            },
            //预期服务器的返回值类型
            dataType : "json"

        })
    })

    //执行添加
    function toAdd(){
        $.ajax({
            url:"http://localhost:8088/web/travel?flag=addPassenger",
            type:"post",
            data:""
        })
    }


    

</script>

<body class="back">

<table class="table table-hover">
</table>

<div class="container container-round">
    <h1 align="center" style="font-size: 30px">添加学生</h1>

    <form class="form-horizontal" role="form" style="margin-top: 20px">
        <div class="form-group">
            <label for="studentName" class="col-sm-3 control-label">学生姓名:</label>
            <div class="col-sm-6">
                <input type="text" class="form-control" id="studentName" name="studentName" placeholder="学生姓名">
            </div>
        </div>

        <div class="form-group">
            <label class="col-sm-3 control-label">性别:</label>
            <div class="col-sm-6">

                <label>
                    男：<input type="radio"  name="sex" value="1">
                </label>
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                <label>
                    女：<input type="radio"  name="sex" value="2">
                </label>
            </div>
        </div>

        <div class="form-group">
            <label for="address" class="col-sm-3 control-label">居住地址:</label>
            <div class="col-sm-6">
                <input type="text" class="form-control" id="address" name="address" placeholder="居住地址">
            </div>
        </div>

        <div class="form-group">
            <label for="birthday" class="col-sm-3 control-label">手机号码:</label>
            <div class="col-sm-6">
                <input type="date" class="form-control" id="birthday" name="birthday" placeholder="生日">
            </div>
        </div>



        <div class="form-group">
            <label for="cid" class="col-sm-3 control-label">身份证号:</label>
            <div class="col-sm-6">

                <select id="cid" class="form-control" name="cid">
                    <option>---请选择---</option>
                </select>
            </div>
        </div>

        <div class="form-group">
            <div class="col-sm-offset-3 col-sm-6">
                <input type="button" class="btn btn-info" value="保存" onclick="toAdd()">

            </div>
        </div>
    </form>
</div>

</body>
</html>
