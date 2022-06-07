<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>MyUniversity</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" type="text/css" href="Views.css">
</head>
<body>
<div id="mySidenav" class="sidenav">
    <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&times;</a>
    <a href="assingmentCourse.jsp">Ανάθεση Μαθήματος σε Καθηγητή</a>
    <a href="#">Προβολή Συνόλου Μαθημάτων</a>
    <a href="#">Προβολή Μαθημάτων-Καθηγητών</a>
    <a href="#">Αποσύνδεση</a>
</div>

<div class="header2" style="background-color: cadetblue">
    <br>
    <br>
    <h1 style="text-align: center;font-family: fantasy">Καλώς ήρθες στο MyUniversity!!</h1>
    <br>
    <br>
</div>

<div style="text-align: center;">
    <span style="font-size:30px;cursor:pointer" onclick="openNav()">&#9776; menu </span>
</div>

<h3> Students Information </h3>
<% ArrayList<ArrayList> departments = (ArrayList)request.getAttribute("departments");


%>

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
