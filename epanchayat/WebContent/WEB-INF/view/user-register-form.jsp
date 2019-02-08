
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>

<title>Save User</title>
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style.css">

<title>Save User</title>
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/add-customer-style.css">
</head>
<body>
	<div id="wrapper">
		<div id="header">
			<h2>E-GRAM PANCHAYAT</h2>
		</div>
	</div>
	<div>
		<h3>Save User Details</h3>

		<hr>
		<h1 align="center" style="color: red;">${message}</h1>
		<hr>
		<form:form action="saveUser" modelAttribute="user" method="POST">
			<!-- need to associate this data with User Id -->
			<form:hidden path="id" />

			<table align="center">
				<tbody>
					<tr>
						<td><label>First Name:</label></td>
						<td><form:input path="firstname" /></td>
					</tr>
					<tr>
						<td><label>Middle Name:</label></td>
						<td><form:input path="middlename" /></td>
					</tr>
					<tr>
						<td><label>Last Name:</label></td>
						<td><form:input path="lastname" /></td>
					</tr>
					<tr>
						<td><label>DOB:</label></td>
						<td><form:input path="dob" type="date" /></td>
					</tr>

					<tr>
						<td><label>Email:</label></td>
						<td><form:input path="email" type="email" /></td>
					</tr>
					<tr>
						<td><label>Address:</label></td>
						<td><form:input path="address" /></td>
					</tr>
					<tr>
						<td><label>State:</label></td>
						<td><form:input path="state" /></td>
					</tr>
					<tr>
						<td><label>Taluka:</label></td>
						<td><form:input path="taluka" /></td>
					</tr>
					<tr>
						<td><label>District:</label></td>
						<td><form:input path="district" /></td>
					</tr>
					<tr>
						<td><label>Pin Code:</label></td>
						<td><form:input path="pincode" type="number" /></td>
					</tr>
					<tr>
						<td><label>Username:</label></td>
						<td><form:input path="username" /></td>
					</tr>


					<tr>
						<td><label>Password:</label></td>
						<td><form:input path="password" type="password" /></td>
					</tr>


				</tbody>

			</table>
			<center>
				<input type="submit" value="Save" class="save" />
			</center>
		</form:form>
		<!--  <center><input  type="submit" value="Save" class="save"/> </center> -->
		<div style=""></div>

		<a href="http://localhost:8082/epanchayat/">Home Page</a>
	</div>

</body>


</html>