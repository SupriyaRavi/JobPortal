<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="JobPortal.Bean.Company"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Profile</title>
<style>    
body {
	background-image: url("https://www.containerstore.com/catalogimages/336086/EL_12_freestanding_elfa_office_V2_R1.jpg?width=1200&height=1200&align=center");
		height: 110%; 
}
#signup {
	padding-top: 50px;
}
h1, p {
	text-align: center;
	color:    #ff9999;
	font-size: 40px;
	
}
h1 {
	font-family: 'Titillium Web', sans-serif;
	font-size: 60px;
	line-height: 10px;
}
p {
	font-family:'Open Sans', sans-serif;
}
#container {
	width: 400px;
	height: 500px;
	background-color: #7F7979;
	margin: auto;
	border-radius: 10px;
}
form {
	width: 100%;
	display: inline-block;
	text-align: center;
	padding-top: 15px;
}
input {
	width: 75%;
	padding: 15px;
	margin: 8px 0;
	border-radius: 5px;
}
input[type=submit] {
	width: 50%;
	background-color: #ff9999;
	border: none;
	color: #1a1a1a;
}
</style>
</head>
<body>
<h1>Update</h1>
<br>
<%
Company c=(Company)request.getAttribute("UpdatedCompObj");
%>
<div id="container">
	<form action="UpdateCompanyValues" method="post">
			<input type="email" placeholder="E-mail Id" name="mail"  pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$"  value="<%=session.getAttribute("companyMail")%>" readonly><br />
			<input type="text" placeholder="Company Name" name="username"  value="<%=c.getCname() %>" required><br />
			<input type="text" placeholder="Web-Address" name="web" value="<%=c.getWebsite() %>" required><br />
			<input type="password" placeholder="Password" name=passwd pattern=".{6,}" value="<%=c.getPassword() %>" required><br />
			<input type="text" placeholder="contact-Person" name=contactPerson value="<%=c.getContactPerson() %>" required><br />
			<input type="text" placeholder="Contact-Person-Number" name=contactNumber  value="<%=c.getContactPersonNumber() %>" required><br />
			<input type="submit" value="update">
	</form>
</div>
</div>
</body>
</html>