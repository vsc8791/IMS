 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html>

<head>
	<title>Results</title>
	
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
		
			<!-- put new button: Add Result -->
		
			<input type="button" value="Add New Result"
				   onclick="window.location.href='showFormForAdd'; return false;"
				   class="add-button"
			/>
		<hr>
<h1 align="center" style="color:red;"> ${message} </h1>
<hr>
		
			<!--  add our html table here -->
		
			<table>
				<tr>
					<th>Result Date</th>
					<th>Result Subject</th>
					<th>Result Status</th>
					<th>Student Name</th>
					<th>Obtained Marks</th>
					<th>Total Marks</th>
					<th>Result Type</th>
					
					<th>Action</th>
				</tr>
				
				<!-- loop over and print our students -->
				<c:forEach var="tempResult" items="${results}">
				
					<!-- construct an "update" link with student id -->
					<c:url var="updateLink" value="/result/showFormForUpdate">
						<c:param name="resultId" value="${tempResult.id}" />
					</c:url>
					
					<!-- construct an "delete" link with student id -->
					<c:url var="deleteLink" value="/result/delete">
						<c:param name="resultId" value="${tempResult.id}" />
					</c:url>					
					
					<tr>
						<td> ${tempResult.resultName} </td>
						<td> ${tempResult.result_subject} </td>
						<td> ${tempResult.result_status} </td>
						<td> ${tempResult.result_description} </td>
						<td> ${tempResult.passing_marks} </td>
						<td> ${tempResult.total_marks} </td>
						<td> ${tempResult.result_type} </td>
						
						<td>
							<!-- display the update link -->
							<a href="${updateLink}">Update</a>| 
							<a href="${deleteLink}"
							onclick="if (!(confirm('Are You Sure You Want To Delete this Results?'))) return false">Delete</a>
						</td>
						
					 
					</tr>
				
				</c:forEach>
						
			</table>
				
		</div>
	
	</div>
	
	<a href="http://localhost:8082/web-customer-tracker/">Home Page</a>
</body>

</html>