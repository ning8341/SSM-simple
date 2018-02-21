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
           <th>老师id</th>
	       <th>老师name</th>
	       <th>老师age</th>
	       <th>老师sex</th>
       </tr>
       
       <c:forEach items="${list}" var="s">
          <tr>
           <td><c:out value="${s.id}"></c:out></td>
           <td><c:out value="${s.name}"></c:out></td>
           <td><c:out value="${s.age}"></c:out></td>  
           <td><c:out value="${s.sex}"></c:out></td>         
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