package com.tp3.factorymethod;

public class FabricaHilux extends FabricaVehiculo {
    @Override
    protected Vehiculo crearVehiculo() {
        return new VehiculoHilux();
    }
}
