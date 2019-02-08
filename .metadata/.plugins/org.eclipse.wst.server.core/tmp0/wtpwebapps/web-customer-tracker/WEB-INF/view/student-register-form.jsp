 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>

<title>Save Student</title>
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style.css">

<title>Save Student</title>
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
		<h3>Save Student Details</h3>
		
		
<hr>
<h1 align="center" style="color:red;"> ${message} </h1>
<hr>
		<form:form action="saveStudentRegistration" modelAttribute="student"
			method="POST">
			<!-- need to associate this data with Student Id -->
			<form:hidden path="id"/>
			
			<table align="center">
				<tbody>
					<tr>
						<td><label>Roll Number:</label></td>
						<td><form:input path="rollNumber" type="number" /></td>
					</tr>
					<tr>
						<td><label>PRN Number:</label></td>
						<td><form:input path="prnNumber" type="number"/></td>
					</tr>
					<tr>
						<td><label>Student Name:</label></td>
						<td><form:input path="studentName" /></td>
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
						<td><label>Course EnRolled:</label></td>
						<td><form:input path="course_enrolled" /></td>
					</tr>
					<tr>
						<td><label>Aggregate:</label></td>
						<td><form:input path="aggregate"/></td>
					</tr>
					<tr>
						<td><label>Password:</label></td>
						<td><form:input path="password" type="password" /></td>
					</tr>
					<tr>
						<td><label>Degree Course:</label></td>
						<td><form:input path="degree_course"/></td>
					</tr>
					
				</tbody>
			</table>						
					<center><input  type="submit" value="Save" class="save" /></center>						
		</form:form>		
</div>
<a href="http://localhost:8082/web-customer-tracker/">Home Page</a>

</body>

</html>