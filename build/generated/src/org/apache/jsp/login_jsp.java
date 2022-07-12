package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <meta name=\"description\" content=\"Lelang online\">\n");
      out.write("    <meta name=\"keywords\" content=\"Lelang, Web lelang\">\n");
      out.write("    <meta name=\"author\" content=\"Naufal athallah iwel, Raihan ramadhani, M adit dwiatmojo\">\n");
      out.write("    <link rel=\"icon\" type=\"image.png\" href=\"media/favicowl.png\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"style/main.css\">\n");
      out.write("    <script src=\"script/jquery.js\"></script>\n");
      out.write("    <script src=\"script/script.js\"></script>\n");
      out.write("    <title>Login</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"login\">\n");
      out.write("        <form action=\"LoginServlet\" name=\"log\">\n");
      out.write("            <img src=\"media/wl.png\" alt=\"\">\n");
      out.write("            <input type=\"text\" placeholder=\"Username\" name=\"username\" required>\n");
      out.write("            <input type=\"password\" placeholder=\"Password\" name=\"password\" required>\n");
      out.write("            <select name=\"type\" id=\"\">\n");
      out.write("                <option value=\"0\">Pilih</option>\n");
      out.write("                <option value=\"1\">Admin</option>\n");
      out.write("                <option value=\"2\">User</option>\n");
      out.write("            </select>\n");
      out.write("            <button type=\"submit\" onclick=\"return login();\">Login</button>\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
