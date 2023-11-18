package org.example;

import lombok.Getter;
import lombok.Setter;

public class Cancion {
    @Getter    @Setter
    private String titulo;

    @Getter    @Setter
    private String artista;

    @Getter    @Setter
    private String album;

    @Getter    @Setter
    private int anioLanzamiento;

    @Getter    @Setter
    private int reproducciones = 0;

    @Getter @Setter
    private int likes = 0;

    @Getter @Setter
    private int dislikes = 0;

    @Getter    @Setter
    private int horasUltimaReproduccion = 0;

    @Getter    @Setter
    private IPopularidadCancion popularidad;

    private Icono icono = new Icono(new int[]{0xD83C, 0xDFB5});

    public void setIcono(Icono icono) {
        this.icono = icono;
    }

    public Icono getIcono() {
        return icono;
    }

    public Cancion(String titulo, String artista, String album, int anioLanzamiento) {
        this.titulo = titulo;
        this.artista = artista;
        this.album = album;
        this.anioLanzamiento = anioLanzamiento;
        this.popularidad = new PopularidadNormal();

    }

    public void repoducir(){
        this.reproducciones ++;
        this.getPopularidad().setReproduccionesPopularidad(this.getPopularidad().getReproduccionesPopularidad() + 1);
        this.popularidad.validarPopularidad(this);
        System.out.println(this.popularidad.toString(this));
    }

    public void darLike() {
        this.likes = this.likes++;
        this.popularidad.validarPopularidad(this);
    }

    public void setDislikes(){
        this.dislikes = this.dislikes++;
        this.getPopularidad().setDislikesPopularidad(this.getPopularidad().getDislikesPopularidad() + 1);
        this.popularidad.validarPopularidad(this);
    }

    public void validarHorasSinReproducir(){
        this.getPopularidad().validarPopularidad(this);
    }

}
