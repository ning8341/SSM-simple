<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
 <title>董维宁-个人网站</title>
    <!-- CSS -->
     <link href="css/bootstrap.css" rel="stylesheet">
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
		<table id="page_table" value=${student }>
			<tr>
				<th>学生ID</th>
				<th>学生name</th>
				<th>班级名称</th>
				<th>学生年龄</th>
				<th>性别</th>
				<th>老师的ID</th>
				
			</tr>
			    <tr >
			       <td><input value=${student.id }></td>
			       <td><input value=${student.name }></td>
			       <td><input value=${student.className }></td>
			       <td><input value=${student.age }></td>
			       <td><input value=${student.sex }></td>
			       <td><input value=${student.teacherId }></td>
			       
			    </tr>

		</table>
	</div>
<%@ include file="footer.jsp" %>    
	<!-- 引入js -->
<script src="js/jquery.min.js"></script>

</body>

</html>