 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>

<title>Save Batch</title>
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style.css">

<title>Save Batch</title>
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
		<h3>Save Batch Details</h3>
		<form:form action="saveBatch" modelAttribute="batch"
			method="POST">
			<!-- need to associate this data with Student Id -->
			<form:hidden path="id"/>
			
			<table align="center">
				<tbody>
					<tr>
						<td><label>Batch Name:</label></td>
						<td><form:input path="batchName"  /></td>
					</tr>
					<tr>
						<td><label>Batch Year:</label></td>
						<td><form:input path="batchYear" type="number"/></td>
					</tr>
					<tr>
						<td><label>Number Of Students:</label></td>
						<td><form:input path="no_of_students" type="number" /></td>
					</tr>
					<tr>
						<td><label>Status:</label></td>
						<td><form:input path="status" /></td>
					</tr>
					<tr>
						<td><label>Placement %:</label></td>
						<td><form:input path="placement_percentage" type="number"/></td>
					</tr>
					
					
				</tbody>
				 
			</table>
			<center><input  type="submit" value="Save" class="save" /></center>	
		</form:form>
		<!--  <center><input  type="submit" value="Save" class="save"/> </center> -->
		<div style="clear;both;"></div>
		<p><a href="${pageContext.request.contextPath}/batch/list">Back To List</a></p>
			<a href="http://localhost:8082/web-customer-tracker/">Home Page</a>
	</div>
           
</body>


</html>