/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comunidad;

import java.util.ArrayList;

/**
 *
 * @author BrayanOcampo
 */
public class Historial {
    
      private ArrayList<Consulta> consultas;private Veterinario vet;

    public Historial() {
        this.consultas = new ArrayList<>();
    }

    public void agregarConsulta(Consulta consulta) {
        if (consulta != null) {
            consultas.add(consulta);
        }
    }

    public void mostrarConsultas(Veterinario vet) {
        if (consultas.isEmpty()) {
            System.out.println("No hay consultas registradas.");
        } else {
            
            for (Consulta c : consultas) {
                c.MostrarDetallesConsulta(vet);
                System.out.println("--------------------------");
            }
        }
    }

    public ArrayList<Consulta> getConsultas() {
        return new ArrayList<>(consultas);
    }
}
