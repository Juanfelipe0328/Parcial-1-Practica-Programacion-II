package com.example;

public class LibroTextoUNIAC extends LibroTexto {
    private String facultad;

    public LibroTextoUNIAC(String t, String a, int ej, int pr, String c, String f) {
        super(t, a, ej, pr, c);
        this.facultad = f;
    }

    @Override
    public String toString() {
        return super.toString() + " | Facultad: " + facultad;
    }
}