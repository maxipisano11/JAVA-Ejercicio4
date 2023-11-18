package org.example;

public interface IPopularidadCancion {
    void promover(Cancion cancion);
    void degradar(Cancion cancion);

    void validarPopularidad(Cancion cancion);
    String toString(Cancion cancion);
    void setReproduccionesPopularidad(int reproducciones);
    int getReproduccionesPopularidad();
    void setDislikesPopularidad(int dislikes);
    int getDislikesPopularidad();

}
