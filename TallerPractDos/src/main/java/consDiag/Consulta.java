/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package consDiag;

/**
 *
 * @author BrayanOcampo
 */
public class Consulta {
    
    //atributos protegidos de la clase consulta
    protected String codigo;
    protected String fecha;
    protected Diagnostico diagnostico;

    //onstructor que inicializa los atributos con los valores proporcionados
    public Consulta(String codigo, String fecha, Diagnostico diagnostico) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.diagnostico = diagnostico;
    }
    
    
    public String mostrarConsulta(){
        //encabezado de la consulta
         System.out.println("Consulta");
         //imprime el codigop de la consulta
         System.out.println("Codigo: " + codigo);
         //imprime la fecha de la consulta
         System.out.println("Fecha: " + fecha);
         //imprime la descripcion de la consulta
         System.out.println("Descripción: " + diagnostico.getDescripcion());
         //imprime el tratamiento de la consulta
         System.out.println("Tratamiento: " + diagnostico.getTratamiento());
         //solo imprime información, no devuelve ningún valor, por eso retorna null.
         return null;
    } 
}
