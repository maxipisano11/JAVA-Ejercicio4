package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Se crea la instancia y se reproduce al lanzarse...");
        Cancion cancion = new Cancion("The Scientist", "Coldplay", "A Rush of Blood to the head", 2002);
        cancion.repoducir();
        System.out.println("\r\n Se setea cantidad de reproducciones para el estado de popularidad...");
        cancion.getPopularidad().setReproduccionesPopularidad(1001);
        cancion.repoducir();
        System.out.println("\r\n Se setean dislikes para bajar a popularidad normal...");
        cancion.getPopularidad().setDislikesPopularidad(5001);
        cancion.repoducir();
        System.out.println("\r\n Se setea cantidad de reproducciones parar pasar al siguiente estado. \r\n Se pensó para que controle los estados en base a cada reproducción o cada like/dislike");
        cancion.getPopularidad().setReproduccionesPopularidad(5500);
        cancion.setLikes(20001);
        cancion.repoducir();
        System.out.println("\r\n Se setea la cantidad de reproducciones parar ser tendencia. Antes se había seteado la cantidad de likes...");
        cancion.getPopularidad().setReproduccionesPopularidad(50001);
        cancion.repoducir();
        System.out.println("\r\n Se setea la cantidad de horas sin reproducciones...");
        cancion.setHorasUltimaReproduccion(25);
        cancion.validarHorasSinReproducir();
        cancion.repoducir();
    }
}