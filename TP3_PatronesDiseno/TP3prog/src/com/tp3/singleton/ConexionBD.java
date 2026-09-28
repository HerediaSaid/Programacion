package com.tp3.singleton;

/**
 * Representa la unica conexion activa hacia la base de datos central
 * de un sistema bancario. Se implementa como Singleton porque abrir
 * multiples conexiones simultaneas seria costoso e innecesario: toda
 * la aplicacion debe compartir el mismo recurso de acceso a datos.
 */
public class ConexionBD {

    private static volatile ConexionBD instancia;

    private final String urlConexion;
    private int consultasEjecutadas;

    private ConexionBD() {
        this.urlConexion = "jdbc:postgresql://localhost:5432/banco_central";
        this.consultasEjecutadas = 0;
        System.out.println("[ConexionBD] Nueva conexion fisica creada hacia " + urlConexion);
    }

    public static ConexionBD getInstancia() {
        if (instancia == null) {
            synchronized (ConexionBD.class) {
                if (instancia == null) {
                    instancia = new ConexionBD();
                }
            }
        }
        return instancia;
    }

    public void ejecutarConsulta(String consultaSQL) {
        consultasEjecutadas++;
        System.out.println("[ConexionBD] Ejecutando -> " + consultaSQL);
    }

    public int getConsultasEjecutadas() {
        return consultasEjecutadas;
    }
}
