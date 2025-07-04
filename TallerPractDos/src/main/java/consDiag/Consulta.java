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
    
    
    public  void mostrarConsulta(){
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
         //Si la descripcion del tratamiento presenta mas de 30 caracteres imprime un mensaje "El tratamiento es extenso"
         if(diagnostico.esTratamientoLargo()){
             //impresion de que el tratamiento es extenso (true)
             System.out.println(" El tratamiento es extenso, se requiere seguimiento adicional.");
             //si la descripcion presenta 30 o menos caracteres imprime "El tratamiento es corto"
         }else{ 
             //impresion de que el tratamiento es corto (false)
             System.out.println("El tratamiento es corto, no requiere seguimiento adicional");
         }
         //solo imprime información, no devuelve ningún valor, por eso retorna null.
    } 
}
