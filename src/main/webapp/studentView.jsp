<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>MyUniversity!!</title>
    <link rel="stylesheet" type="text/css" href="style2.css">
</head>
<body>
<div class="container">
    <nav class="menu">
        <ul class="main-menu">
            <li class="active"><i class="fa fa-home"></i>Προφίλ</li>
            <li><i class="fa fa-user"></i>Βαθμολογίες</li>
            <li class="with-submenu">
                <i class="fa fa-briefcase"></i>test <i class="fa fa-caret-down"></i>
                <ul class="submenu">
                    <li>React</li>
                    <li>JavaScript</li>
                    <li>CSS</li>
                    <li>Animation</li>
                </ul>
            </li>

        </ul>
    </nav>
    <article>
        <h1>Προφίλ Φοιτητή</h1>
        <div class="content">
            <table style="width:100%">
                <tr>
                    <td>Όνομα</td>
                    <td>#name</td>
                </tr>
                <tr>
                    <td>Επώνυμο</td>
                    <td>#surname</td>
                </tr>
                <tr>
                    <td>Αριθμός Μητρώου</td>
                    <td>#id</td>
                </tr>
                <tr>
                    <td>Τμήμα</td>
                    <td>#department</td>
                </tr>
                <tr>
                    <td>Κατάσταση Φοιτητή</td>
                    <td>Ενεργός</td>
                </tr>
            </table>

        </div>
    </article>
</div>


</body>
</html>
