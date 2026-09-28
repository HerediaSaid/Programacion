package com.tp3.adapter;

/**
 * Adapter: traduce la interfaz incompatible de la computadora de a
 * bordo vieja (millas por hora) hacia la interfaz que espera el
 * sistema de flota (kilometros por hora), sin modificar ninguna de
 * las dos clases existentes.
 */
public class AdaptadorHiluxVieja implements Velocimetro {

    private static final double MILLAS_A_KM = 1.60934;

    private final ComputadoraHiluxVieja computadoraVieja;

    public AdaptadorHiluxVieja(ComputadoraHiluxVieja computadoraVieja) {
        this.computadoraVieja = computadoraVieja;
    }

    @Override
    public int obtenerVelocidadKmh() {
        double millas = computadoraVieja.leerVelocidadEnMillas();
        return (int) Math.round(millas * MILLAS_A_KM);
    }
}
