 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html>

<head>
	<title>List Facultys</title>
	
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
		
			<!-- put new button: Add Faculty -->
		
			<input type="button" value="Add New Faculty"
				   onclick="window.location.href='showFormForAdd'; return false;"
				   class="add-button"
			/>
		<hr>
<h1 align="center" style="color:red;"> ${message} </h1>
<hr>
		
			<!--  add our html table here -->
		
			<table>
				<tr>
					<th>Faculty Name</th>
					<th>Specialization</th>
					<th>Experience</th>
					<th>Email</th>
					<th>Contact</th>
					<th>User Name</th>
					<!--<th>Aggregate</th>-->
					<th>Password</th>
					
					<th>Action</th>
				</tr>
				
				<!-- loop over and print our students -->
				<c:forEach var="tempFaculty" items="${facultys}">
				
					<!-- construct an "update" link with student id -->
					<c:url var="updateLink" value="/faculty/showFormForUpdate">
						<c:param name="facultyId" value="${tempFaculty.id}" />
					</c:url>
					
					<!-- construct an "delete" link with student id -->
					<c:url var="deleteLink" value="/faculty/delete">
						<c:param name="facultyId" value="${tempFaculty.id}" />
					</c:url>					
					
					<tr>
						<td> ${tempFaculty.facultyName} </td>
						<td> ${tempFaculty.specialization} </td>
						<td> ${tempFaculty.experience} </td>
						<td> ${tempFaculty.email} </td>
						<td> ${tempFaculty.contact} </td>
						<td> ${tempFaculty.username} </td>
						
						<td> ${tempFaculty.password} </td>
						
						<td>
							<!-- display the update link -->
							<a href="${updateLink}">Update</a>| 
							<a href="${deleteLink}"
							onclick="if (!(confirm('Are You Sure You Want To Delete this Faculty Details?'))) return false">Delete</a>
						</td>
						
					 
					</tr>
				
				</c:forEach>
						
			</table>
				
		</div>
	
	</div>
		<a href="http://localhost:8082/web-customer-tracker/">Home Page</a>

</body>

</html>