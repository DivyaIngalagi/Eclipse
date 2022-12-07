<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="<c:url value="/WEB-INF/csspages/style.css"/>"> 
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
  padding:3px;
  margin:0px;
  text-decoration: none;
}
.all1:hover {
  background-color: #223094;
  color: white;

  text-decoration: none;
}
</style>
</head>
<body>
<h2 class="all">WELCOME TO ADMIN PANEL</h2>
<nav class="navbar navbar-dark bg-primary">
  <a class="all1" aria-current="page" href="insertqust">Add Question</a>
  <a class="all1" href="updatequst">Update Question</a>
  <a class="all1" href="deletequst">Delete Question</a>
  <a class="all1" href="insertst">Add Student</a>
  <a class="all1" href="updatest">Update Student</a>
  <a class="all1" href="deletest">Delete Student</a>
  <a class="all1" href="selectstid">Get Single Students Details</a>
  <a class="all1" href="showAllStudent">Can get all Students Details</a>
</nav>
</body>
</html>