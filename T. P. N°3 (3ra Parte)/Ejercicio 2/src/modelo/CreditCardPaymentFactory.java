package modelo;

/**
 * Fábrica concreta que crea instancias de CreditCardPayment.
 */
public class CreditCardPaymentFactory extends PaymentFactory {
    @Override
    public Payment createPayment() {
        return new CreditCardPayment();
    }
}