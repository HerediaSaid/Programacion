package com.tp3.factorymethod;

public class FactoryEmail extends NotificadorFactory {
    @Override
    protected Notificacion crearNotificacion() {
        return new NotificacionEmail();
    }
}
