package com.tp3.facade;

/** Subsistema 3: coordina la logistica de entrega. */
public class ServicioEnvio {

    public void programarEnvio(String producto, String direccion) {
        System.out.println("[ServicioEnvio] Programando envio de \"" + producto + "\" a: " + direccion);
    }
}
