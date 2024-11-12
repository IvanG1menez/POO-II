import modelo.*;

/**
 * Clase principal que simula el proceso de realizar reservas de vuelos.
 * Se crean instancias de clientes y se gestionan reservas de vuelos de tipo estándar y premium.
 */
public class Main {

    /**
     * Método principal que ejecuta el proceso de creación de reservas.
     * Crea un cliente y realiza dos reservas de vuelo: una estándar y una premium.
     * 
     * @param args Argumentos de la línea de comandos (no utilizados en este caso).
     * @throws Exception Si ocurre algún error al hacer la reserva.
     */
    public static void main(String[] args) throws Exception {
        
        /**
         * Crear una instancia de Cliente
         */ 
        Cliente cliente = new Cliente();

        /**
         *  Hacer una reserva estándar para 2 personas
         */
        FlightBooking reservaEstandar = cliente.hacerReserva(TipoVuelo.ESTANDAR, 2);
        System.out.println("\nDetalles de la reserva estándar:");
        System.out.println(reservaEstandar);

        /**
         * Hacer una reserva premium para 1 persona
         */ 
        FlightBooking reservaPremium = cliente.hacerReserva(TipoVuelo.PREMIUM, 1);
        System.out.println("\nDetalles de la reserva premium:");
        System.out.println(reservaPremium);
    }
}

