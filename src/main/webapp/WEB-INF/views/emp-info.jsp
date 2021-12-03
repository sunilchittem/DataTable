<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
<link href="https:////cdn.datatables.net/1.11.3/css/jquery.dataTables.min.css" type="text/css" rel="stylesheet">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script type="text/javascript" src="https:////cdn.datatables.net/1.11.3/js/jquery.dataTables.min.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
		$("#employeeList").DataTable({
			pageLength:3,
		ajax:{
			url:'employee',
			dataSrc: ''
			},
			columns:[{
				title :'ID',
				data :'empId'
				},
				{
					title :'Name',
					data :'empName'
					},
					{
						title :'Salary',
						data :'empSal'
						}]
			});
		});

</script>
</head>
<body>
	<table id="employeeList" class="display" style="width: 100%;">
	
	</table>
</body>
</html>