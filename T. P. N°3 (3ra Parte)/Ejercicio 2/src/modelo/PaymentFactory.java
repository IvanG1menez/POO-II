package modelo;

/**
 * Clase base para las fábricas de métodos de pago.
 * Define un método de fábrica abstracto que debe ser implementado por las subclases.
 */
public abstract class PaymentFactory {
    /**
     * Crea un objeto Payment.
     * @return Un objeto que implementa la interfaz Payment.
     */
    public abstract Payment createPayment();
}
