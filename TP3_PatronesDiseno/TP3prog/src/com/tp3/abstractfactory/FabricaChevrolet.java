package com.tp3.abstractfactory;

public class FabricaChevrolet implements FabricaVehiculos {
    @Override
    public Sedan crearSedan() {
        return new Cruze();
    }

    @Override
    public Pickup crearPickup() {
        return new S10();
    }
}
