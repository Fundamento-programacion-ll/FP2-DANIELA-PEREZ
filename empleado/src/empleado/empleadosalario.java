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
public class empleadosalario extends enpleado2{
    double salariosemanal;

    public empleadosalario(double salariosemanal, String nombre, String apellido, String cedula) {
        super(nombre, apellido, cedula);
        this.salariosemanal = salariosemanal;
    }

    public double getSalariosemanal() {
        return salariosemanal;
    }

    public void setSalariosemanal(double salariosemanal) {
        this.salariosemanal = salariosemanal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    @Override
    public double calcularingresos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
    
    
}
