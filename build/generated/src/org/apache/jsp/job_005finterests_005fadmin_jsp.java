package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import student_login_and_view.*;
import java.sql.*;

public final class job_005finterests_005fadmin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/session_check.jsp");
    _jspx_dependants.add("/admin_nav_bar.jsp");
    _jspx_dependants.add("/footer.jsp");
  }

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
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        ");
 String user = (String)  session.getAttribute("user");
    if (session == null || session.getAttribute("user") == null) {
            
            String login = "index.jsp";

        response.sendRedirect(login);// No logged-in user found, so redirect to login page.
        } else { }
      out.write("\n");
      out.write("        \n");
      out.write("      ");
      out.write("\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"css/bootstrap-theme.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/bootstrap-theme.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"js/bootstrap.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/npm.js\" type=\"text/javascript\"></script>\n");
      out.write("        <link href=\"css/custom.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <style>\n");
      out.write("        input[type=\"text\"]{\n");
      out.write("    background-color: transparent;\n");
      out.write("    border: 0px;\n");
      out.write("    outline: none;\n");
      out.write("    cursor:default;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       \n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"css/bootstrap-theme.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/bootstrap-theme.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"js/bootstrap.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/npm.js\" type=\"text/javascript\"></script>\n");
      out.write("        <link href=\"css/styles.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js\"></script>\n");
      out.write("  <script src=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js\"></script>\n");
      out.write("       \n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("<div class=\"navbar navbar-inverse navbar-fixed-top\">\n");
      out.write("  <div class=\"container\">\n");
      out.write("    <div class=\"navbar-header\">\n");
      out.write("      <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-collapse\">\n");
      out.write("        <span class=\"icon-bar\"></span>\n");
      out.write("        <span class=\"icon-bar\"></span>\n");
      out.write("        <span class=\"icon-bar\"></span>\n");
      out.write("      </button>\n");
      out.write("      <a class=\"navbar-brand\" href=\"index.jsp\">MAC Intership System</a>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"collapse navbar-collapse\">\n");
      out.write("      <ul class=\"nav navbar-nav\">\n");
      out.write("        <li class=\"dropdown\"><a class=\"dropdown-toggle\" data-toggle=\"dropdown\">Student <span class=\"caret\"></span></a>\n");
      out.write("            <ul class=\"dropdown-menu\">\n");
      out.write("                <li><a href=\"student_info.jsp\">Add Student</a></li>\n");
      out.write("                <li><a href=\"edit.jsp\">Edit Student</a></li>\n");
      out.write("                   <li><a href=\"delete.jsp\">Delete Student</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"dropdown\">\n");
      out.write("            <a  class=\"dropdown-toggle\" data-toggle=\"dropdown\"> Internship<b class=\"caret\"></b></a>\n");
      out.write("            <ul class=\"dropdown-menu\">\n");
      out.write("                <li><a href=\"add_company.jsp\">Add Company</a></li>\n");
      out.write("                 <li><a href=\"edit_company.jsp\">Edit Company</a></li>\n");
      out.write("                 <li><a href=\"delete_company.jsp\">Delete Company</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"dropdown\">\n");
      out.write("            <a  class=\"dropdown-toggle\" data-toggle=\"dropdown\"> Jobs<b class=\"caret\"></b></a>\n");
      out.write("            <ul class=\"dropdown-menu\">\n");
      out.write("               <li><a href=\"add_job.jsp\" method=\"post\" >Add Job</a></li>\n");
      out.write("                 <li><a href=\"edit_job.jsp\">Edit Job</a></li>\n");
      out.write("                 <li><a href=\"delete_job.jsp\">Delete Job</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"dropdown\">\n");
      out.write("            <a  class=\"dropdown-toggle\" data-toggle=\"dropdown\"> Student Status<b class=\"caret\"></b></a>\n");
      out.write("            <ul class=\"dropdown-menu\">\n");
      out.write("                <li><a href=\"student_status1.jsp\" method=\"post\" >Set Student Status</a></li>\n");
      out.write("                 <li><a href=\"edit_student_status.jsp\">View Student Status</a></li>\n");
      out.write("                 <li><a href=\"delete_status1.jsp\">Delete Student Status</a></li>\n");
      out.write("                 \n");
      out.write("            </ul>\n");
      out.write("        </li>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <li><a href=\"destroy_servlet\" method=\"post\" >LogOut</a></li>\n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("         ");

             
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loaded successfully");

            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/internship", "root", "root");
            
            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);

             ResultSet rs = stmt.executeQuery("SELECT * FROM internship.job_interest");
             
             
            
        
            
            
      out.write("\n");
      out.write("        \n");
      out.write("\n");
      out.write("\n");
      out.write("<center><legend><h2>Jobs Currently listed</h2></legend> </center>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("\t<div class=\"row\">\n");
      out.write("\t\t\n");
      out.write("        \n");
      out.write("        <div class=\"col-md-12\">   \n");
      out.write("\n");
      out.write("<table class=\"table\">\n");
      out.write("    <thead>\n");
      out.write("        \n");
      out.write("        <tr>\n");
      out.write("                  <th>Company Name</th>\n");
      out.write("                  <th>Position</th>\n");
      out.write("                  <th>Student ID</th>\n");
      out.write("        </tr>\n");
      out.write("    </thead>\n");
      out.write("    <tbody>\n");
      out.write("        ");
   while (rs.next()) { 
      out.write("\n");
      out.write("        \n");
      out.write("        <tr>\n");
      out.write("            <td><input  type=\"text\" value=\"");
      out.print(rs.getString("company"));
      out.write("\" name=\"c_name\" readonly></td>\n");
      out.write("            <td><input  type=\"text\" value=\"");
      out.print(rs.getString("position"));
      out.write("\" name=\"position\" readonly></td>\n");
      out.write("            <td><input  type=\"text\" value=\"");
      out.print(rs.getString("student_id"));
      out.write("\" name=\"student_id\" readonly></td>\n");
      out.write("            \n");
      out.write("        </tr>\n");
      out.write("       \n");
      out.write("         ");
 } 
      out.write(" \n");
      out.write("    \n");
      out.write("    </tbody>\n");
      out.write("  \n");
      out.write("</table>\n");
      out.write("\n");
      out.write("   </div>\n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"css/bootstrap-theme.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/bootstrap-theme.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/custom.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       \n");
      out.write("        <div class=\"navbar navbar-inverse navbar-fixed-bottom \">\n");
      out.write("        \n");
      out.write("        <div class=\"collapse navbar-collapse\">\n");
      out.write("      <ul class=\"nav navbar-nav pull-right\">\n");
      out.write("        \n");
      out.write("        <li><a>Contact US</a></li>\n");
      out.write("        <li><a>FAQ's</a></li>\n");
      out.write("       \n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("    </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("        \n");
      out.write("           </body>\n");
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
