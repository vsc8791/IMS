 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html>

<head>
	<title>List BirthDetailss</title>
	
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
		
			<input type="button" value="Add New BirthDetails"
				   onclick="window.location.href='showFormForAdd'; return false;"
				   class="add-button"
			/>
		<hr>
<h1 align="center" style="color:red;"> ${message} </h1>
<hr>
		
			<!--  add our html table here -->
		
			<table>
				<tr>
					<th>certificate_type</th>
					<th>birthid</th>
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
					<th>Birth Time</th>
					<th>Birth Place</th>
					<th>Birth Time</th>
					<th>Father Name</th>
					<th>Father Nationality</th>
					<th>Father Addhaar	</th>
					<th>Father Age</th>
					<th>Mother Name</th>
					<th>Mother Addhaar</th>
					<th>Mother Nationality</th>
					<th>Mother Age</th>
					<th>Refered By</th>
					
					<th>Action</th>
				</tr>
				
				<!-- loop over and print our birthDetailss -->
				<c:forEach var="tempBirthDetails" items="${birthDetailss}">
				
					<!-- construct an "update" link with birthDetails id -->
					<c:url var="updateLink" value="/birthDetails/showFormForUpdate">
						<c:param name="birthDetailsId" value="${tempBirthDetails.id}" />
					</c:url>
					
					<!-- construct an "delete" link with birthDetails id -->
					<c:url var="deleteLink" value="/birthDetails/delete">
						<c:param name="birthDetailsId" value="${tempBirthDetails.id}" />
					</c:url>					
					
					<tr>
						<td> ${tempBirthDetails.certificate_type} </td>
						<td> ${tempBirthDetails.birthid} </td>
						<td> ${tempBirthDetails.firstname} </td>
						<td> ${tempBirthDetails.middlename} </td>
						<td> ${tempBirthDetails.lastname} </td>
						<td> ${tempBirthDetails.gender} </td>
						<td> ${tempBirthDetails.state} </td>
						<td> ${tempBirthDetails.district} </td>
						<td> ${tempBirthDetails.taluka} </td>
						<td> ${tempBirthDetails.village} </td>
						<td> ${tempBirthDetails.birthdate} </td>
						<td> ${tempBirthDetails.birthplace} </td>
						<td> ${tempBirthDetails.birthtime} </td>
						<td> ${tempBirthDetails.fathername} </td>
						<td> ${tempBirthDetails.fathernationality} </td>
						<td> ${tempBirthDetails.fadhaar} </td>
						<td> ${tempBirthDetails.mothername} </td>
						<td> ${tempBirthDetails.madhaar} </td>
						<td> ${tempBirthDetails.mothernationality} </td>
						<td> ${tempBirthDetails.mage} </td>
						<td> ${tempBirthDetails.referedby} </td>
						
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