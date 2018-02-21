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
    <p align="center">老师情况表</p>
    <table>
       <tr>
           <th>老师姓名</th>
	       <th>老师id</th>
	       <th>老师age</th>
	       <th>老师性别</th>
	       
       </tr>       
       <c:forEach items="${list}" var="s">
          <tr>
           <td><c:out value="${s.name}"></c:out></td>          
           <td><c:out value="${s.id}"></c:out></td>
           <td><c:out value="${s.age}"></c:out></td>
           <td><c:out value="${s.sex}"></c:out></td>                                    
          </tr>
          
       </c:forEach>
    </table>
    <!-- 页面不知道怎么迭代出效果 -->
    <table>
       <tr>
          <th>学生id</th>
          <th>学生名称</th>
          <th>学生课程名</th>
          <th>学生年龄</th>
          <th>学生性别</th>
          <th>学生的老师id</th>
       </tr>
       <c:forEach items="${list}" var="s">
          <tr>
            <c:forEach items="${s.student }" var="m">
             <td><c:out value="${m.id}"></c:out></td>  
             <td><c:out value="${m.name}"></c:out></td>
             <td><c:out value="${m.className}"></c:out></td>
             <td><c:out value="${m.age}"></c:out></td>
             <td><c:out value="${m.sex}"></c:out></td>
             <td><c:out value="${m.teacherId}"></c:out></td>
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