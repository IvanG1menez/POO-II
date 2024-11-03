package edu.unam.modelo;

/**
 * Estrategia de envío regular.
 */
public class EnvioRegular implements MetodoEnvio {
    @Override
    public double calcularCosto(double peso) {
        return peso * 5; // costo base por kilogramo
    }

    @Override
    public String descripcion() {
        return "Envío Regular";
    }
}