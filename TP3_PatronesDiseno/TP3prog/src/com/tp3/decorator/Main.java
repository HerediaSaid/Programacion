package com.tp3.decorator;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Patron Decorator: Equipamiento de un personaje de RPG ===\n");

        Personaje heroe = new PersonajeBase("Aldric el Valiente", 10);
        System.out.println(heroe.getDescripcion() + " | Poder de ataque: " + heroe.getPoderAtaque());

        heroe = new CascoDeHierro(heroe);
        System.out.println(heroe.getDescripcion() + " | Poder de ataque: " + heroe.getPoderAtaque());

        heroe = new EscudoMagico(heroe);
        System.out.println(heroe.getDescripcion() + " | Poder de ataque: " + heroe.getPoderAtaque());

        heroe = new CapaDeSombras(heroe);
        System.out.println(heroe.getDescripcion() + " | Poder de ataque: " + heroe.getPoderAtaque());
    }
}
