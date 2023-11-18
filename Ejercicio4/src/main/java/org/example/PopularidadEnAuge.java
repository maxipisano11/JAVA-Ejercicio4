package org.example;

public class PopularidadEnAuge implements IPopularidadCancion{
    private int reproduccionesPopularidad;
    private int dislikesPopularidad;
    @Override
    public void promover(Cancion cancion) {
        cancion.setPopularidad(new PopularidadEnTendencia());
        cancion.setHorasUltimaReproduccion(0);
        cancion.getPopularidad().setReproduccionesPopularidad(0);
        cancion.getPopularidad().setDislikesPopularidad(0);
        cancion.setIcono(new Icono(new int[]{0xD83D, 0xDD25}));
    }

    @Override
    public void degradar(Cancion cancion) {
        cancion.setPopularidad(new PopularidadNormal());
        cancion.setHorasUltimaReproduccion(0);
        cancion.getPopularidad().setReproduccionesPopularidad(0);
        cancion.getPopularidad().setDislikesPopularidad(0);
        cancion.setIcono(new Icono(new int[]{0xD83C, 0xDFB5}));
    }

    @Override
    public void validarPopularidad(Cancion cancion) {
        if((this.reproduccionesPopularidad > 50000) && (cancion.getLikes() > 20000)){
            this.promover(cancion);
        }else if(this.getDislikesPopularidad() > 5000){
            this.degradar(cancion);
        }
    }

    @Override
    public String toString(Cancion cancion) {
        return cancion.getIcono().texto() +
                " " + cancion.getArtista() +
                " - " + cancion.getTitulo() +
                " (" + cancion.getAlbum() +
                " - " + cancion.getAnioLanzamiento() + ")";
    }

    @Override
    public void setReproduccionesPopularidad(int reproducciones) {
        this.reproduccionesPopularidad = reproducciones;
    }

    @Override
    public int getReproduccionesPopularidad() {
        return this.reproduccionesPopularidad;
    }

    public int getDislikesPopularidad() {
        return dislikesPopularidad;
    }

    public void setDislikesPopularidad(int dislikesPopularidad) {
        this.dislikesPopularidad = dislikesPopularidad;
    }
}
