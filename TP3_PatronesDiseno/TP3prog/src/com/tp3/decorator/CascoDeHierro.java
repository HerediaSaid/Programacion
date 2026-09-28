package com.tp3.decorator;

public class CascoDeHierro extends EquipamientoDecorator {

    public CascoDeHierro(Personaje personajeDecorado) {
        super(personajeDecorado);
    }

    @Override
    public String getDescripcion() {
        return super.getDescripcion() + " + Casco de Hierro";
    }

    @Override
    public int getPoderAtaque() {
        return super.getPoderAtaque() + 5;
    }
}
