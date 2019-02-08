 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html>

<head>
	<title>List Users</title>
	
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
		
			<!-- put new button: Add User -->
		
			<input type="button" value="Add New User"
				   onclick="window.location.href='showFormForAdd'; return false;"
				   class="add-button"
			/>
		<hr>
<h1 align="center" style="color:red;"> ${message} </h1>
<hr>
		
			<!--  add our html table here -->
		
			<table>
				<tr>
					<th>First Name</th>
					<th>Middle Name</th>
					<th>Last Name</th>
					<th>Date Of Birth</th>
					<th>Email</th>
					<th>Address</th>
					<th>State</th>
					<th>Taluka</th>
					<th>District</th>
					<th>Pincode</th>
					
					
					<th>User Name</th>
					<th>Password</th>
				
					<th>Action</th>
				</tr>
				
				<!-- loop over and print our users -->
				<c:forEach var="tempUser" items="${users}">
				
					<!-- construct an "update" link with user id -->
					<c:url var="updateLink" value="/user/showFormForUpdate">
						<c:param name="userId" value="${tempUser.id}" />
					</c:url>
					
					<!-- construct an "delete" link with user id -->
					<c:url var="deleteLink" value="/user/delete">
						<c:param name="userId" value="${tempUser.id}" />
					</c:url>					
					
					<tr>
						<td> ${tempUser.firstname} </td>
						<td> ${tempUser.middlename} </td>
						<td> ${tempUser.lastname} </td>
						<td> ${tempUser.dob} </td>
						<td> ${tempUser.email} </td>
						<td> ${tempUser.address} </td>
						<td> ${tempUser.state} </td>
						<td> ${tempUser.taluka} </td>
						<td> ${tempUser.district} </td>
						<td> ${tempUser.pincode} </td>
						<td> ${tempUser.username} </td>
						<td> ${tempUser.password} </td>
						
						<td>
							<!-- display the update link -->
							<a href="${updateLink}">Update</a>| 
							<a href="${deleteLink}"
							onclick="if (!(confirm('Are You Sure You Want To Delete this User Details?'))) return false">Delete</a>
						</td>
						
					 
					</tr>
				
				</c:forEach>
						
			</table>
				
		</div>
	
	</div>
	
	<a href="http://localhost:8082/epanchayat/">Home Page</a>
</body>

</html>