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
public class empleadohoras extends enpleado2 {

    public empleadohoras(double sueldo, double horas, String nombre, String apellido, String cedula) {
        super(nombre, apellido, cedula);
        this.sueldo = sueldo;
        this.horas = horas;
    }
    double sueldo;
    double horas;

 

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = ((horas > 0 && horas <= 168)? horas : 0);
    }

    @Override
    public double calcularingresos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
