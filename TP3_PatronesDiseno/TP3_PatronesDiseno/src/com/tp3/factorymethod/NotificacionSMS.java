package com.tp3.factorymethod;

public class NotificacionSMS implements Notificacion {
    @Override
    public void enviar(String mensaje, String destinatario) {
        System.out.println("[SMS] A " + destinatario + ": " + mensaje);
    }
}
