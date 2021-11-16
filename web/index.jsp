
<%@page import="Conexion.Datos"%>
<%@page import="Conexion.usuario"%>
<%@page import="modelo.Email"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    if ((session.getAttribute("id_session") != null )&&(session.getAttribute("id_estado") == "1") ) {

        if ((session.getAttribute("pages") == "1") && (session.getAttribute("session_rol") == "1")) {
            response.sendRedirect("Vista/USER/inicio2.jsp");
        } else if ((session.getAttribute("pages") == "2") && (session.getAttribute("session_rol") == "2")) {
            response.sendRedirect("Vista/ADMIN/inicio.jsp");
        } else {
            response.sendRedirect("index.jsp");
        }
    }
   
%>

<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Inicio Fic</title>


        <meta charset="utf-8" />
        <link rel="apple-touch-icon" sizes="76x76" href="bootstrap/assets/img/apple-icon.png">
        <link rel="icon" type="image/png"          href="images/llave.png">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
        <meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0' name='viewport' />
        <!--     Fonts and icons     -->
        <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons" />
        <link rel="stylesheet" type="text/css" href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700" />
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/latest/css/font-awesome.min.css" />
        <!-- CSS Files -->
        <link href="bootstrap/assets/css/bootstrap.min.css" rel="stylesheet" />
        <link href="bootstrap/assets/css/material-kit.css" rel="stylesheet"/>
        <link href="bootstrap/assets/css/alertas.css" rel="stylesheet"/>

        <script>
            function cambiaVisibilidad() {
                var div1 = document.getElementById('1');
                var div2 = document.getElementById('2');
                if (div2.style.display === 'block') {
                    div2.style.display = 'none';
                    div1.style.display = 'block';
                } else {
                    div2.style.display = 'block';
                    div1.style.display = 'none';
                }
            }
        </script>


    </head>

    <body class="signup-page">
     <%--    <%
         boolean recuperar = false;

     if (request.getParameter("recuperar") != null) {
        recuperar = true;
    }
    String para = "";
    String correo2 = "";
    // obtenemos el valor como fue llamado el formulario
    String idUsuario = "";
    String nombres = "";
    String correo = "";
    String contrasena = "";
    String telefono = "";

    try {
        if (recuperar) {
            Email email = new Email();
            Datos misDatos = new Datos();
            usuario miusuario = misDatos.getusuario(para);

            if (miusuario == null) {
                out.print("<script>alert('Usuario no encontrado');</script>");
            } else {
                idUsuario = miusuario.getId_usuario();
                nombres = miusuario.getNombres_usuario();
                correo2 = miusuario.getCorreo_usuario();
                contrasena = miusuario.getClave_usuario();
                telefono = miusuario.getCelular_usuario();

                out.print("<script>alert('Usuario encontrado');</script>");
            }

            boolean resultado = email.enviarCorreo(
                    "ef331a@gmail.com",
                    "contrasena%",
                    correo2,
                    "Su contraseña es: " + contrasena + "\nVolver a ingresar " + "http://localhost:8080/Coffee2O/index.jsp",
                    "recuperacion de contraseña");
            if (resultado) {
                out.print("<script>alert('Correo enviado exitosamente');</script>");
            } else {
                out.print("<script>alert('Correo no enviado'));</script>");
            }
            misDatos.cerrarconexion();
            recuperar = false;
        }

    } catch (Exception e) {
        out.print("<script>alert('Error 404 XD');</script>");
    }
        %>--%>
        <!----CABEZERA DE INICIO------------------------------------------------------------------------------------------------------------------------------>
      
            <nav class="navbar navbar-transparent navbar-absolute">
                <div class="container">
                    <div class="navbar-header">
                        <a class="navbar-brand"></a>
                    </div>
                    <div class="collapse navbar-collapse" id="navigation-example">

                    </div>
                </div>
            </nav>
            <div class="wrapper">
                <div class="header header-filter" style="background-image: url('images/eee.jpg'); background-size: cover; background-position: top center;">
                    <!----FOTMULARIO INGRESAR------------------------------------------------------------------------------------------------------------------------------>			
                      <form name="ValidarUsuario" action="ValidarUsuario" id="ValidarUsuario " method="POST">	
                    <div id='1'>
                        <div class="container">
                            <div class="row">         
                                <a style="position: absolute; top: 25%; left: 10%;">
                                    <img src="images/logoSenab.png" width="360" height="360" >
                                    <center><h1></h1></center>
                                </a>
                                <div class="col-md-4 col-md-offset-6 col-sm-1 col-sm-offset-3">
                                    <div class="card card-signup">
                                        <div class="header header-primary text-center">
                                            <img src="images/logop.png" width="190" height="110" >
                                        </div>
                                        <p class="text-divider" ></p>
                                        <div class="content">
                                            <div class="input-group">
                                                <span class="input-group-addon">
                                                    <i class="fa fa-user-circle" aria-hidden="true"></i>
                                                </span>
                                                <input required="required" type="text" name="usuario" id="usuario" value="" class="form-control" placeholder="Numero Documento">
                                            </div>
                                            <div class="input-group">
                                                <span class="input-group-addon">
                                                    <i class="fa fa-key" aria-hidden="true"></i>
                                                </span>
                                                <input required="required" type="password" name="clave" id="clave"  value=""  class="form-control" placeholder="Clave" />
                                            </div>
                                        </div>
                                        <div class="footer text-center">
                                            <input type="submit" class="btn btn-success" value="ingresar" name="ingresar"  id="ingresar">
                                          
                                        </div>

                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                   </form>
                    <!----FOTMULARIO RECUPERAR------------------------------------------------------------------------------------------------------------------------------>			
                    <div id='2' style="display:none;" >
                        <div class="container">
                            <div class="row">         
                                <a style="position: absolute; top: 25%; left: 10%;">
                                    <img src="images/logoSenab.png" width="360" height="360" >
                                    <center><h1></h1></center>
                                </a>
                                <div class="col-md-4 col-md-offset-6 col-sm-1 col-sm-offset-3">

                                    <div class="card card-signup">
                                        <div class="header header-primary text-center">
                                            <img src="images/logofic2.png" width="190" height="110" >
                                        </div>
                                        <p class="text-divider" ></p>
                                     
                                            <div class="content">
                                                <div class="input-group">
                                                    <span class="input-group-addon">
                                                        <i class="fa fa-user-circle" aria-hidden="true"></i>
                                                    </span>
                                                  
                                                </div>									
                                            </div>
                                            <div class="footer text-center">
                                                <input type="button" name="recuperar" class="btn btn-success" value="recuperar">
                                                <input type="submit" class="btn btn-success" value="iniciar" name="iniciar"  id="ss" onclick="cambiaVisibilidad()" >
                                            </div>
                                        

                                    </div>

                                </div>
                            </div>



                        </div>
                    </div>
                    <br><br>
                    <!----PIE DE PAGINA DEL LOGIN------------------------------------------------------------------------------------------------------------------------------>
                    <footer class="footer">
                        <div class="container">
                            <nav class="pull-left">
                                <ul>
                                   
                                    <li>
                                        <a href="Desarrollador.jsp">
                                            Desarrollado Por
                                        </a>
                                    </li>
                                </ul>
                            </nav>
                            <div class="copyright pull-right">
                                &copy; 2017, Hecho Por Sena 1524673
                            </div>
                        </div>
                    </footer>
                </div>
            </div>
        
    </body>
    <!--   Core JS Files   -->
    <script src="bootstrap/assets/js/jquery.min.js" type="text/javascript"></script>
    <script src="bootstrap/assets/js/bootstrap.min.js" type="text/javascript"></script>
    <script src="bootstrap/assets/js/material.min.js"></script>
    <!--  Plugin for the Sliders, full documentation here: http://refreshless.com/nouislider/ -->
    <script src="bootstrap/assets/js/nouislider.min.js" type="text/javascript"></script>
    <!--  Plugin for the Datepicker, full documentation here: http://www.eyecon.ro/bootstrap-datepicker/ -->
    <script src="bootstrap/assets/js/bootstrap-datepicker.js" type="text/javascript"></script>
    <!-- Control Center for Material Kit: activating the ripples, parallax effects, scripts from the example pages etc -->
    <script src="bootstrap/assets/js/material-kit.js" type="text/javascript"></script>
</html>
