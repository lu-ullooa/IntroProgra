/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaevaluada2;

import javax.swing.JOptionPane;

/**
 *
 * @author lucianaulloa
 */
public class Producto {
    
    Producto p = new Producto(0, "", 0, 0, null);
    
    //atributos
    private int codigoProducto = 0;
    private String nombreProducto = "";
    private int precioProducto = 0;
    int precioBaseFinal = 0;
    
    // variables
    private int cantidadProductosIngresar = 0;
    
    String clasificacionProductos = "";
    
    double precioBrutoAlimentos = 0;
    double precioBrutoBebidas = 0;
    double precioBrutoHigiene = 0;
    double precioBrutoLimpieza = 0;
    double precioBrutoFinal = 0;
    double gananciaEsperada = 0;
    
    // vector productos
    Producto productos[] = new Producto[cantidadProductosIngresar];
    
    // metodos
    public void cantidadProductos(){
        cantidadProductosIngresar = Integer.parseInt(JOptionPane.showInputDialog("cuantos productos desea ingresar?"));
    }
   
    public void llenarProductos(){
        for (int i = 0; i < productos.length; i++) {
            nombreProducto = JOptionPane.showInputDialog("digite el nombre del producto");
            precioProducto = Integer.parseInt(JOptionPane.showInputDialog("digite el precio del producto"));
            clasificacionProductos = JOptionPane.showInputDialog("tipo de producto (alimentos, bebidas, higiene, limpieza)");
            
            precioBaseFinal = precioProducto + precioProducto;
        }    
    }
    
    public void precioBrutoProductos(){
        if (clasificacionProductos.equalsIgnoreCase("alimentos")) {
            precioBrutoAlimentos = precioProducto * 0.20 + precioProducto;
            JOptionPane.showMessageDialog(null, "precio bruto alimentos: "+precioBrutoAlimentos);
        }
            if (clasificacionProductos.equalsIgnoreCase("bebidas")) {
            precioBrutoBebidas = precioProducto * 0.30 + precioProducto;
            JOptionPane.showMessageDialog(null, "precio bruto bebidas: "+precioBrutoBebidas);      
        }
                if (clasificacionProductos.equalsIgnoreCase("higiene")) {
                precioBrutoHigiene = precioProducto * 0.25 + precioProducto + 500;
                JOptionPane.showMessageDialog(null, "precio bruto higiene: "+precioBrutoHigiene);   
        }
                    if (clasificacionProductos.equalsIgnoreCase("limpieza")) {
                    precioBrutoLimpieza = precioProducto * 0.19 + precioProducto * 0.4 + precioProducto + 1000 + precioProducto;
                    JOptionPane.showMessageDialog(null, "precio bruto higiene: "+precioBrutoLimpieza);   
            
        }
                    
        precioBrutoFinal = precioBrutoAlimentos + precioBrutoBebidas + precioBrutoHigiene + precioBrutoLimpieza;            
        
    }
    
    
    public void gananciaProductos(){
        for (int i = 0; i < productos.length; i++) {
            gananciaEsperada = ((precioBrutoFinal - precioBaseFinal) * cantidadProductosIngresar);
        }  
    }
    
    // constructor
    public Producto(int codigoProducto, String nombreProducto, int precioProducto, int cantidadProductosIngresar, Producto[] productos) {
        this.codigoProducto = codigoProducto;
        this.nombreProducto = nombreProducto;
        this.precioProducto = precioProducto;
        this.precioProducto = precioProducto;     
    }
    
    // setters y getters
    public int getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(int precioProducto) {
        this.precioProducto = precioProducto;
    }

    public int getPrecioBaseFinal() {
        return precioBaseFinal;
    }

    public void setPrecioBaseFinal(int precioBaseFinal) {
        this.precioBaseFinal = precioBaseFinal;
    }

    public int getCantidadProductosIngresar() {
        return cantidadProductosIngresar;
    }

    public void setCantidadProductosIngresar(int cantidadProductosIngresar) {
        this.cantidadProductosIngresar = cantidadProductosIngresar;
    }

    public String getClasificacionProductos() {
        return clasificacionProductos;
    }

    public void setClasificacionProductos(String clasificacionProductos) {
        this.clasificacionProductos = clasificacionProductos;
    }

    public double getPrecioBrutoAlimentos() {
        return precioBrutoAlimentos;
    }

    public void setPrecioBrutoAlimentos(double precioBrutoAlimentos) {
        this.precioBrutoAlimentos = precioBrutoAlimentos;
    }

    public double getPrecioBrutoBebidas() {
        return precioBrutoBebidas;
    }

    public void setPrecioBrutoBebidas(double precioBrutoBebidas) {
        this.precioBrutoBebidas = precioBrutoBebidas;
    }

    public double getPrecioBrutoHigiene() {
        return precioBrutoHigiene;
    }

    public void setPrecioBrutoHigiene(double precioBrutoHigiene) {
        this.precioBrutoHigiene = precioBrutoHigiene;
    }

    public double getPrecioBrutoLimpieza() {
        return precioBrutoLimpieza;
    }

    public void setPrecioBrutoLimpieza(double precioBrutoLimpieza) {
        this.precioBrutoLimpieza = precioBrutoLimpieza;
    }

    public double getPrecioBrutoFinal() {
        return precioBrutoFinal;
    }

    public void setPrecioBrutoFinal(double precioBrutoFinal) {
        this.precioBrutoFinal = precioBrutoFinal;
    }

    public double getGananciaEsperada() {
        return gananciaEsperada;
    }

    public void setGananciaEsperada(double gananciaEsperada) {
        this.gananciaEsperada = gananciaEsperada;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public void setProductos(Producto[] productos) {
        this.productos = productos;
    }
    
    
    // to string
    @Override
    public String toString() {
        return "Producto{" + "codigoProducto=" + codigoProducto + ", nombreProducto=" + nombreProducto + ", precioProducto=" + precioProducto + '}';
    }
    
    
}
