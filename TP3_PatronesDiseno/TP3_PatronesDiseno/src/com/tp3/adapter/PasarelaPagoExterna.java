package com.tp3.adapter;


public class PasarelaPagoExterna {
    public void realizarTransaccion(String montoTexto, String codigoMoneda) {
        System.out.println("[PasarelaExterna-SDK] Transaccion de " + montoTexto
                + " " + codigoMoneda + " procesada por la pasarela externa.");
    }
}
