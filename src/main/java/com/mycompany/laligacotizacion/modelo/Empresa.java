/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laligacotizacion.modelo;

/**
 *
 * @author HP
 */
public class Empresa {
    
    public int idEmpresa;
    public String nombre;
    
    public Empresa (int idEmpresa, String nombre){
        this.idEmpresa = idEmpresa;
        this.nombre = nombre;
    }

    public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
     
    public void eliminarEmpresa(int idEmpresa){
        
    }
    
    public void agregarEmpresa(String nombre){
        
    }
}
