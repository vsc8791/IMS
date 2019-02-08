 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html>

<head>
	<title>List Schedule</title>
	
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
		
			<!-- put new button: Add Schedule -->
		
			<input type="button" value="Add New Schedule"
				   onclick="window.location.href='showFormForAdd'; return false;"
				   class="add-button"
			/>
		<hr>
<h1 align="center" style="color:red;"> ${message} </h1>
<hr>
		
			<!--  add our html table here -->
		
			<table>
				<tr>
					<th>Date Of Lecture</th>
					<th>Day of Lecture</th>
					<th>Subject</th>
					<th>Faculty Name</th>
					<th>Type of Lecture</th>
					<th>Time of Lecture</th>
					
				
					
					<th>Action</th>
				</tr>
				
				<!-- loop over and print our students -->
				<c:forEach var="tempSchedule" items="${schedules}">
				
					<!-- construct an "update" link with student id -->
					<c:url var="updateLink" value="/schedule/showFormForUpdate">
						<c:param name="scheduleId" value="${tempSchedule.id}" />
					</c:url>
					
					<!-- construct an "delete" link with student id -->
					<c:url var="deleteLink" value="/schedule/delete">
						<c:param name="scheduleId" value="${tempSchedule.id}" />
					</c:url>					
					
					<tr>
						<td> ${tempSchedule.date_of_lecture} </td>
						<td> ${tempSchedule.day_of_lecture} </td>
						<td> ${tempSchedule.subject} </td>
						<td> ${tempSchedule.faculty_teaches} </td>
						<td> ${tempSchedule.type_of_lec} </td>
						<td> ${tempSchedule.compulsory} </td>
						
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