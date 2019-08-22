<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="JobPortal.Bean.Employee"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Profile</title>
<style>
body {font-family: Arial, Helvetica, sans-serif;}
* {box-sizing: border-box}
/* Full-width input fields */
input[type=text], input[type=password] {
  width: 100%;
  padding: 15px;
  margin: 5px 0 22px 0;
  display: inline-block;
  border: none;
  background: #f1f1f1;
}
input[type=text]:focus, input[type=password]:focus {
  background-color: #ddd;
  outline: none;
}
hr {
  border: 1px solid #f1f1f1;
  margin-bottom: 25px;
}
/* Set a style for all buttons */
button {
  background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 50%;
  opacity: 0.9;
}
button:hover {
  opacity:1;
}
/* Extra styles for the cancel button */
.cancelbtn {
  padding: 14px 20px;
  background-color: #f44336;
}

/* Add padding to container elements */
.container {
  padding: 16px;
}
/* Clear floats */

/* Change styles for cancel button and signup button on extra small screens */
/*@media screen and (max-width: 300px) {*/
  .cancelbtn, .signupbtn {
     width: 15%;
     align:center;
     
/*  }*/
}
</style>
</head>

<% Employee e=(Employee)request.getAttribute("UpdatedEmpObj"); %>


<body>
<form action="UpdateUserValues" METHOD="post" style="border:1px solid #ccc">
  <div class="container">
    <h1>Update User</h1>
    <p>Please fill in this form to update your account.</p>
    <hr>

    <label ><b>Email</b></label>
    <input type="text" name="mail" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$"  value="<%=session.getAttribute("username")%>" readonly>

    
    <label for=" "><b>First name</b></label>
    <input type="text" placeholder="Enter First Name" name="firstName" value="<%=e.getFname() %>" required>
    
    <label for="email"><b>Last name:</b></label>
    <input type="text" placeholder="Enter Last Name" name="lastName" value="<%=e.getLname() %>" required>
    
    <label for="email"><b>Desired UserName:</b></label>
    <input type="text" placeholder="Enter UserName" name="userName" value="<%=e.getUsername() %>"  required>
    
    <label for="psw"><b>Password</b></label>
    <input type="text" placeholder="Enter Password" name="passwd"  pattern=".{6,}" value="<%=e.getPassword() %>" required>

   <!--   <label for="psw-repeat"><b>Repeat Password</b></label>
    <input type="password" placeholder="Repeat Password" name="psw-repeat" pattern=".{6,}"  required> -->
    
    <label for="Gender"><b>Gender</b> </label>
    <input name="gender" type="radio" value="m" onFocus="hintEvent('GENDER1');" onBlur="hintEvent('GENDER1', 'HIDE');">Male&nbsp;&nbsp;&nbsp; 
    <input name="gender" type="radio" value="f" onFocus="hintEvent('GENDER1');" onBlur="hintEvent('GENDER1', 'HIDE');"> Female
    <input name="gender" type="radio" value="others" onFocus="hintEvent('GENDER1');" onBlur="hintEvent('GENDER1', 'HIDE');"> Others 
    <br>
    <br>
    <label for="email"><b>Mobile Number</b></label>
    <input type="text" placeholder="Enter Mobile Number" name="mobilenum" value="<%=e.getMobilenum() %>" required>
   <br>
   <br>	
    <label><b>Total experience</b></label>
    <input type="text" placeholder="enter Expirence/Fresher" name="expirence" value="<%=e.getExperience() %>" >
    
    <label><b>Current Role</b> </label>
     <input type="text" placeholder="enter Fresher/Designation Name" name="currentRole" value="<%=e.getCurrentrole() %>">
		
		 <label><b>Company Working</b> </label>
     <input type="text" placeholder="enter Commpany" name="company" value="<%=e.getCompany() %>" >								
										
										
	<label for="skill"><b>KeySkills</b></label>
    <input type="text" placeholder="Enter Key Skills" name="keySkills" value="<%=e.getTechnicalskills() %>"required>
   
    
  

    <div class="clearfix" align="center">
    <!--   <p>By creating an account you agree to our <a href="#" style="color:dodgerblue">Terms & Privacy</a>.</p> -->
     
      <button type="submit" class="signupbtn">Update </button>
    </div>
  </div>
</form>


</body>
</html>