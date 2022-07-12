<%-- 
    Document   : login
    Created on : Jun 27, 2020, 10:47:39 PM
    Author     : NAUFAL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="Lelang online">
    <meta name="keywords" content="Lelang, Web lelang">
    <meta name="author" content="Naufal athallah iwel, Raihan ramadhani, M adit dwiatmojo">
    <link rel="icon" type="image.png" href="media/favicowl.png">
    <link rel="stylesheet" href="style/main.css">
    <script src="script/jquery.js"></script>
    <script src="script/script.js"></script>
    <title>Login</title>
</head>
<body>
    <div class="login">
        <form action="LoginServlet" name="log">
            <img src="media/wl.png" alt="">
            <input type="text" placeholder="Username" name="username" required>
            <input type="password" placeholder="Password" name="password" required>
            <select name="type" id="">
                <option value="0">Pilih</option>
                <option value="1">Admin</option>
                <option value="2">User</option>
            </select>
            <button type="submit" onclick="return login();">Login</button>
        </form>
    </div>
</body>
</html>
