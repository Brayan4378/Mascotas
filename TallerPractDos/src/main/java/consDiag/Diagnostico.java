/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package consDiag;

/**
 *
 * @author BrayanOcampo
 */
public class Diagnostico {
    
    //atributos protegidos de la clase diagnostico
    protected String descripcion;
    protected String tratamiento;

    //constructor que inicializa los atributos con los valores proporcionados
    public Diagnostico(String descripcion, String tratamiento) {
        this.descripcion = descripcion;
        this.tratamiento = tratamiento;
    }
    
    //método que verifica si una descripción es considerada larga
    public boolean esTratatamientoLargo(String descripcion){
        if(descripcion.length() > 30 ){
            return true;
        } return false;
    }

    // Método getter para obtener la descripción del diagnóstico
    public String getDescripcion() {
        return descripcion;
    }

     // Método getter para obtener la descripción del tratamiento
    public String getTratamiento() {
        return tratamiento;
    }
    
}
