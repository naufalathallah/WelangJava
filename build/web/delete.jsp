<%-- 
    Document   : delete
    Created on : Jun 28, 2020, 1:06:45 AM
    Author     : NAUFAL
--%>

<%@page import="Controller.LelangDAO" %>
<jsp:useBean id="b" class="Model.Lelang"></jsp:useBean>
<jsp:setProperty property="*" name="b"></jsp:setProperty>

<%
    LelangDAO.delete(b);
    out.println("<script type=\"text/javascript\">");
    out.println("alert('Berhasil dihapus');");
    out.println("location='adData.jsp';");
    out.println("</script>");
%>
