<%@ page import="com.example.javabasics.model.Student" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>MyUniversity!!</title>

    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" type="text/css" href="Views.css">
</head>
<body>
<div id="mySidenav" class="sidenav">
    <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&times;</a>
    <a href="studentView.jsp">Student Informations</a>
    <a href="gradesPerStudent.jsp">Grades</a>
    <a href="index.jsp">Logout</a>
</div>

<div class="header2" style="background-color: cadetblue">
    <br>
    <br>
    <h1 style="text-align: center;font-family: fantasy">Welcome to MyUniversity!!</h1>
    <br>
    <br>
</div>

<h3 style="text-align: center;border: 3px solid black;width: 50%;margin: 13px auto">Student Informations</h3>
<table style="width:50%;margin: 0px auto;border: 3px solid black">

    <tr>
        <td>Name</td>
        <td>#name</td>
    </tr>
    <tr>
        <td>Surname</td>
        <td>#surmname</td>
    </tr>
    <tr>
        <td>Registration number</td>
        <td>#reg_num</td>
    </tr>
    <tr>
        <td>Department</td>
        <td>#depurtmen</td>
    </tr>
    <tr>
        <td>Student Status</td>
        <td>Active</td>
    </tr>
</table>


<br><br>
<div style="text-align: center;">
    <span style="font-size:30px;cursor:pointer" onclick="openNav()">&#9776; menu </span>
</div>


</body>

<script>
    function openNav() {
        document.getElementById("mySidenav").style.width = "250px";
    }

    function closeNav() {
        document.getElementById("mySidenav").style.width = "0";
    }
</script>
</html>
