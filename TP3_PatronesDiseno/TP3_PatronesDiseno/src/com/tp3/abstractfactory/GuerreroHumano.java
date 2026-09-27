package com.tp3.abstractfactory;

public class GuerreroHumano implements Guerrero {
    @Override
    public void atacar() {
        System.out.println("Guerrero Humano ataca con su espada larga.");
    }
}
