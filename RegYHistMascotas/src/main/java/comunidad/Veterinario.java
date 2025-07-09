/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comunidad;

/**
 *
 * @author BrayanOcampo
 */
public class Veterinario {
    
    //Atributos protegidos de la clase veterinario
    private String nombre;
    private String especialidad;

    //Constructor de la clase veterinario, recibe nombre y especialidad, inicializa el objeto para despues asignarle valores
    public Veterinario(String nombre, String especialidad) {
        /*this.nombre = nombre;
        this.especialidad = especialidad;*/
        setNombre(nombre);
        setEspecialidad(especialidad);
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }
    
    public void setNombre(String nombre) {
        if(nombre == null || nombre.isBlank()){
            throw new IllegalArgumentException("El nombre no puede estar vacio");
        }
        this.nombre = nombre;
    }

    public void setEspecialidad(String especialidad) {
        if(especialidad == null || nombre.isBlank()){
             throw new IllegalArgumentException("La especialidad no puede estar vacia");
        }
        this.especialidad = especialidad;
    }  
}
