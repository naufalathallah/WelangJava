<%-- 
    Document   : adAdd
    Created on : Jun 27, 2020, 11:05:56 PM
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
    <title>Tambah</title>
</head>
<body>
    <div class="adAdd">
        <form action="addLelang.jsp" name="isi">
            <h1>Tambah Lelang</h1>
            <table>
                <tr>
                    <td>Item:</td>
                    <td><input type="text" name="item" required></td>
                </tr>
                <tr>
                    <td>Kondisi:</td>
                    <td><input type="text" name="kondisi" required></td>
                </tr>
                <tr>
                    <td>Kode:</td>
                    <td><input type="text" name="kode" required></td>
                </tr>
                <tr>
                    <td>Lokasi:</td>
                    <td><input type="text" name="lokasi" required></td>
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