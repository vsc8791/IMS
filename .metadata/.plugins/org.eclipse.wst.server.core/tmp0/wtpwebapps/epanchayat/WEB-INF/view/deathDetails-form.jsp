 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>

<title>Save deathDetails</title>
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style.css">

<title>Save deathDetails</title>
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
		<h3>Save deathDetails Details</h3>
		<form:form action="saveDeathDetails" modelAttribute="deathDetails"
			method="POST">
			<!-- need to associate this data with deathDetails Id -->
			<form:hidden path="id"/>
			
			<table align="center">
				<tbody>
										<tr>
						<td><label>death Id:</label></td>
						<td><form:input path="deathid" /></td>
					</tr>
					<tr>
						<td><label>First Name:</label></td>
						<td><form:input path="firstname" /></td>
					</tr>
					<tr>
						<td><label>Middle Name:</label></td>
						<td><form:input path="middlename"/></td>
					</tr>
					<tr>
						<td><label>Last Name:</label></td>
						<td><form:input path="lastname" /></td>
					</tr>
					<tr>
						<td><label>Gender:</label></td>
						<td><form:input path="gender" /></td>
					</tr>
					<tr>
						<td><label>State:</label></td>
						<td><form:input path="state"/></td>
					</tr>
					<tr>
						<td><label>District:</label></td>
						<td><form:input path="district"  /></td>
					</tr>
					<tr>
						<td><label>Taluka:</label></td>
						<td><form:input path="taluka"/></td>
					</tr>
					<tr>
						<td><label>Village:</label></td>
						<td><form:input path="village"/></td>
					</tr>
					<tr>
						<td><label>death Date</label></td>
						<td><form:input path="deathdate" type="date"/></td>
					</tr>
					<tr>
						<td><label>death Place:</label></td>
						<td><form:input path="deathplace"/></td>
					</tr>
					<tr>
						<td><label>death Time:</label></td>
						<td><form:input path="deathtime"/></td>
					</tr>
					
					<tr>
						<td><label>Nationality:</label></td>
						<td><form:input path="nationality"/></td>
					</tr>
					
					<tr>
						<td><label> Age:</label></td>
						<td><form:input path="deathage" type="number"/></td>
					</tr>
				
				
					
					
					<tr>
						<td><label>Reason</label></td>
						<td><form:input path="deathreason" /></td>
					</tr>
					<tr>
						<td><label>Refered By:</label></td>
						<td><form:input path="referedby"/></td>
					</tr>
				</tbody>
				 
			</table>
			<center><input  type="submit" value="Save" class="save" /></center>	
		</form:form>
		<!--  <center><input  type="submit" value="Save" class="save"/> </center> -->
		<div style="clear;both;"></div>
		<p><a href="${pageContext.request.contextPath}/deathDetails/list">Back To List</a></p>
			<a href="http://localhost:8082/epanchayat/">Home Page</a>
	</div>
           
</body>


</html>