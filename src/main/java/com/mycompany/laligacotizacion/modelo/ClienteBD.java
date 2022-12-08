/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laligacotizacion.modelo;

import com.mycompany.laligacotizacion.controlador.Conexion;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class ClienteBD {
    
    public void registrarCliente(String nombre, String correo, int idEmpresa){
    
        Conexion miConexion = new Conexion();
        
        try{
        
            PreparedStatement ps = miConexion.getConnection().prepareStatement("INSERT INTO cliente VALUES(?,?,?)");
            ps.setString(1, nombre);
            ps.setString(2, correo);
            ps.setInt(3, idEmpresa);
            ps.executeQuery();
            
        }catch(SQLException e){
        
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "no se registro el cliente");
            
        }
    
    }
    
    public void eliminarCliente(String nombre){
    
        Conexion miConexion = new Conexion();
        
        try{
        
            PreparedStatement ps = miConexion.getConnection().prepareStatement("DELETE FROM cliente WHERE nombre_cliente = (?)");
            ps.setString(1, nombre);
            ps.executeQuery();
            
        }catch(SQLException e){
        
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "no se elimino el cliente");
            
        }
        
    }
    
    public void obtenerClientes(){
    
    
        
    }
    
}
