package modelo;

/**
 * Implementación del método de pago con transferencia bancaria.
 */
public class BankTransferPayment implements Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing bank transfer payment of $" + amount);
    }
}