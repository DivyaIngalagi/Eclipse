<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
<%@include file="/WEB-INF/view/common.jsp" %>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>>/WEB-INF/css-pages/style.css"/>
<style>

body {
	background-color: olive;
}

.all{
	font-family: cursive;
	
}
.all1 {
  background-color: #223094;
  color: white;
  padding: 15px 25px;
  margin:1px;
  text-decoration: none;
}
.all1:hover {
  background-color: #223094;
  color: white;
  padding: 15px 25px;
  margin:15px;
  text-decoration: none;
}
</style>

</head>
<body>

<h3 class="all">WELCOME TO EXAMINATION APPLICATION</h3>
<div class="navbar">
<nav class="navbar navbar-dark bg-primary">
  <a class="all1" aria-current="page" href="checkadmins">ADMIN</a>
  <a class="all1" href="studentcheck">STUDENT</a>
</nav>
</div>
</body>
</html>