<%-- 
    Document   : adEdit
    Created on : Jun 27, 2020, 11:06:22 PM
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
        <title>Edit</title>
    </head>
    <body>
        <%@page import="Controller.LelangDAO,Model.Lelang,java.util.*" %>
        <%
            String id = request.getParameter("id_lelang");
            Lelang b = LelangDAO.getRecordById(Integer.parseInt(id));
        %>
        <div class="adEdit">
            <form action="editLelang.jsp" name="isi">
                <input type="hidden" name="id" value="<%=b.getId()%>"/>
                <h1>Edit Lelang</h1>
                <table>
                    <tr>
                        <td>Item:</td>
                        <td><input type="text" name="item" value="<%=b.getItem()%>" required></td>
                    </tr>
                    <tr>
                        <td>Kondisi:</td>
                        <td><input type="text" name="kondisi" value="<%=b.getKondisi()%>" required></td>
                    </tr>
                    <tr>
                        <td>Kode:</td>
                        <td><input type="text" name="kode" value="<%=b.getKode()%>" required></td>
                    </tr>
                    <tr>
                        <td>Lokasi:</td>
                        <td><input type="text" name="lokasi" value="<%=b.getLokasi()%>" required></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td><button type="submit" onclick="checkIsi();">Save</button></td>
                    </tr>
                </table>
            </form>
        </div>
    </body>
</html>