<%-- 
    Document   : addLelang
    Created on : Jun 27, 2020, 11:59:11 PM
    Author     : NAUFAL
--%>

<%@page import="Controller.LelangDAO" %>
<jsp:useBean id="b" class="Model.Lelang"></jsp:useBean>
<jsp:setProperty property="*" name="b"></jsp:setProperty>

<%
    int i = LelangDAO.add(b);
    if (i > 0) {
        out.println("<script type=\"text/javascript\">");
        out.println("alert('Berhasil');");
        out.println("location='adData.jsp';");
        out.println("</script>");
    } else {
        out.println("<script type=\"text/javascript\">");
        out.println("alert('Gagal');");
        out.println("location='adAdd.jsp';");
        out.println("</script>");
    }
%>
