/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laligacotizacion.modelo;

import com.itextpdf.io.font.constants.StandardFonts;
import com.itextpdf.kernel.colors.ColorConstants;
import com.itextpdf.kernel.colors.DeviceCmyk;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import static com.itextpdf.kernel.pdf.PdfName.BaseFont;
import com.itextpdf.kernel.pdf.PdfPage;
import com.itextpdf.kernel.pdf.PdfReader;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.kernel.pdf.canvas.PdfCanvas;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.Style;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.element.Text;
import com.mycompany.laligacotizacion.controlador.NumeroALetra;

import java.io.File;
import java.io.IOException;
import java.util.List;
import javax.swing.JFileChooser;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.time.LocalDate;
 

public class PDF {
    
    public String nombreEmpresa;
    public String nombreCliente;
    public String correoCliente;
    public String nombreProyecto;
    public List<Producto> productos;
    public String notas;
    public float total;
    public float iva;
    public float totaliva;
    public String letras;
    
    public PDF (String empresa, Cliente cliente, String nombreProyecto, List<Producto> productos, String notas){
    
        this.nombreEmpresa = empresa;
        this.nombreCliente = cliente.nombre;
        this.correoCliente = cliente.correo;
        this.nombreProyecto = nombreProyecto;
        this.productos = productos;
        for (Producto c: productos){
        
            this.total += c.subtotal;
            
        }
        this.iva = (float) (this.total * 0.16);
        this.totaliva = iva+total;
        this.letras = NumeroALetra.cantidadConLetra(String.valueOf(totaliva)).toUpperCase();
        System.out.println(total);
        System.out.println(iva);
        System.out.println(totaliva);
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

    public void generarPDF() throws IOException {
        
        PdfReader reader = new PdfReader("PDF\\formato.pdf");
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int returnValue = fileChooser.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
        
            File selectedFile = fileChooser.getSelectedFile();
            String path = selectedFile.getAbsolutePath();
            PdfDocument stamper = new PdfDocument(reader,
                new PdfWriter(path+"/cotizacion_"+nombreProyecto+".pdf"));
            Document doc = new Document(stamper);
            PdfPage page = stamper.getPage(1);
            PdfCanvas canvas = new PdfCanvas(page);
            
            Style style = new Style();
            style.setFontColor(ColorConstants.WHITE);
            
            //fecha
            canvas.beginText();
            canvas.setFontAndSize(PdfFontFactory.createFont(StandardFonts.HELVETICA),12);
            canvas.moveText(100, 700);
            canvas.showText(LocalDate.now().toString());
            canvas.endText();
            
            //Empresa
            canvas.beginText();
            canvas.setFontAndSize(PdfFontFactory.createFont(StandardFonts.HELVETICA),12);
            canvas.moveText(100, 675);
            canvas.showText(nombreEmpresa);
            canvas.endText();
            
            //Contacto
            canvas.beginText();
            canvas.setFontAndSize(PdfFontFactory.createFont(StandardFonts.HELVETICA),12);
            canvas.moveText(100, 650);
            canvas.showText(nombreCliente);
            canvas.endText();
            
            //Proyecto
            canvas.beginText();
            canvas.setFontAndSize(PdfFontFactory.createFont(StandardFonts.HELVETICA),12);
            canvas.moveText(100, 625);
            canvas.showText(nombreProyecto);
            canvas.endText();
            
            //Tabla
        
            Table tabla = new Table(4).useAllAvailableWidth();
            tabla.setFixedPosition(20, 125, stamper.getPage(1).getMediaBox().getWidth()-40);
            
            Cell unidad = new Cell().add(new Paragraph(new Text("Unidad").setFontColor(com.itextpdf.kernel.colors.ColorConstants.WHITE)));
            unidad.setBackgroundColor(ColorConstants.BLUE);
            tabla.addCell(unidad);
            
            Cell descripción = new Cell().add(new Paragraph(new Text("descripción").setFontColor(com.itextpdf.kernel.colors.ColorConstants.WHITE)));
            descripción.setBackgroundColor(ColorConstants.BLUE);
            tabla.addCell(descripción);

            Cell unitario = new Cell().add(new Paragraph(new Text("unitario").setFontColor(com.itextpdf.kernel.colors.ColorConstants.WHITE)));
            unitario.setBackgroundColor(ColorConstants.BLUE);
            tabla.addCell(unitario);
            
            Cell subtotal = new Cell().add(new Paragraph(new Text("subtotal").setFontColor(com.itextpdf.kernel.colors.ColorConstants.WHITE)));
            subtotal.setBackgroundColor(ColorConstants.BLUE);
            tabla.addCell(subtotal);
            
            for(Producto p: this.productos){
            
                Cell unidadProducto = new Cell().add(new Paragraph(String.valueOf(p.unidades)));
                tabla.addCell(unidadProducto);
                
                Cell descripciónProducto = new Cell().add(new Paragraph(p.nombre+": "+p.descripcion));
                tabla.addCell(descripciónProducto);
                
                Cell unitarioProducto = new Cell().add(new Paragraph(String.valueOf(p.precioUnitario)));
                tabla.addCell(unitarioProducto);
                
                Cell subtotalProducto = new Cell().add(new Paragraph(String.valueOf(p.subtotal)));
                tabla.addCell(subtotalProducto);
                
            }
            
            Cell notas = new Cell(2,2).add(new Paragraph(this.notas));
            tabla.addCell(notas);
            
            Cell textoTotal = new Cell().add(new Paragraph("TOTAL"));
            tabla.addCell(textoTotal);
            
            Cell total = new Cell().add(new Paragraph(String.valueOf(this.total)));
            tabla.addCell(total);
            
            Cell textoIva = new Cell().add(new Paragraph("IVA"));
            tabla.addCell(textoIva);
            
            Cell iva = new Cell().add(new Paragraph(String.valueOf(this.iva)));
            tabla.addCell(iva);
            
            Cell totalenletra = new Cell(1,2).add(new Paragraph(this.letras));
            tabla.addCell(totalenletra);
            
            Cell textoTotal2 = new Cell().add(new Paragraph("TOTAL"));
            tabla.addCell(textoTotal2);
            
            Cell totalIva = new Cell().add(new Paragraph(String.valueOf(totaliva)));
            tabla.addCell(totalIva);
            
            doc.add(tabla);
            
            stamper.close();
            reader.close();
        }
    }
}
