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
        
        Super s = new Super("super chino", 12345);
        
        Producto p = new Producto(0, "", 0, 0, null);
        
        p.cantidadProductos();
        p.llenarProductos();
        p.precioBrutoProductos();
        p.gananciaProductos();
        
        

    }
    
}
