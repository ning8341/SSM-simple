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
    <div align="right" class="button_operation">
       <form action="${pageContext.request.contextPath }/findS" method="post">
       <input  type="text" id="name" name="name" >
       <button type="submit" >按名称查找</button>
       </form>      
    </div>
    <div align="right" class="button_operation">
       <form action="${pageContext.request.contextPath }/findS2" method="post">
       <input  type="text" id="id" name="id" >
       <button type="submit" >按id查找</button>
       </form>      
    </div>
    <div align="right" class="button_operation">
	<form action="${pageContext.request.contextPath }/insertS" method="post">
		<button type="submit">新增学生信息</button>
	</form>
   </div>
    
  
    <div id="title_context">
      <p align="right" style="font-size: 20px;font-style:inherit;">学生信息管理系统</p>
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
		</tr>  
      <c:forEach items="${pagemsg.lists}" var="student">  
        <tr>  
            <td><c:out value="${student.id}"></c:out></td>  
            <td><c:out value="${student.name }"></c:out></td>  
            <td><c:out value="${student.className}"></c:out></td>  
            <td><c:out value="${student.age}"></c:out></td>
            <td><c:out value="${student.sex}"></c:out></td>
            <td><c:out value="${student.teacherId}"></c:out></td>          
        </tr>       
    </c:forEach>
       
	</table>
	</div> 
	<div align="center" id="page_context">
	    <tr>
	<span>
	    第${requestScope.pagemsg.currPage}/${requestScope.pagemsg.totalPage}页
	</span>
	<span>总记录数：${requestScope.pagemsg.totalCount } 
	                每页显示:${requestScope.pagemsg.pageSize}
	</span>	                
	<span> 
	<c:if test="${requestScope.pagemsg.currPage != 1}">
	  <a href="${pageContext.request.contextPath }/list?currentPage=1">[首页]</a>
	  <a href="${pageContext.request.contextPath }/list?currentPage  
              =${requestScope.pagemsg.currPage-1}">[上一页]</a>
	</c:if> 
	<c:if test="${requestScope.pagemsg.currPage != requestScope.pagemsg.totalPage}">
	  <a href="${pageContext.request.contextPath }/list?currentPage=
	     ${requestScope.pagemsg.currPage+1}">[下一页]</a>
	  <a href="${pageContext.request.contextPath }/list?currentPage=
	     ${requestScope.pagemsg.totalPage}">[尾页]</a>
	</c:if>

	<%-- <input  id="choosePage" name="choosePage" value="${data }" type="text" />	
	<a href="${pageContext.request.contextPath }/list?currentPage=
	<c:out value="${choosePage}"></c:out>">
	[跳转]</a> --%>
	</span>
      </tr>
</div>
  <div class="deal_div">
  
   <a href=${pageContext.request.contextPath }/queryAll>查询所有 </a><br>
   <a href=${pageContext.request.contextPath }/queryTE>查询老师</a><br>
   <a href=${pageContext.request.contextPath }/queryT>查询老师跟学生</a><br>
   <a href=${pageContext.request.contextPath }/export>导出用户信息</a>
  </div>
<%@ include file="footer.jsp" %>
	<!-- 引入js -->
<script src="js/jquery.min.js"></script>
<script src="js/alert.js"></script>
</body>

</html>