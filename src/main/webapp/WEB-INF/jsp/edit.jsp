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
    <div id="title_context">
      <p align="center" style="font-size: 20px;font-style:inherit;">学生信息管理系统</p>
    </div>
    
    
    <form action="${pageContext.request.contextPath }/addS" method="post">
	<div>
		<table id="page_table">
			<tr>
				<th>学生ID</th>
				<th>学生name</th>
				<th>班级名称</th>
				<th>学生年龄</th>
				<th>性别</th>
				<th>老师的ID</th>	
						
			</tr>			  
				<c:forEach items="student">
					<td><input type="text" id="id" name="id" value="<c:out value="${student.id}"></c:out>"></input></td>
					<td><input type="text" id="name"name="name" value="<c:out value="${student.name }"></c:out>"></input></td>
					<td><input type="text" id="className" name="className" value="<c:out value="${student.className}"></c:out>"></input></td>
					<td><input type="text" id="age" name="age" value="<c:out value="${student.age}"></c:out>"></input></td>
					<td><input type="text" id="sex" name="sex" value="<c:out value="${student.sex}"></c:out>"></input></td>
					<td><input type="text" id="teacherId" name="teacherId" value="<c:out value="${student.teacherId}"></c:out>"></input></td>
				</c:forEach>
                
		</table>
	</div>
	   <input type="submit" value="保存"/>  
    </form>
	<!-- 引入js -->
<script src="js/jquery.min.js"></script>
</body>

</html>