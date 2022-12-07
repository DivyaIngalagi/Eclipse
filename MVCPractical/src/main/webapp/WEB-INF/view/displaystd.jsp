<%@page import="com.model.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<style type="text/css">
body {
	background-color: olive;
}
</style>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>STUDENTS DETAILS: </h1>
	
	
	<%
	
	List<Student> stdDetails=(List<Student>)request.getAttribute("allStudentList");
	%>
	
	<%
	for(Student s:stdDetails){
		out.println("<br/>");
		out.println("=========================");
		out.println("<br/>");
		out.println("Student ID is:"+s.getSid());
		out.println("<br/>");
		out.println("Student UserName is:"+s.getUsername());
		out.println("<br/>");
		out.println("Student Password is:"+s.getPassword());
		out.println("<br/>");
		out.println("Student Name is:"+s.getName());
		
	}
	
	
	%>
	
	
	
</body>
</html>