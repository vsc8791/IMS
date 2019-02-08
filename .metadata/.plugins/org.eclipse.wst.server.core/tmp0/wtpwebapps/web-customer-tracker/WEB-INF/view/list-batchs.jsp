 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html>

<head>
	<title>List Batchs</title>
	
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
		
			<!-- put new button: Add Batch -->
		
			<input type="button" value="Add New Batch"
				   onclick="window.location.href='showFormForAdd'; return false;"
				   class="add-button"
			/>
		<hr>
<h1 align="center" style="color:red;"> ${message} </h1>
<hr>
		
			<!--  add our html table here -->
		
			<table>
				<tr>
					<th>Batch Name</th>
					<th>Batch Year</th>
					<th>Number Of Students</th>
					<th>Status</th>
					<th>Placement %</th>
					
					<th>Action</th>
				</tr>
				
				<!-- loop over and print our students -->
				<c:forEach var="tempBatch" items="${batchs}">
				
					<!-- construct an "update" link with student id -->
					<c:url var="updateLink" value="/batch/showFormForUpdate">
						<c:param name="batchId" value="${tempBatch.id}" />
					</c:url>
					
					<!-- construct an "delete" link with student id -->
					<c:url var="deleteLink" value="/batch/delete">
						<c:param name="batchId" value="${tempBatch.id}" />
					</c:url>					
					
					<tr>
						<td> ${tempBatch.batchName} </td>
						<td> ${tempBatch.batchYear} </td>
						<td> ${tempBatch.no_of_students} </td>
						<td> ${tempBatch.status} </td>
						<td> ${tempBatch.placement_percentage} </td>
						
						<td>
							<!-- display the update link -->
							<a href="${updateLink}">Update</a>| 
							<a href="${deleteLink}"
							onclick="if (!(confirm('Are You Sure You Want To Delete this Batch Details?'))) return false">Delete</a>
						</td>
						
					 
					</tr>
				
				</c:forEach>
						
			</table>
				
		</div>
	
	</div>
	
	<a href="http://localhost:8082/web-customer-tracker/">Home Page</a>
</body>

</html>