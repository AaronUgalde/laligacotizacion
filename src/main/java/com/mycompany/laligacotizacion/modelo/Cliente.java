/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laligacotizacion.modelo;

/**
 *
 * @author HP
 */
public class Cliente {
    
    public String nombre_empresa;
    public String correo;
    public String nombre;

    public Cliente(String correo, String nombre, Empresa miEmpresa) {
        this.correo = correo;
        this.nombre = nombre;
        this.nombre_empresa = miEmpresa.nombre_empresa;
    }
    
    public Cliente(String correo, String nombre, String nombre_empresa) {
        this.correo = correo;
        this.nombre = nombre;
        this.nombre_empresa = nombre_empresa;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre_empresa(){
        return nombre_empresa;
    }
    
    public void setIdEmpresa(Empresa miEmpresa){
        this.nombre_empresa = miEmpresa.nombre_empresa;
    }
    
}
