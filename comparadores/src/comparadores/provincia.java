/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparadores;

/**
 *
 * @author DANIELA
 */
public class provincia {
    private String bombreProvincia;
    private int numeroHabitantes;

    public provincia(String bombreProvincia, int numeroHabitantes) {
        this.bombreProvincia = bombreProvincia;
        this.numeroHabitantes = numeroHabitantes;
    }

    public String getBombreProvincia() {
        return bombreProvincia;
    }

    public void setBombreProvincia(String bombreProvincia) {
        this.bombreProvincia = bombreProvincia;
    }

    public int getNumeroHabitantes() {
        return numeroHabitantes;
    }

    public void setNumeroHabitantes(int numeroHabitantes) {
        this.numeroHabitantes = numeroHabitantes;
    }
    
    
}

