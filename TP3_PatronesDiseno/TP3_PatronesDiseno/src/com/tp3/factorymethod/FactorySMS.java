package com.tp3.factorymethod;

public class FactorySMS extends NotificadorFactory {
    @Override
    protected Notificacion crearNotificacion() {
        return new NotificacionSMS();
    }
}
