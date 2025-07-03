/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package partUno;

/**
 *
 * @author BrayanOcampo
 */
public class Mascotas {
    
    protected String nombre;

    public Mascotas(String nombre) {
        this.nombre = nombre;
    }
    
    public void saludar() { 
        System.out.println("Hola, soy " + nombre);
    } // Metodo de saludo 
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    // Getters and Setters para acceder al nombre o cambiar el valor
}

    
