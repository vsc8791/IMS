 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>

<title>Save Faculty</title>
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style.css">

<title>Save Faculty</title>
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/add-customer-style.css">
</head>
<body>
	<div id="wrapper">
		<div id="header">
			<h2>IACSD Management System</h2>
		</div>
	</div>
	<div>
		<h3>Save Faculty Details</h3>
		<hr>
<h1 align="center" style="color:red;"> ${message} </h1>
<hr>
		<form:form action="saveFacultyRegistration" modelAttribute="faculty"
			method="POST">
			<!-- need to associate this data with Faculty Id -->
			<form:hidden path="id"/>
			
			<table align="center">
				<tbody>
					<tr>
						<td><label>Faculty Name:</label></td>
							<td><form:input path="facultyName" /></td>
					</tr>
					<tr>
						<td><label>Specialization:</label></td>
						<td><form:input path="specialization" /></td>
					</tr>
					<tr>
						<td><label>Experience:</label></td>
						<td><form:input path="experience" /></td>
					</tr>
					<tr>
						<td><label>Email:</label></td>
						<td><form:input path="email" type="email"/></td>
					</tr>
					<tr>
						<td><label>Contact:</label></td>
						<td><form:input path="contact" /></td>
					</tr>
					<tr>
						<td><label>UserName:</label></td>
						<td><form:input path="username" /></td>
					</tr>
					
					<tr>
						<td><label>Password:</label></td>
						<td><form:input path="password" type="password" /></td>
					</tr>
					
				</tbody>
				 
			</table>
			<center><input  type="submit" value="Save" class="save" /></center>	
		</form:form>
		<!--  <center><input  type="submit" value="Save" class="save"/> </center> -->
		<div style="clear;both;"></div>
		<a href="http://localhost:8082/web-customer-tracker/">Home Page</a>
	</div>
           
</body>


</html>