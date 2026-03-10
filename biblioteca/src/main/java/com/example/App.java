package com.example;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("----- EXAMEN PARCIAL 1: SISTEMA BIBLIOTECA -----");

        // 1. Crear objeto libro1 utilizando el constructor con parámetros
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", 10, 0);

        // 2. Crear objeto libro2 utilizando el constructor por defecto y obtener datos por consola
        // NOTA: Requiere que en Libro.java exista: public Libro() {}
        Libro libro2 = new Libro(); 
        System.out.println("\n--- Registro de Libro 2 ---");
        System.out.print("Ingrese el título: ");
        libro2.setTitulo(sc.nextLine());
        System.out.print("Ingrese el autor: ");
        libro2.setAutor(sc.nextLine());
        libro2.setEjemplares(5); // Le asignamos valores por defecto para la prueba
        libro2.setPrestados(0);

        // 3. Crear un objeto libroTextoUNIAC con todos sus atributos
        LibroTextoUNIAC libroUNIAC = new LibroTextoUNIAC("Cálculo Diferencial", "James Stewart", 8, 0, "Matemáticas", "Facultad de Ingeniería");

        // 4. Crear un objeto novela indicando su tipo
        Novela novela1 = new Novela("El resplandor", "Stephen King", 4, 0, "Terror");

        // --- PROBAR LOS MÉTODOS DE PRÉSTAMO Y DEVOLUCIÓN ---
        System.out.println("\n--- Pruebas de Funcionamiento ---");
        
        // Probar préstamo en libro1
        // Cambia prestar() por prestamo()
        if (libro1.prestamo()) { 
            System.out.println("Préstamo exitoso de: " + libro1.getTitulo());
        }

        // Cambia devolver() por devolucion()
        if (libro1.devolucion()) {
            System.out.println("Devolución exitosa de: " + libro1.getTitulo());
        }

        // Mostrar resumen de los objetos creados (Usando polimorfismo/toString)
        System.out.println("\n--- Resumen de Objetos Creados ---");
        System.out.println(libro1.toString());
        System.out.println(libro2.toString());
        System.out.println(libroUNIAC.toString());
        System.out.println(novela1.toString());

        sc.close();
        System.out.println("\nSISTEMA FINALIZADO CON ÉXITO");
    }
}