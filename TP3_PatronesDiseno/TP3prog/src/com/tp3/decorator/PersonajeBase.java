package com.tp3.decorator;

/** Componente concreto: un guerrero sin ningun equipamiento adicional. */
public class PersonajeBase implements Personaje {

    private final String nombre;
    private final int ataqueBase;

    public PersonajeBase(String nombre, int ataqueBase) {
        this.nombre = nombre;
        this.ataqueBase = ataqueBase;
    }

    @Override
    public String getDescripcion() {
        return nombre;
    }

    @Override
    public int getPoderAtaque() {
        return ataqueBase;
    }
}
