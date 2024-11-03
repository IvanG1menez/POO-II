package edu.unam.modelo;

/**
 * Clase que representa un pedido en la tienda en línea.
 */
public class Pedido {
    private MetodoEnvio metodoEnvio;
    private double peso;

    /**
     * Constructor que inicializa el peso del pedido.
     * @param peso el peso del pedido en kilogramos.
     */
    public Pedido(double peso) {
        this.peso = peso;
    }

    /**
     * Establece el método de envío para el pedido.
     * @param metodoEnvio el método de envío a utilizar.
     */
    public void establecerMetodoEnvio(MetodoEnvio metodoEnvio) {
        this.metodoEnvio = metodoEnvio;
    }

    /**
     * Calcula el costo de envío con el método actual.
     */
    public void calcularCostoEnvio() {
        if (metodoEnvio != null) {
            double costo = metodoEnvio.calcularCosto(peso);
            System.out.println(metodoEnvio.descripcion() + " - Costo: $" + costo);
        } else {
            System.out.println("Método de envío no especificado.");
        }
    }
}

