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
    <a href="studentView.jsp">Πληροφορίες Φοιτητή</a>
    <a href="#">Βαθμολογίες</a>
    <a href="index.jsp">Αποσύνδεση</a>
</div>

<div class="header2" style="background-color: cadetblue">
    <br>
    <br>
    <h1 style="text-align: center;font-family: fantasy">Καλώς ήρθες στο MyUniversity!!</h1>
    <br>
    <br>
</div>

<h3 style="text-align: center;border: 3px solid black;width: 50%;margin: 13px auto">Πληροφορίες Φοιτητή</h3>
<table style="width:50%;margin: 0px auto;border: 3px solid black">

    <tr>
        <td>Όνομα</td>
        <td>#name</td>
    </tr>
    <tr>
        <td>Επώνυμο</td>
        <td>#surmname</td>
    </tr>
    <tr>
        <td>Αριθμός Μητρώου</td>
        <td>#reg_num</td>
    </tr>
    <tr>
        <td>Τμήμα</td>
        <td>#depurtmen</td>
    </tr>
    <tr>
        <td>Κατάσταση Φοιτητή</td>
        <td>Ενεργός</td>
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
