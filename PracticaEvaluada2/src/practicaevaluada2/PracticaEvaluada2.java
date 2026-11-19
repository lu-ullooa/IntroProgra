/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicaevaluada2;
import javax.swing.JOptionPane;

/**
 *
 * @author lucianaulloa
 */
public class PracticaEvaluada2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        Producto p = new Producto(0, "", 0, 0, null);
        
        p.cantidadProductos();
        p.llenarProductos();
        p.precioBrutoProductos();
        p.gananciaProductos();
        
        Empleado e = new Empleado("", 0);
        
        e.getNombreEmpleado();
        e.getCedulaEmpleado();
        
        Super s = new Super("", 0);
        
        s.getNombreSuper();
        s.getCodigoSuper();
        

    }
    
}
