 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>

<title>Save Customer</title>
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style.css">

<title>Save Customer</title>
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/add-customer-style.css">
</head>
<body>
	<div id="wrapper">
		<div id="header">
			<h2>Online Customer Store</h2>
		</div>
	</div>
	<div>
		<h3>Save Customer Details</h3>
		
		<h1 align="center" style="color:red">${message}</h1>
		<form:form action="saveCustomerRegistration" modelAttribute="customer"
			method="POST">
			<!-- need to associate this data with Customer Id -->
			<form:hidden path="id"/>
			
			<table align="center">
				<tbody>
					
					<tr>
						<td><label>First Name:</label></td>
						<td><form:input path="firstname" /></td>
					</tr>
					
					<tr>
						<td><label>Last Name:</label></td>
						<td><form:input path="lastname" /></td>
					</tr>
					
					<tr>
						<td><label>Email:</label></td>
						<td><form:input path="email" type="email" /></td>
					</tr>
					
					
					<tr>
						<td><label>Username:</label></td>
						<td><form:input path="username"/></td>
					</tr>
					<tr>
						<td><label>Password:</label></td>
						<td><form:input path="password" type="password" /></td>
					</tr>
					<tr>
						<td><label>State:</label></td>
						<td><form:input path="state" /></td>
					</tr>
					<tr>
						<td><label>City:</label></td>
						<td><form:input path="city"/></td>
					</tr>
					
					<tr>
						<td><label>PinCode:</label></td>
						<td><form:input path="pincode"  type="number"/></td>
					</tr>
					
				</tbody>
				 
			</table>
			<center><input  type="submit" value="Save" class="save" /></center>	
		</form:form>
		<!--  <center><input  type="submit" value="Save" class="save"/> </center> -->
		<div style="clear;both;"></div>
	
			<a href="http://localhost:8082/onlinebookstore/">Home Page</a>
	</div>
           
</body>


</html>