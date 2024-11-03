package edu.unam.modelo;

/**
 * Estrategia de envío expreso.
 */
public class EnvioExpreso implements MetodoEnvio {
    @Override
    public double calcularCosto(double peso) {
        return peso * 10; // mayor costo por rapidez
    }

    @Override
    public String descripcion() {
        return "Envío Expreso";
    }
}
