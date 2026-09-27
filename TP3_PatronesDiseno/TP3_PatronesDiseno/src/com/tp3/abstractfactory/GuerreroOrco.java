package com.tp3.abstractfactory;

public class GuerreroOrco implements Guerrero {
    @Override
    public void atacar() {
        System.out.println("Guerrero Orco ataca con un hacha de doble filo.");
    }
}
