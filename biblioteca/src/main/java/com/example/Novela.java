package com.example;

public class Novela extends Libro {
    private String tipo; // Ejemplo: Ciencia ficcion, Terror

    public Novela(String titulo, String autor, int ej, int pr, String tipo) {
        super(titulo, autor, ej, pr);
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return super.toString() + " | Tipo: " + tipo;
    }
}