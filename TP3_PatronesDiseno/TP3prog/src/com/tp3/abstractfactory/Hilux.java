package com.tp3.abstractfactory;

public class Hilux implements Pickup {
    @Override
    public void cargar() {
        System.out.println("Toyota Hilux: pickup 4x4, ideal para trabajo pesado y off-road.");
    }
}
