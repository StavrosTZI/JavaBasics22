<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>MyUniversity</title>
    <link rel="stylesheet" type="text/css" href="style.css">
</head>

<div class="header1">

<h1 style="text-align: center;color: midnightblue;">MyUniversity</h1>
</div>

<div class="main">

    <input type="checkbox" id="chk" aria-hidden="true">
    <div class="signup">
        <form>
            <label for="chk" aria-hidden="true">Login</label>
            <input type="text" name="username" id="username" placeholder="Username" required>
            <input type="password" name="pswd" id="pswd" placeholder="Password" required>
            <button onclick="window.location.href='studentView.jsp'" >Login</button>
        </form>
    </div>
</div>




</body>
</html>