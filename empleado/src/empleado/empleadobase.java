/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleado;

/**
 *
 * @author DANIELA
 */
public class empleadobase extends empleadocomision {
    double salariobase;

    public empleadobase(double salariobase, double ventasbrutas, double tarifacomision, String nombre, String apellido, String cedula) {
        super(ventasbrutas, tarifacomision, nombre, apellido, cedula);
        this.salariobase = salariobase;
    }

    

    

    public double getSalariobase() {
        return salariobase;
    }

    public void setSalariobase(double salariobase) {
        this.salariobase = salariobase;
    }
    
    
}
