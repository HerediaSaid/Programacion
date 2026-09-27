package com.tp3.abstractfactory;

/**
 * Fabrica abstracta: garantiza que las unidades creadas (Guerrero y Mago)
 * pertenezcan siempre a la misma familia/faccion, sin mezclar unidades
 * humanas con orcas dentro del mismo ejercito.
 */
public interface FabricaUnidades {
    Guerrero crearGuerrero();
    Mago crearMago();
}
