package com.example.for012;

public class Post {
    private String titulo;
    private String contenido;

    public Post() {

    }

    public Post(String titulo, String contenido) {
        this.titulo = titulo;
        this.contenido = contenido;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getContenido() {
        return contenido;
    }
}
