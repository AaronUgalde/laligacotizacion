/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laligacotizacion.modelo;

import com.mycompany.laligacotizacion.controlador.NumeroALetra;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class Producto {
    
    public int unidades;
    public String nombre;
    public String descripcion;
    public float precioUnitario;
    public float subtotal;
    public String letras;
    public static ArrayList <Producto> listaProductos = new ArrayList<>();
    
    public Producto(int unidades, String nombre, String descripcion, float precioUnitario){
        this.unidades = unidades;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precioUnitario = precioUnitario;
        this.subtotal = precioUnitario*unidades;
        this.letras = NumeroALetra.cantidadConLetra(String.valueOf(subtotal)).toUpperCase();
        listaProductos.add(this);
    }
    
    public Producto(int unidades, String nombre, String descripcion, int precioUnitario, boolean modificado){
        this.unidades = unidades;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precioUnitario = precioUnitario;
        this.subtotal = precioUnitario*unidades;
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

    public float getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(int precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(int subtotal) {
        this.subtotal = subtotal;
    }
    
    public static void imprimirLista (){
    
        for(Producto c : listaProductos){
        
            System.out.println(c.getNombre());
            
        }
        
    }

    public String getLetras() {
        return letras;
    }

    public void setLetras(String letras) {
        this.letras = letras;
    }
    
    
}
