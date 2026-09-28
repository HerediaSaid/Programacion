package com.tp3.factorymethod;

public class VehiculoHilux implements Vehiculo {
    @Override
    public void entregar() {
        System.out.println("[Toyota Hilux] Pickup 4x4 entregada, lista para trabajo pesado.");
    }
}
