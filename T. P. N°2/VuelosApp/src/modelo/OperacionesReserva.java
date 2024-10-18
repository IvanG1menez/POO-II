package modelo;

/**
 * Interfaz que define las operaciones relacionadas con la reserva de asientos.
 */
public interface OperacionesReserva {

    /**
     * Método para reservar un asiento para un cliente.
     * 
     * @param asiento asiento que se desea reservar
     * @param cliente cliente que realiza la reserva
     */
    void reservarAsiento(String asiento, Cliente cliente);

    /**
     * Método para cancelar una reserva existente.
     */
    void cancelarReserva();
}

