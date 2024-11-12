import modelo.*;
import java.util.Scanner;

/**
 * Clase principal que permite al usuario elegir un método de pago
 * y procesa el pago utilizando la fábrica correspondiente.
 */
public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        /**Uso de try-with-resources para asegurar 
         *que el Scanner se cierre automáticamente. 
         */ 
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Choose a payment method: 1. Credit Card 2. PayPal 3. Bank Transfer");

            /** Verificamos si el siguiente 
             * token es un entero antes de leerlo
             * 
             */
            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                return; // Termina la ejecución si la entrada no es válida.
            }

            int choice = scanner.nextInt(); // Captura la opción del usuario.
            PaymentFactory paymentFactory;

            /**
             * Se selecciona la fábrica concreta según la opción elegida por el usuario.
             * 
             */
            switch (choice) {
                case 1:
                    paymentFactory = new CreditCardPaymentFactory();
                    break;
                case 2:
                    paymentFactory = new PayPalPaymentFactory();
                    break;
                case 3:
                    paymentFactory = new BankTransferPaymentFactory();
                    break;
                default:
                    System.out.println("Invalid choice. Please select 1, 2, or 3.");
                    return; // Termina la ejecución si la opción no es válida.
            }

            /**  Crea la instancia de Payment 
             * y procesa el pago
             * 
             */
            Payment payment = paymentFactory.createPayment();
            /** Ejemplo de procesamiento
             *  con una cantidad de $100.
             */ 
            payment.processPayment(100.0);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
