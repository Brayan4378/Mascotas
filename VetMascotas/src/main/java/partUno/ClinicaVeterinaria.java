/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package partUno;

/**
 *
 * @author BrayanOcampo
 */
public class ClinicaVeterinaria {

    public void recibirMascota(Mascotas m) {
        System.out.println("Recibiendo a: " + m.nombre); // Imprime el nombre de la mascota que se esta recibiendo
        m.saludar(); // Accede al metodo saludar el cual es heredado de la clase Mascota 

        // Verifica si el objeto recibido es una instancia de la clase Perro
        if (m instanceof Perro) {
            ((Perro) m).ladrar(); // Si es un Perro, lo castea (convierte) y llama al método ladrar()
        // Verifica si el objeto recibido es una instancia de la clase Gato
        } else if (m instanceof Gato) {
            ((Gato) m).maullar(); // Si es un Gato, lo castea (convierte) y llama al método maullar()
        } else {
            // Si no es ni Perro ni Gato, se muestra un mensaje indicando que no se reconoce el tipo
            System.out.println("Tipo de mascota no reconocido.");
        }
    }
    }

