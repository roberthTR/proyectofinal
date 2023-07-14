package com.example.for012;

public class MensajeForo {
    private String mensaje;
    private String autor;

    public MensajeForo() {
        // Constructor vacío requerido por Firebase
    }

    public MensajeForo(String mensaje, String autor) {
        this.mensaje = mensaje;
        this.autor = autor;
    }

    public String getMensaje() {
        return mensaje;
    }

    public String getAutor() {
        return autor;
    }
}
