package com.tp3.decorator;

/**
 * Decorador abstracto: envuelve a un Personaje y delega en el,
 * permitiendo que las subclases agreguen comportamiento (equipamiento)
 * antes o despues de delegar, sin usar herencia rigida por cada
 * combinacion posible de items.
 */
public abstract class EquipamientoDecorator implements Personaje {

    protected final Personaje personajeDecorado;

    protected EquipamientoDecorator(Personaje personajeDecorado) {
        this.personajeDecorado = personajeDecorado;
    }

    @Override
    public String getDescripcion() {
        return personajeDecorado.getDescripcion();
    }

    @Override
    public int getPoderAtaque() {
        return personajeDecorado.getPoderAtaque();
    }
}
