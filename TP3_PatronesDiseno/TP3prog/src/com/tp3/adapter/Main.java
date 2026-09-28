package com.tp3.adapter;

public class Main {

    private static void mostrarVelocidad(Velocimetro velocimetro, String nombreAuto) {
        System.out.println(nombreAuto + " circula a " + velocimetro.obtenerVelocidadKmh() + " km/h.");
    }

    public static void main(String[] args) {
        System.out.println("=== Patron Adapter: Velocimetro unificado para dos generaciones de Hilux ===\n");

        Velocimetro hiluxNueva = new HiluxGeneracionNueva(120);
        mostrarVelocidad(hiluxNueva, "Toyota Hilux (generacion nueva)");

        ComputadoraHiluxVieja computadoraVieja = new ComputadoraHiluxVieja(60.0);
        Velocimetro hiluxViejaAdaptada = new AdaptadorHiluxVieja(computadoraVieja);
        mostrarVelocidad(hiluxViejaAdaptada, "Toyota Hilux (generacion vieja, adaptada)");

        System.out.println("\nEl sistema de flota trata a ambas Hilux de la misma manera,");
        System.out.println("sin enterarse de que una mide en millas y la otra en kilometros.");
    }
}
