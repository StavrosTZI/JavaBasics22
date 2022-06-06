
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
    <a href="#">Ανάθεση Μαθήματος σε Καθηγητή</a>
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

<div align="center">
    <button onclick="getCourses();">click here first</button>
    <select id="courseid"></select>
    <p id="gfg" style="font-size: 26px;font-weight: bold;color: green;"></p>
</div>



</body>
<script>
    function openNav() {
        document.getElementById("mySidenav").style.width = "250px";
    }

    function closeNav() {
        document.getElementById("mySidenav").style.width = "0";
    }

//--------

    var down = document.getElementById('gfg');
    var select = document.getElementById("courseid");
    var elmts = ["HTML", "CSS", "JS", "PHP", "jQuery"];
    up.innerHTML = "Click on the button to "
        + "perform the operation"+
        ".<br>Array - [" + elmts + "]";

    // Main function
    function getCourses() {
        for (var i = 0; i < elmts.length; i++) {
            var optn = elmts[i];
            var el = document.createElement("option");
            el.textContent = optn;
            el.value = optn;
            select.appendChild(el);
        }
        down.innerHTML = "Elements Added";
    }
</script>
</html>
