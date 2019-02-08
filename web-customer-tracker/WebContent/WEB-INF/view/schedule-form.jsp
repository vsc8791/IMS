 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>

<title>Save Schedule</title>
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style.css">

<title>Save Schedule</title>
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
		<h3>Save Schedule Details</h3>
		<form:form action="saveSchedule" modelAttribute="schedule"
			method="POST">
			<!-- need to associate this data with Student Id -->
			<form:hidden path="id"/>
			
			<table align="center">
				<tbody>
					<tr>
						<td><label>Date of Lecture:</label></td>
						<td><form:input path="date_of_lecture" type="date" /></td>
					</tr>
					<tr>
						<td><label>Day of Lecture:</label></td>
						<td><form:input path="day_of_lecture" /></td>
					</tr>
					<tr>
						<td><label>Subject:</label></td>
						<td><form:input path="subject" /></td>
					</tr>
					<tr>
						<td><label>Faculty Name:</label></td>
						<td><form:input path="faculty_teaches" /></td>
					</tr>
					<tr>
						<td><label>Type Of Lecture:</label></td>
						<td><form:input path="type_of_lec" /></td>
					</tr>
					<tr>
						<td><label>Time of Lecture:</label></td>
						<td><form:input path="compulsory" /></td>
					</tr>
					
					
				</tbody>
				 
			</table>
			<center><input  type="submit" value="Save" class="save" /></center>	
		</form:form>
		<!--  <center><input  type="submit" value="Save" class="save"/> </center> -->
		<div style="clear;both;"></div>
		<p><a href="${pageContext.request.contextPath}/schedule/list">Back To List</a></p>
			<a href="http://localhost:8082/web-customer-tracker/">Home Page</a>
	</div>
           
</body>


</html>