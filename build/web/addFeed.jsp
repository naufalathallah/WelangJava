<%-- 
    Document   : addFeed
    Created on : Jun 28, 2020, 2:38:09 AM
    Author     : NAUFAL
--%>

<%@page import="Controller.FeedDAO"%>
<jsp:useBean id="b" class="Model.Feedback"></jsp:useBean>
<jsp:setProperty property="*" name="b"></jsp:setProperty>

<%
    FeedDAO.add(b);
    out.println("<script type=\"text/javascript\">");
    out.println("alert('Berhasil');");
    out.println("location='usFeedback.jsp';");
    out.println("</script>");
%>
