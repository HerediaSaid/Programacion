package com.tp3.adapter;

/** La Hilux de ultima generacion ya entrega la velocidad directamente en km/h. */
public class HiluxGeneracionNueva implements Velocimetro {

    private final int velocidadActual;

    public HiluxGeneracionNueva(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    @Override
    public int obtenerVelocidadKmh() {
        return velocidadActual;
    }
}
