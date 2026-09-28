package com.tp3.facade;

/**
 * Fachada: ofrece un unico punto de entrada simple ("comprarProducto")
 * que oculta la complejidad de coordinar los tres subsistemas
 * (Inventario, ServicioPago y ServicioEnvio) que intervienen en
 * una compra online.
 */
public class TiendaFacade {

    private final Inventario inventario;
    private final ServicioPago servicioPago;
    private final ServicioEnvio servicioEnvio;

    public TiendaFacade() {
        this.inventario = new Inventario();
        this.servicioPago = new ServicioPago();
        this.servicioEnvio = new ServicioEnvio();
    }

    public boolean comprarProducto(String producto, int cantidad, double monto,
                                    String metodoPago, String direccionEnvio) {
        System.out.println("\n--- Iniciando compra de \"" + producto + "\" ---");

        if (!inventario.hayStock(producto, cantidad)) {
            System.out.println("[TiendaFacade] Compra cancelada: sin stock disponible.");
            return false;
        }

        if (!servicioPago.cobrar(monto, metodoPago)) {
            System.out.println("[TiendaFacade] Compra cancelada: el pago fue rechazado.");
            return false;
        }

        inventario.descontarStock(producto, cantidad);
        servicioEnvio.programarEnvio(producto, direccionEnvio);

        System.out.println("[TiendaFacade] Compra completada con exito.");
        return true;
    }
}
