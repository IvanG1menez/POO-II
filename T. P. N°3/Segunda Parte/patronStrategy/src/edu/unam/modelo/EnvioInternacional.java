package edu.unam.modelo;

/**
 * Estrategia de envío internacional.
 */
public class EnvioInternacional implements MetodoEnvio {
    @Override
    public double calcularCosto(double peso) {
        return peso * 20 + 50; // costo más alto con un cargo adicional
    }

    @Override
    public String descripcion() {
        return "Envío Internacional";
    }
}
