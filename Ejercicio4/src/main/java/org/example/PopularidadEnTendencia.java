package org.example;

import java.sql.SQLOutput;

public class PopularidadEnTendencia implements IPopularidadCancion{
    int reproduccionesPopularidad;
    int dislikesPopularidad;
    @Override
    public void promover(Cancion cancion) {
        System.out.println("No puede subir más.");
    }

    @Override
    public void degradar(Cancion cancion) {
        cancion.setPopularidad(new PopularidadNormal());
        cancion.getPopularidad().setReproduccionesPopularidad(0);
        cancion.getPopularidad().setDislikesPopularidad(0);
        cancion.setIcono(new Icono(new int[]{0xD83C, 0xDFB5}));
    }

    @Override
    public void validarPopularidad(Cancion cancion) {
        if(cancion.getHorasUltimaReproduccion() > 24){
            this.degradar(cancion);
        }
    }

    @Override
    public void setReproduccionesPopularidad(int reproducciones) {
        this.reproduccionesPopularidad = reproducciones;
    }

    @Override
    public int getReproduccionesPopularidad() {
        return this.reproduccionesPopularidad;
    }

    @Override
    public String toString(Cancion cancion) {
        return cancion.getIcono().texto() +
                " " + cancion.getArtista() +
                " - " + cancion.getTitulo() +
                " (" + cancion.getAlbum() +
                " - " + cancion.getAnioLanzamiento() + ")";
    }

    public int getDislikesPopularidad() {
        return dislikesPopularidad;
    }

    public void setDislikesPopularidad(int dislikesPopularidad) {
        this.dislikesPopularidad = dislikesPopularidad;
    }
}
