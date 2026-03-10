# Parcial-1-Practica-Programacion-II

1. El uso de clases "final"
Si se me ocurriera ponerle final a la clase Libro, básicamente le estaría cerrando la puerta a las demás. El modificador final le dice a Java que esa clase es "hija única" y que nadie puede heredar de ella.

Asi se se vería el error:
public final class Libro {
    // Si dice final, Novela o LibroTexto darían error al intentar extenderla
}


Si intentas hacer un extends Libro, el compilador te va a sacar un error diciendo que no se puede heredar de una clase final. Esto rompe todo el sentido de nuestro sistema de biblioteca.

2. Constructores privados
Si por error pongo el constructor de Libro como private, las clases hijas como Novela o LibroTexto no tendrían forma de construirse.

CóAsi se vería el error:

public class Libro {
    private String titulo;

    private Libro(String titulo) { // Constructor privado
        this.titulo = titulo;
    }
}

cuando creas una subclase, esta siempre tiene que llamar al constructor de su "padre" usando super(). Si el constructor del padre es privado, es invisible para los hijos, así que el código no compilaría.

idea para mejora:

1. Datos que faltan (Atributos)
El ISBN: Ahora no hay cómo diferenciar dos libros que se llamen igual pero sean de edicion distintas. Meter el código ISBN sería bueno para que el sistema no tenga tantas  haya confusiones.

Año en que salió el libro:para los libros de texto, es bueno saber qué tan viejos son. Así se puede avisar si la información ya está muy desactualizada.

2. Una función extra (Método)
Saber qué tanto nos queda: Estaría bueno tener un método que nos diga, en porcentaje, qué tantos libros hay disponibles en los estantes comparado con el total.

 para que el bibliotecario sepa si un libro es "tendencia" o si urge comprar más copias porque casi nunca hay ninguna disponible.


 El diagrama uml esta en el archivo(DiagramaUm.png)