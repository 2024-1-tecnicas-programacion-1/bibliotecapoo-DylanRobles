package com.mycompany.bibliotecapoo;

public class Libro {
    private String titulo;
    private String autor;
    private int anoPublicacion;
    private String genero;
    private boolean leido;

    Libro(String autor, String titulo, int anoPublicacion, String genero) {
        this.autor = autor;
        this.titulo = titulo;
        this.anoPublicacion = anoPublicacion;
        this.genero = genero;
    }
//complejidad temporal : O(1)
    public String mostrarInformacion() {
        String info = "Titulo:[" + titulo + "], Autor:[" + autor + "], Año de publicaciòn:[" + anoPublicacion
                + "], Genero:[" + genero + "]";

        return info;
    }
//complejidad temporal : O(1)
    
public void marcarLeido() {
        leido = true;
    }
//complejidad temporal : O(1)
    public boolean esAntiguo() {
        return (2024 - anoPublicacion >= 50);
    }
//complejidad temporal : O(1)
    public boolean getLeido() {
        return leido;
    }


    public String getTitulo(){

        return titulo;
    }

    public String getAutor(){

    return autor;

    }

    public String getGenero(){

        return genero;
    }


}
