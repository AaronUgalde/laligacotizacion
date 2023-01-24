/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laligacotizacion.modelo;

import com.itextpdf.io.font.constants.StandardFonts;
import com.itextpdf.kernel.colors.Color;
import com.itextpdf.kernel.colors.ColorConstants;
import com.itextpdf.kernel.colors.DeviceCmyk;
import com.itextpdf.kernel.colors.DeviceRgb;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import static com.itextpdf.kernel.pdf.PdfName.BaseFont;
import com.itextpdf.kernel.pdf.PdfPage;
import com.itextpdf.kernel.pdf.PdfReader;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.kernel.pdf.canvas.PdfCanvas;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.Style;
import com.itextpdf.layout.borders.Border;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.element.Text;
import com.itextpdf.layout.properties.TextAlignment;
import com.mycompany.laligacotizacion.controlador.NumeroALetra;

import java.io.File;
import java.io.IOException;
import java.util.List;
import javax.swing.JFileChooser;

 

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
    public String fecha;
    
    public PDF (String empresa, Cliente cliente, String nombreProyecto, List<Producto> productos, String notas, String fecha){
    
        this.nombreEmpresa = empresa;
        this.fecha = fecha;
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
            canvas.showText(fecha);
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
            tabla.setFixedPosition(20, 275, stamper.getPage(1).getMediaBox().getWidth()-40);
            tabla.setBorder(Border.NO_BORDER);
            
            Cell unidad = new Cell().add(new Paragraph(new Text("Unidad").setFontColor(com.itextpdf.kernel.colors.ColorConstants.WHITE)));
            unidad.setBackgroundColor(ColorConstants.BLUE);
            unidad.setTextAlignment(TextAlignment.CENTER);
            unidad.setBorder(Border.NO_BORDER);
            tabla.addCell(unidad);
            
            Cell descripción = new Cell().add(new Paragraph(new Text("Descripción").setFontColor(com.itextpdf.kernel.colors.ColorConstants.WHITE)));
            descripción.setBackgroundColor(ColorConstants.BLUE);
            descripción.setTextAlignment(TextAlignment.CENTER);
            descripción.setBorder(Border.NO_BORDER);
            tabla.addCell(descripción);

            Cell unitario = new Cell().add(new Paragraph(new Text("Unitario").setFontColor(com.itextpdf.kernel.colors.ColorConstants.WHITE)));
            unitario.setBackgroundColor(ColorConstants.BLUE);
            unitario.setTextAlignment(TextAlignment.CENTER);
            unitario.setBorder(Border.NO_BORDER);
            tabla.addCell(unitario);
            
            Cell subtotal = new Cell().add(new Paragraph(new Text("Subtotal").setFontColor(com.itextpdf.kernel.colors.ColorConstants.WHITE)));
            subtotal.setBackgroundColor(ColorConstants.BLUE);
            subtotal.setTextAlignment(TextAlignment.CENTER);
            subtotal.setBorder(Border.NO_BORDER);
            tabla.addCell(subtotal);
            
            Color colorAzulfuerte = new DeviceRgb(12, 189, 233);
            Color colorAzul = new DeviceRgb(185, 226, 236);
            Color miColor = colorAzul;
            
            for(Producto p: this.productos){
                
                Cell unidadProducto = new Cell().add(new Paragraph("$"+String.valueOf(p.unidades)));
                unidadProducto.setBackgroundColor(miColor);
                unidadProducto.setTextAlignment(TextAlignment.CENTER);
                unidadProducto.setBorder(Border.NO_BORDER);
                tabla.addCell(unidadProducto);
                
                Cell descripciónProducto = new Cell().add(new Paragraph(p.nombre+": "+p.descripcion));
                descripciónProducto.setBackgroundColor(miColor);
                descripciónProducto.setTextAlignment(TextAlignment.CENTER);
                descripciónProducto.setBorder(Border.NO_BORDER);
                tabla.addCell(descripciónProducto);
                
                Cell unitarioProducto = new Cell().add(new Paragraph(String.valueOf(p.precioUnitario)));
                unitarioProducto.setBackgroundColor(miColor);
                unitarioProducto.setBorder(Border.NO_BORDER);
                tabla.addCell(unitarioProducto);
                
                Cell subtotalProducto = new Cell().add(new Paragraph(String.valueOf(p.subtotal)));
                subtotalProducto.setBackgroundColor(miColor);
                subtotalProducto.setBorder(Border.NO_BORDER);
                tabla.addCell(subtotalProducto);
                
                if(miColor == colorAzul){
                
                    miColor = colorAzulfuerte;
                    
                }else{
                
                    miColor = colorAzul;
                    
                }
                
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
