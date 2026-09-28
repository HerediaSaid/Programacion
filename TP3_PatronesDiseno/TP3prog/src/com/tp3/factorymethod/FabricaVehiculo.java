package com.tp3.factorymethod;

/**
 * Creador abstracto. Define el metodo de fabrica "crearVehiculo"
 * que cada linea de modelo debe implementar, y un metodo de negocio
 * "venderVehiculo" que usa el producto sin conocer su clase concreta.
 */
public abstract class FabricaVehiculo {

    protected abstract Vehiculo crearVehiculo();

    public void venderVehiculo() {
        Vehiculo vehiculo = crearVehiculo();
        vehiculo.entregar();
    }
}
