package com.tp3.abstractfactory;

public class FabricaOrcos implements FabricaUnidades {
    @Override
    public Guerrero crearGuerrero() {
        return new GuerreroOrco();
    }

    @Override
    public Mago crearMago() {
        return new MagoOrco();
    }
}
