<%-- 
    Document   : addBid
    Created on : Jun 28, 2020, 1:33:38 AM
    Author     : NAUFAL
--%>

<%@page import="Controller.BidDAO" %>
<jsp:useBean id="b" class="Model.Bid"></jsp:useBean>
<jsp:setProperty property="*" name="b"></jsp:setProperty>

<%
    String user = request.getParameter("username");
    int idl = Integer.parseInt(request.getParameter("id_lelang"));
    
    int i = BidDAO.bid(user, b, idl);
    if (i > 0) {
        out.println("<script type=\"text/javascript\">");
        out.println("alert('Berhasil');");
        out.println("location='usLelang.jsp';");
        out.println("</script>");
    } else {
        out.println("<script type=\"text/javascript\">");
        out.println("alert('Gagal');");
        out.println("location='usBid.jsp';");
        out.println("</script>");
    }
%>