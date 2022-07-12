<%-- 
    Document   : usLelang
    Created on : Jun 27, 2020, 11:12:14 PM
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
        <title>Lelang</title>
    </head>
    <body>
        <%@page import="Controller.LelangDAO,Model.Lelang,java.util.*" %>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
        <%
            List<Lelang> list = LelangDAO.getAllRecords();
            request.setAttribute("list", list);
            String usr = request.getParameter("username");
        %>
        <input type="hidden" name="username" value="<%=usr%>"/>
        <div class="usLelang">
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
                <h1>Data Lelang</h1>
                <table border="1" width="90%">
                    <tr>
                        <th>Id</th>
                        <th>Item</th>
                        <th>Kondisi</th>
                        <th>Kode</th>
                        <th>Lokasi</th>
                        <th>Bid</th>
                    </tr>
                    <c:forEach items="${list}" var="b">
                        <tr>
                        <td>${b.getId()}</td>
                        <td>${b.getItem()}</td>
                        <td>${b.getKondisi()}</td>
                        <td>${b.getKode()}</td>
                        <td>${b.getLokasi()}</td>
                        <td><a href="usBid.jsp?id_lelang=${b.getId()}" id="bid">Bid</a></td>
                    </tr>
                    </c:forEach>
                </table>
            </div>
        </div>
    </body>
</html>