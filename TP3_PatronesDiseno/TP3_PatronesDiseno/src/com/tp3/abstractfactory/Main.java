package com.tp3.abstractfactory;

public class Main {

    private static void formarEjercito(FabricaUnidades fabrica, String nombreFaccion) {
        System.out.println("--- Formando ejercito: " + nombreFaccion + " ---");
        Guerrero guerrero = fabrica.crearGuerrero();
        Mago mago = fabrica.crearMago();
        guerrero.atacar();
        mago.lanzarHechizo();
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("=== Patron Abstract Factory: Ejercitos de un videojuego ===\n");

        FabricaUnidades fabricaHumanos = new FabricaHumanos();
        formarEjercito(fabricaHumanos, "Reino Humano");

        FabricaUnidades fabricaOrcos = new FabricaOrcos();
        formarEjercito(fabricaOrcos, "Horda Orca");
    }
}
