<%-- 
    Document   : adData
    Created on : Jun 27, 2020, 11:06:09 PM
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
        <title>Data Lelang</title>
    </head>
    <body>
        <%@page import="Controller.LelangDAO,Model.Lelang,java.util.*" %>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
        <%
            List<Lelang> list = LelangDAO.getAllRecords();
            request.setAttribute("list", list);
        %>
        <div class="adData">
            <h1>Data Lelang</h1>
            <table border="1" width="90%">
                <tr>
                    <th>Id</th>
                    <th>Item</th>
                    <th>Kondisi</th>
                    <th>Kode</th>
                    <th>Lokasi</th>
                    <th>Edit</th>
                    <th>Delete</th>
                </tr>
                <c:forEach items="${list}" var="b">
                    <tr>
                    <td>${b.getId()}</td>
                    <td>${b.getItem()}</td>
                    <td>${b.getKondisi()}</td>
                    <td>${b.getKode()}</td>
                    <td>${b.getLokasi()}</td>
                    <td><a href="adEdit.jsp?id_lelang=${b.getId()}" id="edit">Edit</a></td>
                    <td><a href="delete.jsp?id=${b.getId()}" id="delete">Delete</a></td>
                </tr>
                </c:forEach>
            </table>
        </div>
    </body>
</html>