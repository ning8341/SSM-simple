<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
 <title>董维宁-个人网站</title>
    <!-- CSS -->
     <link href="css/table.css" rel="stylesheet"> 
  </head>
  <body>
     <div >   
        <form action="${pageContext.request.contextPath }/list" method="post">
           <input type="submit" value="返回"/>    
        </form>
    </div>
    <div id="title_context">
      <p align="center" style="font-size: 20px;font-style:inherit;">学生信息管理系统</p>
    </div>

	<div>
		<table id="page_table">
			<tr>
				<th>学生ID</th>
				<th>学生name</th>
				<th>班级名称</th>
				<th>学生年龄</th>
				<th>性别</th>
				<th>老师的ID</th>
				<th>新增</th>
			</tr>
			<c:forEach items="${list}" var="student">
				<tr>
					<td><c:out value="${student.id}"></c:out></td>
					<td><c:out value="${student.name }"></c:out></td>
					<td><c:out value="${student.className}"></c:out></td>
					<td><c:out value="${student.age}"></c:out></td>
					<td><c:out value="${student.sex}"></c:out></td>
					<td><c:out value="${student.teacherId}"></c:out></td>
					<td>
					<form action="${pageContext.request.contextPath }/updateS?id=${student.id}" method="post">
					    
					    <button type="submit">修改</button>
					</form>
					<form action="${pageContext.request.contextPath }/deleteS?id=${student.id}" method="post">					    
					    <button type="submit">删除</button>
					</form>
					
					</td>
				</tr>
			</c:forEach>

		</table>
	</div>
 <%@ include file="footer.jsp" %>   
	<!-- 引入js -->
<script src="js/jquery.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/alert.js"></script>
</body>

</html>