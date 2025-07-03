/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package partDos;

import partUno.Gato;
import partUno.Mascotas;
import partUno.Perro;

/**
 *
 * @author BrayanOcampo
 */
public class TestCasting {
    
     public static void main(String[] args) {
         
        // Creamos una mascota que en realidad es un Gato
        Mascotas m = new Gato("Michi");
        // Verificamos si la mascota es un perro
        if (m instanceof Perro) {
            // Si es un perro, hacemos el casting y llamamos al método ladrar
            Perro p = (Perro) m;
            p.ladrar();
        }else {
            // Si no es ni perro ni gato, se muestra un mensaje para decir que no es conocido 
            System.out.println("Este tipo de mascota no puede ladrar");
        }
    }

    }


