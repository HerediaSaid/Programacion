package com.tp3.adapter;

/**
 * Computadora de a bordo de una Hilux de generacion vieja (adaptado /
 * "adaptee"). Solo sabe informar la velocidad en millas por hora, un
 * formato distinto al que espera el sistema de flota. No podemos
 * modificar esta clase porque representa el hardware original del
 * vehiculo, tal cual vino de fabrica en su epoca.
 */
public class ComputadoraHiluxVieja {

    private final double velocidadEnMillas;

    public ComputadoraHiluxVieja(double velocidadEnMillas) {
        this.velocidadEnMillas = velocidadEnMillas;
    }

    public double leerVelocidadEnMillas() {
        return velocidadEnMillas;
    }
}
