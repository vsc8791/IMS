 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html>

<head>
	<title>List Students</title>
	
	<!-- reference our style sheet -->

	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/style.css" />

</head>

<body>


	<div id="wrapper">
		<div id="header">
			<h2>IACSD Management System</h2>
		</div>
	</div>
	
	
	
	<div id="container">
	
		<div id="content">
		
			<!-- put new button: Add Student -->
		
			<input type="button" value="Add New Student"
				   onclick="window.location.href='showFormForAdd'; return false;"
				   class="add-button"
			/>
		<hr>
<h1 align="center" style="color:red;"> ${message} </h1>
<hr>
		
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
					<th>Password</th>
					<th>Degree Course</th>
					<th>Action</th>
				</tr>
				
				<!-- loop over and print our students -->
				<c:forEach var="tempStudent" items="${students}">
				
					<!-- construct an "update" link with student id -->
					<c:url var="updateLink" value="/student/showFormForUpdate">
						<c:param name="studentId" value="${tempStudent.id}" />
					</c:url>
					
					<!-- construct an "delete" link with student id -->
					<c:url var="deleteLink" value="/student/delete">
						<c:param name="studentId" value="${tempStudent.id}" />
					</c:url>					
					
					<tr>
						<td> ${tempStudent.rollNumber} </td>
						<td> ${tempStudent.prnNumber} </td>
						<td> ${tempStudent.studentName} </td>
						<td> ${tempStudent.email} </td>
						<td> ${tempStudent.contact} </td>
						<td> ${tempStudent.course_enrolled} </td>
						<td> ${tempStudent.aggregate} </td>
						<td> ${tempStudent.password} </td>
						<td> ${tempStudent.degree_course} </td>
						<td>
							<!-- display the update link -->
							<a href="${updateLink}">Update</a>| 
							<a href="${deleteLink}"
							onclick="if (!(confirm('Are You Sure You Want To Delete this Student Details?'))) return false">Delete</a>
						</td>
						
					 
					</tr>
				
				</c:forEach>
						
			</table>
				
		</div>
	
	</div>
	
	<a href="http://localhost:8082/web-customer-tracker/">Home Page</a>
</body>

</html>