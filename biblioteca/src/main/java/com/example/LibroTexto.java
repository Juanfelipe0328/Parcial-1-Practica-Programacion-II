package com.example;

public class LibroTexto extends Libro {
    private String curso;

    public LibroTexto(String titulo, String autor, int ej, int pr, String curso) {
        super(titulo, autor, ej, pr);
        this.curso = curso;
    }

    @Override
    public String toString() {
        return super.toString() + " | Curso: " + curso;
    }
}