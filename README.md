1ra parte 
- ¿Qué pasa si se envía una clase que **no hereda** de `Mascota`?

Si se envía una clase que no hereda de mascota el programa no compilara, debido a que el método recibirMascota esta diseñado únicamente para recibir clases que hereden de mascota, es decir que si se envían otras clases el sistema no lo leerá y por ende no compilara.

- ¿Cómo se comporta si eliminas el `instanceof` y casteas directamente?

Si se elimina el instanceof y se castea directamente estaría la posibilidad de que funcione pero se corre el riesgo de que se cometan errores como lo es el intentar forzar una conversión de clase que no pertenece a ese tipo, por ejemplo si el programa recibe un gato e intenta convertirlo a perro sin verificar con instanceof, el sistema mostrara un error en la consola.


Final

- ¿Qué modificadores son accesibles desde una subclase en otro paquete?

Desde una subclase ubicada en otro paquete diferente, solo se puede acceder a los elementos que están marcados como:

public: accesibles desde cualquier lugar.

-¿Qué modificadores permiten acceder desde cualquier clase del mismo paquete?

Desde cualquier clase que esté en el mismo paquete, se puede acceder a:

public: accesibles desde cualquier lugar.

protected: accesible dentro del mismo paquete, incluso sin herencia.

default (sin modificador): accesible solo dentro del mismo paquete.

- ¿Qué pasaría si todos los atributos fueran public?

Si todos los atributos fueran public, cualquier clase de cualquier parte del proyecto podría acceder directamente a ellos, sin importar el paquete ni si hay herencia; Esto rompe el encapsulamiento.

Esto significa que cualquier clase podría leer y modificar libremente los datos internos del objeto, lo que puede causar errores, inseguridad y un código difícil de mantener.
