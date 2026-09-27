package com.tp3.decorator;

public class CapaDeSombras extends EquipamientoDecorator {

    public CapaDeSombras(Personaje personajeDecorado) {
        super(personajeDecorado);
    }

    @Override
    public String getDescripcion() {
        return super.getDescripcion() + " + Capa de Sombras";
    }

    @Override
    public int getPoderAtaque() {
        return super.getPoderAtaque() + 8;
    }
}
