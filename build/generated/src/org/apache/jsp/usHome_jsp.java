package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class usHome_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>Home</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"usHome\">\n");
      out.write("        <div class=\"navigasi\">\n");
      out.write("            <nav>\n");
      out.write("                <img src=\"media/wl.png\" alt=\"\" onclick=\"location.href='usHome.html'\">\n");
      out.write("                <ul>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"usLelang.html\">LELANG</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"usFeedback.html\">FEEDBACK</a>\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"usContact.html\">CONTACT</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </nav>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"isi\">\n");
      out.write("            <div class=\"vid\">\n");
      out.write("                <video autoplay=\"\" muted=\"\" loop=\"\">\n");
      out.write("                    <source src=\"media/intro.mp4\" type=\"video/mp4\">\n");
      out.write("                </video>\n");
      out.write("            </div>\n");
      out.write("            <h1 onclick=\"location.href='usBid.html'\">BID NOW</h1>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</body>\n");
      out.write("</html>");
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
