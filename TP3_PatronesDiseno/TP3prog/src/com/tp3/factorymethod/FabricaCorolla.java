package com.tp3.factorymethod;

public class FabricaCorolla extends FabricaVehiculo {
    @Override
    protected Vehiculo crearVehiculo() {
        return new VehiculoCorolla();
    }
}
