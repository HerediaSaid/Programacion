package com.tp3.factorymethod;

public class NotificacionPush implements Notificacion {
    @Override
    public void enviar(String mensaje, String destinatario) {
        System.out.println("[PUSH] Dispositivo " + destinatario + " -> " + mensaje);
    }
}
