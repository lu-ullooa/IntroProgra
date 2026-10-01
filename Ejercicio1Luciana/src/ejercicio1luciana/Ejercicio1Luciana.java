/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1luciana;
import javax.swing.JOptionPane;
/**
 *
 * @author lucianaulloa
 */
public class Ejercicio1Luciana {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int cantidadEmpleados = 0;
        double salarioIndividual = 0;
        double sem = 0;
        double ivm = 0;
        double sumaRubros = 0;
        double sumaSalarios = 0;
        
        String temp = "";
        String temp2 = "";
        
        temp = JOptionPane.showInputDialog("digite la cantidad de empleados: ");
        
        cantidadEmpleados = Integer.parseInt(temp);
       
        for (int i = 0; i < cantidadEmpleados; i++) {
            temp2 = JOptionPane.showInputDialog("digite los salarios individuales: ");
            salarioIndividual = Integer.parseInt(temp2);
            
            sumaSalarios = sumaSalarios + salarioIndividual;
            
            sem = sumaSalarios * 0.0925;
            ivm = sumaSalarios * 0.0508;          
        }
        
        sumaRubros = sem +ivm;
            
        JOptionPane.showMessageDialog(null, "la empresa debera abonar a la ccss el monto de "+sumaRubros+" por concepto de sem e ivm");
    }
    
}
