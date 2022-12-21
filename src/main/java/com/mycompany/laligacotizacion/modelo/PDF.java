/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laligacotizacion.modelo;

import java.util.List;

public class PDF {
    
    public String nombreEmpresa;
    public String nombreCliente;
    public String correoCliente;
    public String nombreProyecto;
    public List<Producto> productos;
    public String notas;
    
    public PDF (String empresa, Cliente cliente, String nombreProyecto, List<Producto> productos, String notas){
    
        this.nombreEmpresa = empresa;
        this.nombreCliente = cliente.nombre;
        this.correoCliente = cliente.correo;
        this.nombreProyecto = nombreProyecto;
        this.productos = productos;
        this.notas = notas;
        
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getCorreoCliente() {
        return correoCliente;
    }

    public void setCorreoCliente(String correoCliente) {
        this.correoCliente = correoCliente;
    }

    public String getNombreProyecto() {
        return nombreProyecto;
    }

    public void setNombreProyecto(String nombreProyecto) {
        this.nombreProyecto = nombreProyecto;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public String getNotas() {
        return notas;
    }

    public void setFechaDeEntrega(String notas) {
        this.notas = notas;
    }

    public void generarPDF() {
        
    }
}
