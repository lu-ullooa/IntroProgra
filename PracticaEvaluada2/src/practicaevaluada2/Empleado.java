/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaevaluada2;

/**
 *
 * @author lucianaulloa
 */
public class Empleado {
    
    // atributos
    private String nombreEmpleado = "juanito";
    private int cedulaEmpleado = 167809999;
    
    // constructor
    public Empleado() {
    }
    
    // setters y getters
    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public int getCedulaEmpleado() {
        return cedulaEmpleado;
    }

    public void setCedulaEmpleado(int cedulaEmpleado) {
        this.cedulaEmpleado = cedulaEmpleado;
    }
    
    // to string
    @Override
    public String toString() {
        return "Empleado{" + "nombreEmpleado=" + nombreEmpleado + ", cedulaEmpleado=" + cedulaEmpleado + '}';
    }
    
    
}
