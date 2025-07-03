/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package partUno;

/**
 *
 * @author BrayanOcampo
 */
public class Gato extends Mascotas {
    
    public Gato(String nombre) {
        super(nombre);
    }
    
    public void maullar() { //Metodo de maullar, ademas imprime el nombre heredado de la clase Mascota
        System.out.println(nombre + " dice: ¡Miau!");
    }
}
