package com.tp3.facade;

/** Subsistema 2: gestiona el cobro de la compra. */
public class ServicioPago {

    public boolean cobrar(double monto, String metodoPago) {
        System.out.println("[ServicioPago] Cobrando $" + monto + " mediante " + metodoPago + "...");
        return true;
    }
}
