<%@page import="java.util.Scanner"%>
<%@page import="com.model.Questions"%>
<%@page import="com.model.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
body {
	background-color: olive;
}

</style>
</head>
<body>
<form>
<h2><center>Multiple Choice Question</center></h2>
<!--  if(request.getParameter("opt")!=null) {
		if(count<=2 && count==0){
		out.println("<center><h2 style='color: blue;'>Exam Finished</h2></center>");
		out.println("<center><h3 style='color: blue;'>Your Score is:"+count+"of 10</h3></center>");
		out.println("<center><h3 style='color: red;'>You Are Failed Kindly try again</h3></center>");
		out.println("<center><h3 style='color: blue;'><h3>THank YOU!!!</h3></center>");
 }else {
	 	out.println("<center><h2 style='color: blue;'>Exam Finished</h2></center>");
	 	out.println("<center><h3 style='color: blue;'>Your Score is:"+count+"of 10</h3></center>");
	 	out.println("<center><h3 style='color: green;'>Successfully Passed Exam</h3></center>");
	 	out.println("<center><h3 style='color: blue;'>THank YOU!!!</h3></center>");
}
	}-->
<%
	
	List<Questions> qsDetails=(List<Questions>)request.getAttribute("questions");


	Scanner input = new Scanner(System.in);
	int count=0;
	String correct;
	
	for(Questions allstdq:qsDetails) {
	
	out.println("<i style= 'font-size:20px;font-family:arial;'>"+allstdq.getQues()+"</i><br/>");
	out.println("<br/>");
	out.println("<i style= 'font-size:20px;font-family:arial;'>"+allstdq.getA()+"</i><br/>");
	out.println("<i style= 'font-size:20px;font-family:arial;'>"+allstdq.getB()+"</i><br/>");
	out.println("<i style= 'font-size:20px;font-family:arial;'>"+allstdq.getC()+"</i><br/>");
	out.println("<i style= 'font-size:20px;font-family:arial;'>"+allstdq.getD()+"</i><br/>");
	
	correct=allstdq.getCorrect();
	out.println("<br/>");
	out.println("<i style= 'font-size:15px;font-family:arial;color:white'>Enter Correct Option:</i><br/>");
	
	
	out.println("<input type='text' name='opt' style= 'font-size:20px;'/>");
	out.println("<br/>");
	out.println("<br/>");
	out.println("<br/>");
	String a=request.getParameter("opt");
	
	 if(correct.equals(a) ) {
		count++;
	}

	
 
	
}
	
	out.println(count);
	request.setAttribute("ncount", count);
	int c=count;
	//out.println("<input type='hidden' name='countsend' value='"+count+"'/>");
	%>
	
	<%
	if(request.getParameter("opt")!=null) {
		if(count<=2 && count==0){
		out.println("<center><h2 style='color: blue;'>Exam Finished</h2></center>");
		out.println("<center><h3 style='color: blue;'>Your Score is:"+count+"of 10</h3></center>");
		out.println("<center><h3 style='color: red;'>You Are Failed Kindly try again</h3></center>");
		out.println("<center><h3 style='color: blue;'><h3>THank YOU!!!</h3></center>");
 }else {
	 	out.println("<center><h2 style='color: blue;'>Exam Finished</h2></center>");
	 	out.println("<center><h3 style='color: blue;'>Your Score is:"+count+"of 10</h3></center>");
	 	out.println("<center><h3 style='color: green;'>Successfully Passed Exam</h3></center>");
	 	out.println("<center><h3 style='color: blue;'>THank YOU!!!</h3></center>");
}
	}
	out.println("<input type='submit' style= 'font-size:25px;margin-left:800px;width: 30%;padding: 10px 20px;cursor: pointer;background-color: #4CAF50;border-radius: 2px;color: white;' value='submit exam'/>");
	
	%>	
	

	<!--  <input type="hidden" name="countsend" value="<%=count%>"/>-->
	





</form>
</body>
</html>