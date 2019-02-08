 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html>

<head>
	<title>List DeathDetailss</title>
	
	<!-- reference our style sheet -->

	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/style.css" />

</head>

<body>


	<div id="wrapper">
		<div id="header">
			<h2>E-GRAM PANCHAYAT</h2>
		</div>
	</div>
	
	
	
	<div id="container">
	
		<div id="content">
		
			<!-- put new button: Add BirthDetails -->
		
			<input type="button" value="Add New DeathDetails"
				   onclick="window.location.href='showFormForAdd'; return false;"
				   class="add-button"
			/>
		<hr>
<h1 align="center" style="color:red;"> ${message} </h1>
<hr>
		
			<!--  add our html table here -->
		
			<table>
				<tr>
					
					<th>deathid</th>
					<th>firstname</th>
					<th>middlename</th>
					<th>lastname</th>
					<th>gender</th>
					<th>State</th>
					<th>District</th>
					<th>Taluka</th>
					<th>Village</th>
					<th>Birth Date</th>
					<th>Birth Place</th>
					<th>Death Time</th>
					<th>Death Place</th>
					<th>Death Age</th>
					
					<th>Nationality</th>
					
					<th>Reason Of Death</th>
					<th>Refered By</th>
					
					<th>Action</th>
				</tr>
				
				<!-- loop over and print our deathDetailss -->
				<c:forEach var="tempDeathDetails" items="${deathDetailss}">
				
					<!-- construct an "update" link with deathDetails id -->
					<c:url var="updateLink" value="/deathDetails/showFormForUpdate">
						<c:param name="deathDetailsId" value="${tempDeathDetails.id}" />
					</c:url>
					
					<!-- construct an "delete" link with deathDetails id -->
					<c:url var="deleteLink" value="/deathDetails/delete">
						<c:param name="deathDetailsId" value="${tempDeathDetails.id}" />
					</c:url>					
					
					<tr>
						
						<td> ${tempDeathDetails.deathid} </td>
						<td> ${tempDeathDetails.firstname} </td>
						<td> ${tempDeathDetails.middlename} </td>
						<td> ${tempDeathDetails.lastname} </td>
						<td> ${tempDeathDetails.gender} </td>
						<td> ${tempDeathDetails.state} </td>
						<td> ${tempDeathDetails.district} </td>
						<td> ${tempDeathDetails.taluka} </td>
						<td> ${tempDeathDetails.village} </td>
						<td> ${tempDeathDetails.deathdate} </td>
						<td> ${tempDeathDetails.deathplace} </td>
						<td> ${tempDeathDetails.deathtime} </td>
						
						<td> ${tempDeathDetails.nationality} </td>
						
						<td> ${tempDeathDetails.deathreason} </td>
						<td> ${tempDeathDetails.referedby} </td>
						
						<td>
							<!-- display the update link -->
							<a href="${updateLink}">Update</a>| 
							<a href="${deleteLink}"
							onclick="if (!(confirm('Are You Sure You Want To Delete this BirthDetails Details?'))) return false">Delete</a>
						</td>
						
					 
					</tr>
				
				</c:forEach>
						
			</table>
				
		</div>
	
	</div>
	
	<a href="http://localhost:8082/epanchayat/">Home Page</a>
</body>

</html>