package com.tp3.adapter;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Patron Adapter: Integracion de una pasarela de pago externa ===\n");

        ProcesadorPago pagoLocal = new ProcesadorPagoLocal();
        pagoLocal.procesarPago(150.0);

        PasarelaPagoExterna sdkExterno = new PasarelaPagoExterna();
        ProcesadorPago pagoAdaptado = new AdaptadorPasarelaExterna(sdkExterno);
        pagoAdaptado.procesarPago(320.5);

        System.out.println("\nAmbos pagos se procesaron a traves de la misma interfaz ProcesadorPago,");
        System.out.println("sin que el resto del sistema conozca la diferencia entre ambas implementaciones.");
    }
}
