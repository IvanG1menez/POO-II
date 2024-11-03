package edu.unam.modelo;

/**
 * Interfaz que representa un método de envío en la tienda en línea.
 */
public interface MetodoEnvio {
    /**
     * Calcula el costo de envío para el pedido.
     * @param peso el peso del pedido en kilogramos.
     * @return el costo del envío.
     */
    double calcularCosto(double peso);

    /**
     * Proporciona la descripción del método de envío.
     */
    String descripcion();
}

