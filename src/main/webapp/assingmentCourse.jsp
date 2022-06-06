
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
    <label>course &#8594</label>
    <select id="courseid"></select><br>
    <label>professor &#8594</label>

    <select id="profid"></select><br>
    <button onclick="getEls()">load data</button>

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
    var select = document.getElementById('courseid');
    var select2= document.getElementById('profid');

    var courses = ["HTML", "CSS", "JS", "PHP", "jQuery"];
    var professors = ["mhtsos", "mpamphs", "georgios", "takhs", "maraki"];

    //up.innerHTML = "Click on the button to "
    //    + "perform the operation"+
    //    ".<br>Array - [" + elmts + "]";

    // Main function
    function getEls() {
        for (var i = 0; i < courses.length; i++) {
            var optn = courses[i];
            var el = document.createElement("option");
            el.textContent = optn;
            el.value = optn;
            select.appendChild(el);

        }
        for (var i = 0; i < professors.length; i++) {
            var optn2 = professors[i];
            var el2 = document.createElement("option");
            el2.textContent = optn2;
            el2.value = optn2;
            select2.appendChild(el2);
        }
        down.innerHTML = "Elements Added";


    }






</script>
</html>
