
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html>

<html>

<head>
<title>List Students</title>

<!-- reference our style sheet -->

<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style.css" />

</head>

<body>
	<div align="center" style="color:maroon;border: groove;">
		<h1> ${message} </h1>
	</div>
	<div id="wrapper">
		<div id="header">
			<h2>IACSD Management System</h2>
		</div>
	</div>

	<div id="container">

		<div id="content">

		
			<!--  add our html table here -->

			<table>
				<tr>
					<th>Roll Number</th>
					<th>PRN Number</th>
					<th>Student Name</th>
					<th>Email</th>
					<th>Contact</th>
					<th>Course EnRolled</th>
					<th>Aggregate</th>
					<!-- <th>Password</th> -->
					<th>Degree Course</th>
					
				</tr>

				<!-- loop over and print our students -->
				<c:forEach var="tempStudent" items="${students}">

					

					<tr>
						<td>${tempStudent.rollNumber}</td>
						<td>${tempStudent.prnNumber}</td>
						<td>${tempStudent.studentName}</td>
						<td>${tempStudent.email}</td>
						<td>${tempStudent.contact}</td>
						<td>${tempStudent.course_enrolled}</td>
						<td>${tempStudent.aggregate}</td>
						<%-- <td>${tempStudent.password}</td> --%>
						<td>${tempStudent.degree_course}</td>
						


					</tr>

				</c:forEach>

			</table>

		</div>

	</div>
	<a href="http://localhost:8082/web-customer-tracker/">Home Page</a>

</body>

</html>