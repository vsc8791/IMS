 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>

<title>Save Student</title>
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style.css">

<title>Save Course</title>
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/add-customer-style.css">
</head>
<body>
	<div id="wrapper">
		<div id="header">
			<h2>IACSD Management System</h2>
		</div>
	</div>
	<div>
		<h3>Save Course  Details</h3>
		<form:form action="saveCustomer" modelAttribute="customer"
			method="POST" >
			<!-- need to associate this data with Customer Id -->
			<form:hidden path="id"/>
			
			<table>
				<tbody>
					<tr>
						<td><label>Course Name:</label></td>
						<td><form:input path="firstName" /></td>
					</tr>
					<tr>
						<td><label>PreRequisites:</label></td>
						<td><form:input path="lastName" /></td>
					</tr>
					<tr>
						<td><label>Description:</label></td>
						<td><form:input path="email"/></td>
					</tr>
					<tr>
						<td><label></label></td>
						<td><input type="submit" value="Save" class="save" /></td>
					</tr>
				</tbody>
			</table>
		</form:form>
		<div style="clear;both;"></div>
		<p><a href="${pageContext.request.contextPath}/customer/list">Back To List</a></p>
	</div>

</body>


</html>