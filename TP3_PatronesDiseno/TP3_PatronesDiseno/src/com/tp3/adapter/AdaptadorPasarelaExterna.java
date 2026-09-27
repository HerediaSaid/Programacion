package com.tp3.adapter;


public class AdaptadorPasarelaExterna implements ProcesadorPago {

    private final PasarelaPagoExterna pasarelaExterna;

    public AdaptadorPasarelaExterna(PasarelaPagoExterna pasarelaExterna) {
        this.pasarelaExterna = pasarelaExterna;
    }

    @Override
    public void procesarPago(double montoEnDolares) {
        String montoTexto = String.valueOf(montoEnDolares);
        pasarelaExterna.realizarTransaccion(montoTexto, "USD");
    }
}
