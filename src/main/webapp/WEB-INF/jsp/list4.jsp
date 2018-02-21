<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<!-- CSS -->
<link href="css/table.css" rel="stylesheet"> 
</head>
<body>
    <table id="page_table">
	<tr>
			<th>学生ID</th>
			<th>学生name</th>
			<th>班级名称</th>
			<th>学生年龄</th>
			<th>性别</th>
			<th>老师的ID</th>
			<th>课程id</th>
			<th>课程名称</th>
		</tr>  
      <c:forEach items="${list}" var="student">  
        <tr>  
            <td><c:out value="${student.id}"></c:out></td>  
            <td><c:out value="${student.name }"></c:out></td>  
            <td><c:out value="${student.className}"></c:out></td>  
            <td><c:out value="${student.age}"></c:out></td>
            <td><c:out value="${student.sex}"></c:out></td>
            <td><c:out value="${student.teacherId}"></c:out></td>
            
            
            <c:forEach items="${student.course }" var="course">
            <td id="course_id"><c:out value="${course.id }"></c:out></td>
            <td id="course_courseName"><c:out value="${course.courseName}"></c:out></td>
            </c:forEach>  
                            
        </tr>       
    </c:forEach>
       
	</table>
    
    
  <%@ include file="footer.jsp" %>   
	<!-- 引入js -->
<script src="js/jquery.min.js"></script>
<script src="js/bootstrap.min.js"></script>  
<script src="js/file.js"></script>    
</body>
</html>