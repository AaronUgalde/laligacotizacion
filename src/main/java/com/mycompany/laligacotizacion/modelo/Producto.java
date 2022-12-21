/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laligacotizacion.modelo;

import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class Producto {
    
    public int unidades;
    public String nombre;
    public String descripcion;
    public int precioUnitario;
    public int subtotal;
    public static ArrayList <Producto> listaProductos = new ArrayList<>();
    
    public Producto(int unidades, String nombre, String descripcion, int precioUnitario){
        this.unidades = unidades;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precioUnitario = precioUnitario;
        this.subtotal = precioUnitario*unidades;
        listaProductos.add(this);
    }

    public static ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(int precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public int getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(int subtotal) {
        this.subtotal = subtotal;
    }
    
}
