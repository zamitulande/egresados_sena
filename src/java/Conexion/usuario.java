/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;


/**
 *
 * @author   Adsi 1135869
 */
public class usuario {    
     private String id_usuario;
    private String identificacion_usuario;
    private Integer id_titulacion;                   
    private Integer id_rol;
    private Integer id_estado;
    private String nombres_usuario;
    private String apellidos_usuario;
    private String clave_usuario;
    private String celular_usuario;
    private String correo_usuario;

    public usuario(String id_usuario, String identificacion_usuario, Integer id_titulacion, Integer id_rol, Integer id_estado, String nombres_usuario, String apellidos_usuario, String clave_usuario, String celular_usuario, String correo_usuario) {
        this.id_usuario = id_usuario;
        this.identificacion_usuario = identificacion_usuario;
        this.id_titulacion = id_titulacion;
        this.id_rol = id_rol;
        this.id_estado = id_estado;
        this.nombres_usuario = nombres_usuario;
        this.apellidos_usuario = apellidos_usuario;
        this.clave_usuario = clave_usuario;
        this.celular_usuario = celular_usuario;
        this.correo_usuario = correo_usuario;
    }

    public String getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(String id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getIdentificacion_usuario() {
        return identificacion_usuario;
    }

    public void setIdentificacion_usuario(String identificacion_usuario) {
        this.identificacion_usuario = identificacion_usuario;
    }

    public Integer getId_titulacion() {
        return id_titulacion;
    }

    public void setId_titulacion(Integer id_titulacion) {
        this.id_titulacion = id_titulacion;
    }

    public Integer getId_rol() {
        return id_rol;
    }

    public void setId_rol(Integer id_rol) {
        this.id_rol = id_rol;
    }

    public Integer getId_estado() {
        return id_estado;
    }

    public void setId_estado(Integer id_estado) {
        this.id_estado = id_estado;
    }

    public String getNombres_usuario() {
        return nombres_usuario;
    }

    public void setNombres_usuario(String nombres_usuario) {
        this.nombres_usuario = nombres_usuario;
    }

    public String getApellidos_usuario() {
        return apellidos_usuario;
    }

    public void setApellidos_usuario(String apellidos_usuario) {
        this.apellidos_usuario = apellidos_usuario;
    }

    public String getClave_usuario() {
        return clave_usuario;
    }

    public void setClave_usuario(String clave_usuario) {
        this.clave_usuario = clave_usuario;
    }

    public String getCelular_usuario() {
        return celular_usuario;
    }

    public void setCelular_usuario(String celular_usuario) {
        this.celular_usuario = celular_usuario;
    }

    public String getCorreo_usuario() {
        return correo_usuario;
    }

    public void setCorreo_usuario(String correo_usuario) {
        this.correo_usuario = correo_usuario;
    }
    

   

}