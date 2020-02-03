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
public class empleadocomision extends enpleado2 {
    double ventasbrutas;
    double tarifacomision;

    public empleadocomision(double ventasbrutas, double tarifacomision, String nombre, String apellido, String cedula) {
        super(nombre, apellido, cedula);
        this.ventasbrutas = ventasbrutas;
        this.tarifacomision = tarifacomision;
    }

    

    public double getVentasbrutas() {
        return ventasbrutas;
    }

    public void setVentasbrutas(double ventasbrutas) {
        this.ventasbrutas = ventasbrutas;
    }

    public double getTarifacomision() {
        return tarifacomision;
    }

    public void setTarifacomision(double tarifacomision) {
        this.tarifacomision = tarifacomision;
    }

    @Override
    public double calcularingresos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
