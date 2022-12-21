/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.laligacotizacion.vista;

import com.mycompany.laligacotizacion.modelo.Producto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author HP
 */
public class VentanaProductos extends javax.swing.JPanel {
    
    JButton miButton = new JButton("\u2718");
   

    /**
     * Creates new form VentanaProductos
     */
    public VentanaProductos() {
        initComponents();
        t_productos.setDefaultRenderer(Object.class, new ButtonRenderer());
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tf_nombreProyecto = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        tf_nombreConcepto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tf_cantidadUnidades = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tf_precioUnitario = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta_descripcion = new javax.swing.JTextArea();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        t_productos = new javax.swing.JTable();
        btn_agrProducto = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        ta_notas = new javax.swing.JTextArea();

        setPreferredSize(new java.awt.Dimension(650, 550));

        jLabel1.setText("nombre del proyecto o servicio");

        tf_nombreProyecto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_nombreProyectoKeyTyped(evt);
            }
        });

        jLabel2.setText("nombre del concepto");

        tf_nombreConcepto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_nombreConceptoActionPerformed(evt);
            }
        });

        jLabel3.setText("cantidad de unidades");

        tf_cantidadUnidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_cantidadUnidadesActionPerformed(evt);
            }
        });
        tf_cantidadUnidades.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_cantidadUnidadesKeyTyped(evt);
            }
        });

        jLabel4.setText("precio unitario");

        tf_precioUnitario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_precioUnitarioActionPerformed(evt);
            }
        });
        tf_precioUnitario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_precioUnitarioKeyTyped(evt);
            }
        });

        jLabel5.setText("descripción");

        ta_descripcion.setColumns(20);
        ta_descripcion.setRows(5);
        jScrollPane1.setViewportView(ta_descripcion);

        t_productos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Unidad", "Concepto", "Precio unitario", "Subtotal", "Eliminar"
            }
        ){
            public boolean isCellEditable(int row, int column){
                return false;
            }

        });
        t_productos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t_productosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(t_productos);

        btn_agrProducto.setText("Agregar producto");
        btn_agrProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agrProductoActionPerformed(evt);
            }
        });

        jLabel6.setText("Notas del proyecto");

        ta_notas.setColumns(20);
        ta_notas.setRows(5);
        jScrollPane4.setViewportView(ta_notas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jSeparator2)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel1)
                        .addGap(31, 31, 31)
                        .addComponent(tf_nombreProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(87, 87, 87)
                                        .addComponent(tf_nombreConcepto, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(tf_cantidadUnidades, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(64, 64, 64)
                                        .addComponent(jLabel4)
                                        .addGap(39, 39, 39)
                                        .addComponent(tf_precioUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(32, 32, 32)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(100, 100, 100)
                                .addComponent(btn_agrProducto)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tf_nombreProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(tf_nombreConcepto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tf_cantidadUnidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(tf_precioUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(btn_agrProducto)
                        .addGap(135, 135, 135)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(415, 415, 415))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tf_nombreConceptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_nombreConceptoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_nombreConceptoActionPerformed

    private void tf_cantidadUnidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_cantidadUnidadesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_cantidadUnidadesActionPerformed

    private void tf_precioUnitarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_precioUnitarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_precioUnitarioActionPerformed

    private void btn_agrProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agrProductoActionPerformed
        DefaultTableModel model = (DefaultTableModel) t_productos.getModel();
        try{
            
            Producto miProducto = new Producto(Integer.parseInt(tf_cantidadUnidades.getText()),tf_nombreConcepto.getText(),ta_descripcion.getText(),Integer.parseInt(tf_precioUnitario.getText()));
            model.addRow(new Object[]{miProducto.getUnidades(),miProducto.getNombre(),miProducto.getPrecioUnitario(),miProducto.getSubtotal(),(JButton)miButton});
            
        }catch(Exception e){
        
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Verifique los datosa del producto");
            
        }
    }//GEN-LAST:event_btn_agrProductoActionPerformed

    private void t_productosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t_productosMouseClicked
        
        int column = t_productos.getSelectedColumn();
        int row = t_productos.getSelectedRow();
        
        if(row < t_productos.getRowCount() && row >= 0 && column < t_productos.getColumnCount() && column >= 0){
        
            Object value = t_productos.getValueAt(row, column);
            if(value instanceof JButton){
        
                DefaultTableModel model = (DefaultTableModel) t_productos.getModel();
                model.removeRow(row);
                Producto.listaProductos.remove(row);
                
            }
        }  
    }//GEN-LAST:event_t_productosMouseClicked

    private void tf_nombreProyectoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_nombreProyectoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_nombreProyectoKeyTyped

    private void tf_cantidadUnidadesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_cantidadUnidadesKeyTyped
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;
        
        if (!numeros)
        {
            evt.consume();
        }
    }//GEN-LAST:event_tf_cantidadUnidadesKeyTyped

    private void tf_precioUnitarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_precioUnitarioKeyTyped
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;
        
        if (!numeros)
        {
            evt.consume();
        }
    }//GEN-LAST:event_tf_precioUnitarioKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agrProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    public static javax.swing.JTable t_productos;
    private javax.swing.JTextArea ta_descripcion;
    public static javax.swing.JTextArea ta_notas;
    private javax.swing.JTextField tf_cantidadUnidades;
    private javax.swing.JTextField tf_nombreConcepto;
    public static javax.swing.JTextField tf_nombreProyecto;
    private javax.swing.JTextField tf_precioUnitario;
    // End of variables declaration//GEN-END:variables
}
