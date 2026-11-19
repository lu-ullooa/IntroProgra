/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaevaluada2;

/**
 *
 * @author lucianaulloa
 */
public class Super {
    
    Super s = new Super("super chino", 12345);
    
    // atributos
    private String nombreSuper = "super chino";
    private int codigoSuper = 12345;
    
    // constructor
    public Super(String nombreSuper, int codigoSuper) {
        this.nombreSuper = nombreSuper;
        this.codigoSuper = codigoSuper;
    }

    // setters y getters
    public String getNombreSuper() {
        return nombreSuper;
    }

    public void setNombreSuper(String nombreSuper) {
        this.nombreSuper = nombreSuper;
    }

    public int getCodigoSuper() {
        return codigoSuper;
    }

    public void setCodigoSuper(int codigoSuper) {
        this.codigoSuper = codigoSuper;
    }
    
    // to string
    @Override
    public String toString() {
        return "Super{" + "nombreSuper=" + nombreSuper + ", codigoSuper=" + codigoSuper + '}';
    }
    
    
    
    
}
