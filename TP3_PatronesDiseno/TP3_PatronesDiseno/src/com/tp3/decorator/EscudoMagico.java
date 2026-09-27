package com.tp3.decorator;

public class EscudoMagico extends EquipamientoDecorator {

    public EscudoMagico(Personaje personajeDecorado) {
        super(personajeDecorado);
    }

    @Override
    public String getDescripcion() {
        return super.getDescripcion() + " + Escudo Magico";
    }

    @Override
    public int getPoderAtaque() {
        return super.getPoderAtaque() + 3;
    }
}
