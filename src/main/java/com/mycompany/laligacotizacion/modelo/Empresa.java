/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laligacotizacion.modelo;

import com.mycompany.laligacotizacion.controlador.Conexion;
import java.sql.PreparedStatement;

/**
 *
 * @author HP
 */
public class Empresa {
    
    public String nombre_empresa;
    
    public Empresa (String nombre_empresa){
        this.nombre_empresa = nombre_empresa;
    }

    public String getNombre() {
        return nombre_empresa;
    }

    public void setNombre(String nombre) {
        this.nombre_empresa = nombre_empresa;
    }
}
