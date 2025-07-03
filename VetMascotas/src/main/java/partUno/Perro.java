/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package partUno;

import partUno.Mascotas;

/**
 *
 * @author BrayanOcampo
 */
public class Perro extends Mascotas {
    
    public Perro(String nombre) {
        super(nombre);
    }
    
     public void ladrar() { // Metodo de ladrar, ademas imprime el nombre heredado de la clase Mascotas
        System.out.println(nombre + " dice: ¡Guau!");
    }
}
