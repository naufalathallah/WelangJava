<%-- 
    Document   : adFeedback
    Created on : Jun 27, 2020, 11:06:34 PM
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
        <title>Data Feedback</title>
    </head>
    <body>
        <%@page import="Controller.FeedDAO,Model.Feedback,java.util.*"%>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
        <%
            List<Feedback> list = FeedDAO.getAllRecords();
            request.setAttribute("list", list);
        %>
        <div class="adFeedback">
            <h1>Data Feedback</h1>
            <table border="1" width="90%">
                <tr>
                    <th>Feedback</th>
                </tr>
                <c:forEach items="${list}" var="b">
                    <tr>
                    <td>${b.getFeedback()}</td>
                </tr>
                </c:forEach>
            </table>
        </div>
    </body>
</html>