package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Conexion.Datos;
import Conexion.usuario;
import modelo.Email;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");

    if ((session.getAttribute("id_session") != null )&&(session.getAttribute("id_estado") == "1") ) {

        if ((session.getAttribute("pages") == "1") && (session.getAttribute("session_rol") == "1")) {
            response.sendRedirect("Vista/USER/inicio2.jsp");
        } else if ((session.getAttribute("pages") == "2") && (session.getAttribute("session_rol") == "2")) {
            response.sendRedirect("Vista/ADMIN/inicio.jsp");
        } else {
            response.sendRedirect("index.jsp");
        }
    }
   

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <title>Inicio Fic</title>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <meta charset=\"utf-8\" />\n");
      out.write("        <link rel=\"apple-touch-icon\" sizes=\"76x76\" href=\"bootstrap/assets/img/apple-icon.png\">\n");
      out.write("        <link rel=\"icon\" type=\"image/png\"          href=\"images/llave.png\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\" />\n");
      out.write("        <meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0' name='viewport' />\n");
      out.write("        <!--     Fonts and icons     -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"https://fonts.googleapis.com/css?family=Roboto:300,400,500,700\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/latest/css/font-awesome.min.css\" />\n");
      out.write("        <!-- CSS Files -->\n");
      out.write("        <link href=\"bootstrap/assets/css/bootstrap.min.css\" rel=\"stylesheet\" />\n");
      out.write("        <link href=\"bootstrap/assets/css/material-kit.css\" rel=\"stylesheet\"/>\n");
      out.write("        <link href=\"bootstrap/assets/css/alertas.css\" rel=\"stylesheet\"/>\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("            function cambiaVisibilidad() {\n");
      out.write("                var div1 = document.getElementById('1');\n");
      out.write("                var div2 = document.getElementById('2');\n");
      out.write("                if (div2.style.display === 'block') {\n");
      out.write("                    div2.style.display = 'none';\n");
      out.write("                    div1.style.display = 'block';\n");
      out.write("                } else {\n");
      out.write("                    div2.style.display = 'block';\n");
      out.write("                    div1.style.display = 'none';\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body class=\"signup-page\">\n");
      out.write("     ");
      out.write("\n");
      out.write("        <!----CABEZERA DE INICIO------------------------------------------------------------------------------------------------------------------------------>\n");
      out.write("      \n");
      out.write("            <nav class=\"navbar navbar-transparent navbar-absolute\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"navbar-header\">\n");
      out.write("                        <a class=\"navbar-brand\"></a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"collapse navbar-collapse\" id=\"navigation-example\">\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("            <div class=\"wrapper\">\n");
      out.write("                <div class=\"header header-filter\" style=\"background-image: url('images/eee.jpg'); background-size: cover; background-position: top center;\">\n");
      out.write("                    <!----FOTMULARIO INGRESAR------------------------------------------------------------------------------------------------------------------------------>\t\t\t\n");
      out.write("                      <form name=\"ValidarUsuario\" action=\"ValidarUsuario\" id=\"ValidarUsuario \" method=\"POST\">\t\n");
      out.write("                    <div id='1'>\n");
      out.write("                        <div class=\"container\">\n");
      out.write("                            <div class=\"row\">         \n");
      out.write("                                <a style=\"position: absolute; top: 25%; left: 10%;\">\n");
      out.write("                                    <img src=\"images/logoSenab.png\" width=\"360\" height=\"360\" >\n");
      out.write("                                    <center><h1></h1></center>\n");
      out.write("                                </a>\n");
      out.write("                                <div class=\"col-md-4 col-md-offset-6 col-sm-1 col-sm-offset-3\">\n");
      out.write("                                    <div class=\"card card-signup\">\n");
      out.write("                                        <div class=\"header header-primary text-center\">\n");
      out.write("                                            <img src=\"images/logop.png\" width=\"190\" height=\"110\" >\n");
      out.write("                                        </div>\n");
      out.write("                                        <p class=\"text-divider\" ></p>\n");
      out.write("                                        <div class=\"content\">\n");
      out.write("                                            <div class=\"input-group\">\n");
      out.write("                                                <span class=\"input-group-addon\">\n");
      out.write("                                                    <i class=\"fa fa-user-circle\" aria-hidden=\"true\"></i>\n");
      out.write("                                                </span>\n");
      out.write("                                                <input required=\"required\" type=\"text\" name=\"usuario\" id=\"usuario\" value=\"\" class=\"form-control\" placeholder=\"Numero Documento\">\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"input-group\">\n");
      out.write("                                                <span class=\"input-group-addon\">\n");
      out.write("                                                    <i class=\"fa fa-key\" aria-hidden=\"true\"></i>\n");
      out.write("                                                </span>\n");
      out.write("                                                <input required=\"required\" type=\"password\" name=\"clave\" id=\"clave\"  value=\"\"  class=\"form-control\" placeholder=\"Clave\" />\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"footer text-center\">\n");
      out.write("                                            <input type=\"submit\" class=\"btn btn-success\" value=\"ingresar\" name=\"ingresar\"  id=\"ingresar\">\n");
      out.write("                                          \n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                   </form>\n");
      out.write("                    <!----FOTMULARIO RECUPERAR------------------------------------------------------------------------------------------------------------------------------>\t\t\t\n");
      out.write("                    <div id='2' style=\"display:none;\" >\n");
      out.write("                        <div class=\"container\">\n");
      out.write("                            <div class=\"row\">         \n");
      out.write("                                <a style=\"position: absolute; top: 25%; left: 10%;\">\n");
      out.write("                                    <img src=\"images/logoSenab.png\" width=\"360\" height=\"360\" >\n");
      out.write("                                    <center><h1></h1></center>\n");
      out.write("                                </a>\n");
      out.write("                                <div class=\"col-md-4 col-md-offset-6 col-sm-1 col-sm-offset-3\">\n");
      out.write("\n");
      out.write("                                    <div class=\"card card-signup\">\n");
      out.write("                                        <div class=\"header header-primary text-center\">\n");
      out.write("                                            <img src=\"images/logofic2.png\" width=\"190\" height=\"110\" >\n");
      out.write("                                        </div>\n");
      out.write("                                        <p class=\"text-divider\" ></p>\n");
      out.write("                                     \n");
      out.write("                                            <div class=\"content\">\n");
      out.write("                                                <div class=\"input-group\">\n");
      out.write("                                                    <span class=\"input-group-addon\">\n");
      out.write("                                                        <i class=\"fa fa-user-circle\" aria-hidden=\"true\"></i>\n");
      out.write("                                                    </span>\n");
      out.write("                                                  \n");
      out.write("                                                </div>\t\t\t\t\t\t\t\t\t\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"footer text-center\">\n");
      out.write("                                                <input type=\"button\" name=\"recuperar\" class=\"btn btn-success\" value=\"recuperar\">\n");
      out.write("                                                <input type=\"submit\" class=\"btn btn-success\" value=\"iniciar\" name=\"iniciar\"  id=\"ss\" onclick=\"cambiaVisibilidad()\" >\n");
      out.write("                                            </div>\n");
      out.write("                                        \n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <br><br>\n");
      out.write("                    <!----PIE DE PAGINA DEL LOGIN------------------------------------------------------------------------------------------------------------------------------>\n");
      out.write("                    <footer class=\"footer\">\n");
      out.write("                        <div class=\"container\">\n");
      out.write("                            <nav class=\"pull-left\">\n");
      out.write("                                <ul>\n");
      out.write("                                   \n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"Desarrollador.jsp\">\n");
      out.write("                                            Desarrollado Por\n");
      out.write("                                        </a>\n");
      out.write("                                    </li>\n");
      out.write("                                </ul>\n");
      out.write("                            </nav>\n");
      out.write("                            <div class=\"copyright pull-right\">\n");
      out.write("                                &copy; 2017, Hecho Por Sena 1524673\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </footer>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("    <!--   Core JS Files   -->\n");
      out.write("    <script src=\"bootstrap/assets/js/jquery.min.js\" type=\"text/javascript\"></script>\n");
      out.write("    <script src=\"bootstrap/assets/js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("    <script src=\"bootstrap/assets/js/material.min.js\"></script>\n");
      out.write("    <!--  Plugin for the Sliders, full documentation here: http://refreshless.com/nouislider/ -->\n");
      out.write("    <script src=\"bootstrap/assets/js/nouislider.min.js\" type=\"text/javascript\"></script>\n");
      out.write("    <!--  Plugin for the Datepicker, full documentation here: http://www.eyecon.ro/bootstrap-datepicker/ -->\n");
      out.write("    <script src=\"bootstrap/assets/js/bootstrap-datepicker.js\" type=\"text/javascript\"></script>\n");
      out.write("    <!-- Control Center for Material Kit: activating the ripples, parallax effects, scripts from the example pages etc -->\n");
      out.write("    <script src=\"bootstrap/assets/js/material-kit.js\" type=\"text/javascript\"></script>\n");
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
