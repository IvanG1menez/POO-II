package modelo;

/**
 * Interfaz común para todos los métodos de pago.
 */
public interface Payment {
    /**
     * Procesa el pago con una cantidad específica.
     * @param amount La cantidad a procesar.
     */
    void processPayment(double amount);
}
