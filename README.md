Esta actividad consistió en crear un programa en Java que permite registrar los datos de dueños de mascotas, sus animales y las consultas médicas que les hacen con el veterinario. Todo se realiza desde consola, y el programa guía al usuario paso a paso para ingresar la información.

Clases utilizadas:
Propietario: guarda el nombre, el documento y el teléfono del dueño. También lleva una lista de sus mascotas.

Mascota: guarda el nombre, la especie y la edad. Puede tener varias consultas registradas.

Consulta: incluye un código automático y la fecha de la atención. Se muestra junto al veterinario que atendió.

Veterinario: representa al profesional encargado, con su nombre y especialidad.

IDGenerator: se encarga de crear códigos únicos para cada consulta.

RegYHistMascotas: es la clase principal donde se ejecuta todo el programa.

Cómo funciona el programa:
El usuario escribe los datos del propietario (nombre, documento, teléfono).

Luego, registra una o más mascotas.

Por cada mascota, se pueden ingresar varias consultas.

Se elige el veterinario que atendió la consulta de una lista.

Al finalizar, el programa muestra una ficha clínica completa con todos los datos ingresados.

Se pregunta si se desea hacer un nuevo registro o salir del programa.

Detalles importantes:
El programa muestra un menú claro y guiado para el ingreso de información.

Se puede registrar más de una mascota y más de una consulta por mascota.

Toda la información queda organizada y se imprime automáticamente al final.

Se evita guardar al veterinario dentro de la clase Consulta, como pidió el profesor.

