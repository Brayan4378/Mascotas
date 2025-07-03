/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tallerpractdos;

//importa las clases Consulta y Diagnostico desde el paquete consDiag
import consDiag.Consulta;
import consDiag.Diagnostico;

/**
 *
 * @author BrayanOcampo
 */

public class TallerPractDos {

    public static void main(String[] args) {
        //crea un diagnostico con una descripción y un tratamiento largo
        Diagnostico d = new Diagnostico("Infeccion en la piel", "Administrar antibiótico tópico durante 10 días y monitorear reacción. El tratamiento es extenso, se requiere seguimiento adicional.");
        //crea una consulta con informacion del diagnostico, ademas del codigo y la fecha
        Consulta c = new Consulta("001", "3 Julio 2025", d );
        //muestra por consola los datos de la consulta
        c.mostrarConsulta();
    }
}
