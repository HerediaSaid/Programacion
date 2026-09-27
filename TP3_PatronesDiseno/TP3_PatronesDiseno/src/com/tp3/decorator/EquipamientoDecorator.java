package com.tp3.decorator;


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
