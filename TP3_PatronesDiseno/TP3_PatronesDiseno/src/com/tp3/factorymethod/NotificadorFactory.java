package com.tp3.factorymethod;


public abstract class NotificadorFactory {

    protected abstract Notificacion crearNotificacion();

    public void notificar(String mensaje, String destinatario) {
        Notificacion notificacion = crearNotificacion();
        notificacion.enviar(mensaje, destinatario);
    }
}
