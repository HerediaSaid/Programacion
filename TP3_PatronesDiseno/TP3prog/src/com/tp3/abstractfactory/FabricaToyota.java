package com.tp3.abstractfactory;

public class FabricaToyota implements FabricaVehiculos {
    @Override
    public Sedan crearSedan() {
        return new Corolla();
    }

    @Override
    public Pickup crearPickup() {
        return new Hilux();
    }
}
