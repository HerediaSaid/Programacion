package com.tp3.factorymethod;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Patron Factory Method: Notificaciones de una app de delivery ===\n");

        NotificadorFactory factoryEmail = new FactoryEmail();
        factoryEmail.notificar("Tu pedido #4521 fue confirmado", "cliente@correo.com");

        NotificadorFactory factorySMS = new FactorySMS();
        factorySMS.notificar("Tu pedido llegara en 20 minutos", "+54 381 555 1234");

        NotificadorFactory factoryPush = new FactoryPush();
        factoryPush.notificar("¡El repartidor esta en camino!", "dispositivo-usr-123");
    }
}
