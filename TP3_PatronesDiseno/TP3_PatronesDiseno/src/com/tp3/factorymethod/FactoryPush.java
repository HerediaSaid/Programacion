package com.tp3.factorymethod;

public class FactoryPush extends NotificadorFactory {
    @Override
    protected Notificacion crearNotificacion() {
        return new NotificacionPush();
    }
}
