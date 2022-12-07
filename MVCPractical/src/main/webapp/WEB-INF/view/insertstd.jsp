<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
body {
	background-color: olive;
}
input[type=text],input[type=password], select {
  width: 50%;
  padding: 10px 10px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 2px;
  box-sizing: border-box;
}

input[type=submit] {
  width: 20%;
  background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  border-radius: 2px;
  cursor: pointer;
}

input[type=submit]:hover {
  background-color: #45a049;
}

div {
  border-radius: 1px;
  background-color: #f2f2f2;
  padding: 20px;
}

</style>
</head>
<body>
<div>
<form action="insertdata">

    <label for="exampleInputEmail1" class="form-label">Enter Student ID</label>&nbsp;&nbsp;&nbsp;
    <input type="text" name="sid"  aria-describedby="emailHelp">
 
  <br/>
 
    <label for="exampleInputEmail1" class="form-label">Enter Student Name</label>&nbsp;&nbsp;&nbsp;
    <input type="text" name="suname"  aria-describedby="emailHelp">
 
    
  <br/>
  
 
    <label for="exampleInputPassword1" class="form-label">Enter Student Password</label>&nbsp;&nbsp;&nbsp;
    <input type="password" name="spwd">
  
<br/>


    <label for="exampleInputEmail1" class="form-label">Enter Student UserName</label>&nbsp;&nbsp;&nbsp;
    <input type="text" name="sname"  aria-describedby="emailHelp">
 
  <br/>
   <input type="submit" value="submit"/>
</form>
</div>
</body>
</html>