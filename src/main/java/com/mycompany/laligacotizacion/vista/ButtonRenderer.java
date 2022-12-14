/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laligacotizacion.vista;

import static com.mycompany.laligacotizacion.vista.VentanaProductos.t_productos;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class ButtonRenderer extends DefaultTableCellRenderer {
  @Override
  public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
    // Creamos un nuevo botón y establecemos su texto al valor de la celda
    if(value instanceof JButton){
        
        JButton miButton = (JButton) value;
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
        
                System.out.println("a");
                DefaultTableModel model = (DefaultTableModel) t_productos.getModel();
                model.removeRow(row);
                
            }
        };
        
        miButton.addActionListener(listener);
        return miButton;
                
    }

    return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
    
  }
}

// Luego, podemos establecer el renderizador personalizado para la columna deseada

// Obtenemos el número de la columna donde queremos dibujar el botón

// Establecemos el renderizador personalizado para esa columna