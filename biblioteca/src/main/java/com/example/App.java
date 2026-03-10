package com.example;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        // 1. Libro con parametros.
        Libro l1 = new Libro("Cien años de soledad", "Gabo", 10, 5);

        // 2. Libro con datos por consola
        Libro l2 = new Libro();
        System.out.println("--- Datos Libro 2 ---");
        System.out.print("Titulo: "); l2.setTitulo(lector.nextLine());
        System.out.print("Autor: "); l2.setAutor(lector.nextLine());
        System.out.print("Ejemplares: "); l2.setEjemplares(lector.nextInt());
        System.out.print("Prestados: "); l2.setPrestados(lector.nextInt());
        lector.nextLine(); // Limpiar el Enter

        // 3. LibroTextoUNIAC
        LibroTextoUNIAC lUniac = new LibroTextoUNIAC("Calculo", "Stewart", 5, 2, "Mate", "Ingenieria");

        // 4. Novela
        Novela n1 = new Novela("It", "Stephen King", 3, 1, "Terror");

        // Pruebas
        System.out.println("\n--- LISTA ---");
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(lUniac);
        System.out.println(n1);

    }
}