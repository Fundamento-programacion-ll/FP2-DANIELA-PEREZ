/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal;

/**
 *
 * @author DANIELA
 */
public class Perro extends Animal{
    private float estatura;

    Perro(int i, String perro, String masculino, String dogy, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public float getEstatura() {
        return estatura;
    }

    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }

    public void datosPerro (){
    
        System.out.println("Nombre: "+getNombre()+" edad: " + getEdad() + " Estatura: " + getEstatura());
        System.out.println(suma(1, 2));
}
    
    
    public Perro(float estatura, String especie, String genero, String nombre, int edad) {
        super(especie, genero, nombre, edad);
        this.estatura = estatura;
    }

    public Perro(float estatura) {
        this.estatura = estatura;
    }
    
}
