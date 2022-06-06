<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>MyUniversity!!</title>

    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="style.css">
    <style>
        body {
            font-family: "Lato", sans-serif;
            background: linear-gradient(to bottom, #1a66ff, #4d88ff, #80aaff)
        }

        .sidenav {
            height: 100%;
            width: 0;
            position: fixed;
            z-index: 1;
            top: 0;
            left: 0;
            background-color: #111;
            overflow-x: hidden;
            transition: 0.5s;
            padding-top: 60px;
        }

        .sidenav a {
            padding: 8px 8px 8px 32px;
            text-decoration: none;
            font-size: 25px;
            color: #818181;
            display: block;
            transition: 0.3s;
        }

        .sidenav a:hover {
            color: #f1f1f1;
        }

        .sidenav .closebtn {
            position: absolute;
            top: 0;
            right: 25px;
            font-size: 36px;
            margin-left: 50px;
        }

        @media screen and (max-height: 450px) {
            .sidenav {padding-top: 15px;}
            .sidenav a {font-size: 18px;}
        }
    </style>
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
