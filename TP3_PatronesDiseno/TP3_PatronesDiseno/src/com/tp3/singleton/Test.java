package com.tp3.singleton;

public class Test {
    public static void Test(String[] args) {
        System.out.println("=== Patron Singleton: Gestor de Conexion a Base de Datos ===\n");

        ConexionBD conexion1 = ConexionBD.getInstancia();
        conexion1.ejecutarConsulta("SELECT * FROM cuentas");

        ConexionBD conexion2 = ConexionBD.getInstancia();
        conexion2.ejecutarConsulta("SELECT * FROM movimientos WHERE cuenta_id = 102");

        System.out.println();
        System.out.println("¿conexion1 y conexion2 son el mismo objeto? " + (conexion1 == conexion2));
        System.out.println("Consultas totales ejecutadas sobre la unica instancia: "
                + conexion1.getConsultasEjecutadas());
    }
}
