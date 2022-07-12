package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adData_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>Data Lelang</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"adData\">\n");
      out.write("        <h1>Data Lelang</h1>\n");
      out.write("        <table border=\"1\" width=\"90%\">\n");
      out.write("            <tr>\n");
      out.write("                <th>Id</th>\n");
      out.write("                <th>Item</th>\n");
      out.write("                <th>Kondisi</th>\n");
      out.write("                <th>Kode</th>\n");
      out.write("                <th>Lokasi</th>\n");
      out.write("                <th>Edit</th>\n");
      out.write("                <th>Delete</th>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>a</td>\n");
      out.write("                <td>a</td>\n");
      out.write("                <td>a</td>\n");
      out.write("                <td>a</td>\n");
      out.write("                <td>a</td>\n");
      out.write("                <td><a href=\"adedit.html\" id=\"edit\">Edit</a></td>\n");
      out.write("                <td><a href=\"delete.jsp\" id=\"delete\">Delete</a></td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
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
