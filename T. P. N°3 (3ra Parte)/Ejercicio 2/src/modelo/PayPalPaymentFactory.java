package modelo;

/**
 * Fábrica concreta que crea instancias de PayPalPayment.
 */
public class PayPalPaymentFactory extends PaymentFactory {
    @Override
    public Payment createPayment() {
        return new PayPalPayment();
    }
}