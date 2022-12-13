/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laligacotizacion.modelo;

import com.mycompany.laligacotizacion.controlador.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class ClienteBD {
    
    public static ArrayList<Cliente> listaClientes = new ArrayList<>();
    
    public static void registrarCliente(String nombre, String correo, int idEmpresa){
    
        Conexion miConexion = new Conexion();
        
        try{
        
            PreparedStatement ps = miConexion.getConnection().prepareStatement("INSERT INTO cliente (nombre_cliente, correo_cliente, idempresa) VALUES(?,?,?)");
            ps.setString(1, nombre);
            ps.setString(2, correo);
            ps.setInt(3, idEmpresa);
            ps.executeUpdate();
            
        }catch(SQLException e){
        
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "no se registro el cliente");
            
        }
    
    }
    
    public static void eliminarCliente(String nombre){
    
        Conexion miConexion = new Conexion();
        
        try{
        
            PreparedStatement ps = miConexion.getConnection().prepareStatement("DELETE FROM cliente WHERE nombre_cliente = (?)");
            ps.setString(1, nombre);
            ps.executeUpdate();
            
        }catch(SQLException e){
        
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "no se elimino el cliente");
            
        }
        
    }
    
    public static ArrayList<Cliente> obtenerClientes(int idEmpresa){
    
        Conexion miConexion = new Conexion ();
        ResultSet rs = null;
        listaClientes.clear();
        
        try{
        
            PreparedStatement ps = miConexion.getConnection().prepareStatement("SELECT * FROM cliente WHERE idempresa = (?)");
            ps.setInt(1, idEmpresa);
            rs = ps.executeQuery();
            
            while(rs.next()){
            
                Cliente miCliente = new Cliente(rs.getInt(1),rs.getString(3),rs.getString(2),rs.getInt(4));
                listaClientes.add(miCliente);
                
            }
            
        }catch(SQLException e){
            
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "no se obtuvieron los clientes");
            
        }
        
        if(listaClientes.isEmpty()){
        
            JOptionPane.showMessageDialog(null,"no tienes clientes agregados");
            
        }
        
        return listaClientes;
        
    }

    public static ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }
    
    public static Cliente getCliente(String nombre) {
        
        for (Cliente c: listaClientes){
        
            if(c.getNombre().equals(nombre)){
            
                return c;
                
            }
            
        }
        return null;
    }
}
