package com.tp3.adapter;


public class ProcesadorPagoLocal implements ProcesadorPago {
    @Override
    public void procesarPago(double montoEnDolares) {
        System.out.println("[PagoLocal] Cobrando USD " + montoEnDolares + " con procesador propio.");
    }
}
