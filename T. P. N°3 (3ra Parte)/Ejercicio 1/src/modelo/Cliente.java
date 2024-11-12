package modelo;

/**
 * Representa un cliente que puede realizar reservas de vuelos.
 * Utiliza el patrón de diseño Builder para crear reservas de vuelos de diferentes tipos.
 */
public class Cliente {

    /**
     * Realiza una reserva de vuelo de acuerdo al tipo de vuelo especificado.
     * Utiliza el patrón de diseño Builder para construir la reserva y delega la creación al Director.
     * 
     * @param tipoVuelo El tipo de vuelo a reservar (puede ser ESTANDAR o PREMIUM).
     * @param cantAsientos La cantidad de asientos a reservar.
     * @return Un objeto de tipo FlightBooking que representa la reserva realizada.
     * @throws IllegalArgumentException Si el tipo de vuelo no está soportado.
     */
    public FlightBooking hacerReserva(TipoVuelo tipoVuelo, int cantAsientos) {
        /**
         * Se crea un directorpara construir la reserva 
         */ 
        Director director = new Director();
        
        /** 
          *Se crea un builder para construir la reserva de vuelo
          */
        FlightBookingBuilder builder = new FlightBookingBuilder();

        /**Dependiendo del tipo de vuelo,
         *  se construye la reserva adecuada
         */ 
        switch (tipoVuelo) {
            case ESTANDAR:
                /**
                 * Se construye una reserva estándar 
                 * con la cantidad de asientos especificada
                 */ 
                director.construirReservaEstandar(builder, cantAsientos);
                return builder.obtenerResultado();
        
            case PREMIUM:
                /**
                 * Se construye una reserva premium 
                 * con la cantidad de asientos especificada
                 */ 
                director.construirReservaPremium(builder, cantAsientos);
                return builder.obtenerResultado();
            
            default:
                /**
                 * Si el tipo de vuelo no está soportado, 
                 * se lanza una excepción
                 */ 
                throw new IllegalArgumentException("Tipo de vuelo no soportado: " + tipoVuelo);
        }
    }
}
