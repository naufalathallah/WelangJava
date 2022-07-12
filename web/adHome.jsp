<%-- 
    Document   : adHome
    Created on : Jun 27, 2020, 11:05:11 PM
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
    <title>Admin Home</title>
</head>
<body>
    <div class="adHome">
        <img src="media/wl.png" alt="">
        <h1>ADMIN</h1>
        <button type="submit" onclick="location.href='adData.jsp'">Data</button>
        <button type="submit" onclick="location.href='adAdd.jsp'">Add</button>
        <button type="submit" onclick="location.href='adFeedback.jsp'">Feedback</button>
    </div>
</body>
</html>