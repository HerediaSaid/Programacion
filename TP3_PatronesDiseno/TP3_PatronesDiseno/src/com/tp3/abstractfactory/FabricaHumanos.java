package com.tp3.abstractfactory;

public class FabricaHumanos implements FabricaUnidades {
    @Override
    public Guerrero crearGuerrero() {
        return new GuerreroHumano();
    }

    @Override
    public Mago crearMago() {
        return new MagoHumano();
    }
}
