package com.tp3.abstractfactory;

/**
 * Fabrica abstracta: garantiza que los vehiculos creados (Sedan y Pickup)
 * pertenezcan siempre a la misma marca, sin mezclar, por ejemplo, un
 * sedan Chevrolet con una pickup Toyota dentro de la misma flota.
 */
public interface FabricaVehiculos {
    Sedan crearSedan();
    Pickup crearPickup();
}
