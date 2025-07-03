package com.mycompany.jerarquiamacotas;

import partUno.Perro;
import partUno.Mascotas;
import partUno.Gato;
import partUno.ClinicaVeterinaria;

/**
 *
 * @author BrayanOcampo
 */
public class ClinicaMacotas {

    public static void main(String[] args) {
        
  ClinicaVeterinaria c = new ClinicaVeterinaria();

        Mascotas m1 = new Perro("Toby");
        Mascotas m2 = new Gato("Pelusa");

        c.recibirMascota(m1);
        c.recibirMascota(m2);
    }
}
    

