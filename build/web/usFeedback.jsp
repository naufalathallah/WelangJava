<%-- 
    Document   : usFeedback
    Created on : Jun 27, 2020, 11:11:41 PM
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
    <title>Feedback</title>
</head>
<body>
    <div class="usFeedback">
        <div class="navigasi">
            <nav>
                <img src="media/wl.png" alt="" onclick="location.href='usHome.jsp'">
                <ul>
                    <li>
                        <a href="usLelang.jsp">LELANG</a>
                    </li>
                    <li>
                        <a href="usFeedback.jsp">FEEDBACK</a>
                        <ul>
                            <li><a href="usContact.jsp">CONTACT</a></li>
                        </ul>
                    </li>
                </ul>
            </nav>
        </div>
        <div class="isi">
            <h1>Help Us To Be Better</h1>
            <form action="addFeed.jsp" name="feedback">
                <textarea name="feedback" class="feedback-input" placeholder="Comment" required></textarea>
                <button type="submit" onclick="checkFeed();">SUBMIT</button>
          </form>
        </div>
    </div>
</body>
</html>