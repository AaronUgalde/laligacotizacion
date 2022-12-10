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
    
    public int idCliente;
    public int idEmpresa;
    public String correo;
    public String nombre;

    public Cliente(int idCliente, String correo, String nombre, Empresa miEmpresa) {
        this.idCliente = idCliente;
        this.correo = correo;
        this.nombre = nombre;
        this.idEmpresa = miEmpresa.idEmpresa;
    }
    
    public Cliente(int idCliente, String correo, String nombre, int idEmpresa) {
        this.idCliente = idCliente;
        this.correo = correo;
        this.nombre = nombre;
        this.idEmpresa = idEmpresa;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
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
    
    public int getIdEmpresa(){
        return idEmpresa;
    }
    
    public void setIdEmpresa(Empresa miEmpresa){
        this.idEmpresa = miEmpresa.idEmpresa;
    }
    
}
