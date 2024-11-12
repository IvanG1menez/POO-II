package modelo;

/**
 * Implementación del método de pago con tarjeta de crédito.
 */
public class CreditCardPayment implements Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }
}