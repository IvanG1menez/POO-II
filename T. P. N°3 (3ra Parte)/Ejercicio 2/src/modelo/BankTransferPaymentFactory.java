package modelo;

/**
 * Fábrica concreta que crea instancias de BankTransferPayment.
 */
public class BankTransferPaymentFactory extends PaymentFactory {
    @Override
    public Payment createPayment() {
        return new BankTransferPayment();
    }
}