/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Adsi 1135869
 */
public class Datos {

    private Connection cnn;
    public String id;
    public String ad;
    public String roles;

    public Datos() {

        try {
            Class.forName("com.mysql.jdbc.Driver");

            String db = "jdbc:mysql://localhost/fic";
            cnn = DriverManager.getConnection(db, "root", "");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void cerrarconexion() {
        try {
            cnn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String validarUsuario(String usuario, String clave) {

        try {
            //declaramos una variable String y armamos la instruccion sql que nos permitira saber si el usuario es valido o no
            /*String sql = "select idPerfil from usuario where"
                    + " idUsuario='" +usuario+ "'and"
                    + " clave ='"+clave+"'";*/
            String sql = " select id_rol,id_usuario,id_estado from usuario where"
                    + " identificacion_usuario = '" + usuario + "' and"
                    + " clave_usuario = '" + clave + "'";

// con armar la instruccion sql no significa que el usuario este consultado o no
//definimos la consulta con la base de datos nesecitamos 2 objetos 
//
            Statement st = cnn.createStatement(); // nos permite definir objeto contra la base de datos.
            ResultSet rs = st.executeQuery(sql); // ejecutamos la instruccion sql
            if (rs.next()) { // significa que si devolvio resultados (que el usuario y la clave eran validas)
                id = rs.getString("id_usuario");
                ad= rs.getString("id_estado");
                roles = rs.getString("id_rol");
                return rs.getString("id_rol");
            } else {
                return "";
            }
        } catch (SQLException ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);

            return "ingreso invalido";
        }
    }
    
}
