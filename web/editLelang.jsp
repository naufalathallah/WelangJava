<%-- 
    Document   : editLelang
    Created on : Jun 28, 2020, 12:36:24 AM
    Author     : NAUFAL
--%>

<%@page import="Controller.LelangDAO" %>
<jsp:useBean id="b" class="Model.Lelang"></jsp:useBean>
<jsp:setProperty property="*" name="b"></jsp:setProperty>

<%
    LelangDAO.update(b);
    out.println("<script type=\"text/javascript\">");
    out.println("alert('Berhasil diupdate');");
    out.println("location='adData.jsp';");
    out.println("</script>");
%>