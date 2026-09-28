package com.tp3.abstractfactory;

public class Corolla implements Sedan {
    @Override
    public void conducir() {
        System.out.println("Toyota Corolla: sedan familiar, bajo consumo y gran confiabilidad.");
    }
}
