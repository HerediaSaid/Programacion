package com.tp3.facade;


public class ServicioPago {

    public boolean cobrar(double monto, String metodoPago) {
        System.out.println("[ServicioPago] Cobrando $" + monto + " mediante " + metodoPago + "...");
        return true;
    }
}
