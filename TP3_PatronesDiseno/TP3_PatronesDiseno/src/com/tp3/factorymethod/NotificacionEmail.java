package com.tp3.factorymethod;

public class NotificacionEmail implements Notificacion {
    @Override
    public void enviar(String mensaje, String destinatario) {
        System.out.println("[EMAIL] Para " + destinatario + ": \"" + mensaje + "\"");
    }
}
