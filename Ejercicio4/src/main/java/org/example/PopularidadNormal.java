package org.example;

public class PopularidadNormal implements IPopularidadCancion {
    int reproduccionesPopularidad;
    int dislikesPopularidad;


    @Override
    public void promover(Cancion cancion) {
        cancion.setPopularidad(new PopularidadEnAuge());
        cancion.setHorasUltimaReproduccion(0);
        cancion.getPopularidad().setReproduccionesPopularidad(0);
        cancion.getPopularidad().setDislikesPopularidad(0);
        cancion.setIcono(new Icono(new int[]{0xD83D, 0xDE80}));
    }

    @Override
    public void degradar(Cancion cancion) {
        System.out.println("No se puede caer más bajo\r\n");
    }

    @Override
    public void validarPopularidad(Cancion cancion) {
        if (this.reproduccionesPopularidad > 1000){
            this.promover(cancion);
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

    public int getDislikesPopularidad() {
        return dislikesPopularidad;
    }

    public void setDislikesPopularidad(int dislikesPopularidad) {
        this.dislikesPopularidad = dislikesPopularidad;
    }

    @Override
    public String toString(Cancion cancion) {
        return cancion.getIcono().texto() +
                " " + cancion.getArtista() +
                " - " + cancion.getAlbum() +
                " - " + cancion.getTitulo();
    }
}
