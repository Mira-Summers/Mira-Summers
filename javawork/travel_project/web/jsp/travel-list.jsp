<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 81434
  Date: 2024/3/24
  Time: 21:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
</head>
<script>
    $(function (){
        $("[value='报名']").click(function (){
//获取被选中多选框长度
            let length=$(".cks:checked").length
            if(length==1){
                let tid=$(".cks:checked").val
                alert(tid)
                location.href="http://localhost:8088/travel_project_war_exploded/web/travel?flag=toTravelAdd&tid="+tid;
            }else if(length==0){
                alert("请选择一条线路");

            }else if(length>1){
                alert("只能选一条")
            }
        })
    })
</script>
<body>
<h1 align="centre">旅游管理系统</h1>
<form action="http://localhost:8088/travel_project_war_exploded/web/flag?=list" method="post">
    线路名称：<input type="text" name="likeName" value="${likeName}">
    <input type="submit" value="搜索" class="btn btn-warning">
</form>
<table class="table">
    <tr>
        <tb colspan="10" align="center">
            <input type="button" id="add" value="报名" >
            <input type="button" value="修改" onclick="deleteStuBySids()">
            <input type="button" value="删除路径" onclick="deleteStuBySid(${stu.sid})">
            <input type="button" value="查看报名信息">
        </tb>
    </tr>
    <tr>
        <th><input type="checkbox" id="qxOrQbx">全选</th>
        <th>线路名称</th>
        <th>描述</th>
        <th>报名开始日期</th>
        <th>报名截止日期</th>
        <th>行程开始日期</th>
        <th>行程结束日期</th>
        <th>行程结束日期</th>
        <th>价格（元/每人）</th>
        <th>已报名人数</th>
    </tr>
    <c:forEach items="${travelList}" var="value">
        <tr>
            <tb><input type="checkbox" class="cks" value="${travel.id}"></tb>
            <tb>${travel.travelName}</tb>
            <tb>${travel.travelDesc}</tb>
            <tb>${travel.startDate}</tb>
            <tb>${travel.endDate}</tb>
            <tb>${travel.tripStart}</tb>
            <tb>${travel.tripEnd}</tb>
            <tb>${travel.prize}</tb>
            <tb>${travel.num}</tb>
        </tr>
    </c:forEach>

</table>
</body>
</html>
