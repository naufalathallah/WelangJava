<%-- 
    Document   : usBid
    Created on : Jun 27, 2020, 11:11:13 PM
    Author     : NAUFAL
--%>

<%@page import="Controller.LelangDAO"%>
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
        <title>Bid</title>
    </head>
    <body>
        <%@page import="Controller.BidDAO,Model.Bid,java.util.*,Model.Lelang,Model.User" %>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
        <%
            String id = request.getParameter("id_lelang");
            Bid b = BidDAO.getRecordById(Integer.parseInt(id));
            List<Bid> list = BidDAO.getAllRecords(Integer.parseInt(id));
            request.setAttribute("list", list);
            Lelang l =LelangDAO.getRecordById(Integer.parseInt(id));
        %>
        <div class="usBid">
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
                <h1>Bid <%=l.getItem()%></h1>
                <table border="1" width="90%">
                    <tr>
                        <th>Nama</th>
                        <th>Nominal</th>
                    </tr>
                    <c:forEach items="${list}" var="b">
                        <tr>
                        <td>${b.getUsername()}</td>
                        <td>${b.getNominal()}</td>
                    </tr>
                    </c:forEach>
                </table>
                <br><br>
                <form action="addBid.jsp" name="bid">
                    <input type="hidden" name="id_lelang" value="<%=id%>"/>
                    <input type="text" placeholder="Nama" name="username" required>
                    <input type="text" placeholder="Nominal" name="nominal" required>
                    <button type="submit">Enter</button>
                </form>
            </div>
        </div>
    </body>
</html>