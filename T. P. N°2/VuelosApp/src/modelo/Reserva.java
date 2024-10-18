package modelo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Clase que representa una reserva de vuelo. Implementa la interfaz {@link OperacionesReserva}.
 */
public class Reserva implements OperacionesReserva {
    /**
     * Número de confirmación de la reserva.
     */
    private String numeroConfirmacion;

    /**
     * Fecha y hora en que se realizó la reserva.
     */
    private LocalDateTime fechaReserva;

    /**
     * Vuelo asociado a la reserva.
     */
    private Vuelo vuelo;

    /**
     * Asiento reservado para el cliente.
     */
    private String asiento;

    /**
     * Cliente que realizó la reserva.
     */
    private Cliente cliente;

    /**
     * Indica si la reserva está activa o ha sido cancelada.
     */
    private boolean esActiva;

    /**
     * Formato para mostrar la fecha y hora de la reserva.
     */
    private static final DateTimeFormatter FORMATO_FECHA_HORA = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

    /**
     * Constructor de la clase Reserva.
     * 
     * @param numeroConfirmacion número de confirmación de la reserva
     * @param fechaReserva       fecha y hora en que se realizó la reserva
     * @param vuelo              vuelo asociado a la reserva
     * @param asiento            asiento reservado
     * @param cliente            cliente que realiza la reserva
     */
    public Reserva(String numeroConfirmacion, LocalDateTime fechaReserva, Vuelo vuelo, String asiento, Cliente cliente) {
        this.numeroConfirmacion = numeroConfirmacion;
        this.fechaReserva = fechaReserva;
        this.vuelo = vuelo;
        this.asiento = asiento;
        this.cliente = cliente;
        this.esActiva = true;
    }

    /**
     * Método para reservar un asiento para un cliente.
     * 
     * @param asiento asiento que se desea reservar
     * @param cliente cliente que realiza la reserva
     */
    @Override
    public void reservarAsiento(String asiento, Cliente cliente) {
        this.asiento = asiento;
        this.cliente = cliente;
        this.esActiva = true;
    }

    /**
     * Método para cancelar una reserva existente.
     */
    @Override
    public void cancelarReserva() {
        this.esActiva = false;
    }

    /**
     * Método que retorna el número de confirmación de la reserva.
     * 
     * @return número de confirmación de la reserva
     */
    public String getNumeroConfirmacion() {
        return numeroConfirmacion;
    }

    /**
     * Método que retorna la fecha y hora de la reserva.
     * 
     * @return fecha y hora de la reserva
     */
    public LocalDateTime getFechaReserva() {
        return fechaReserva;
    }

    /**
     * Método que retorna el vuelo asociado a la reserva.
     * 
     * @return vuelo asociado a la reserva
     */
    public Vuelo getVuelo() {
        return vuelo;
    }

    /**
     * Método que retorna el asiento reservado.
     * 
     * @return asiento reservado
     */
    public String getAsiento() {
        return asiento;
    }

    /**
     * Método que retorna el cliente que realizó la reserva.
     * 
     * @return cliente que realizó la reserva
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * Método que indica si la reserva está activa.
     * 
     * @return {@code true} si la reserva está activa, {@code false} si ha sido cancelada
     */
    public boolean isActiva() {
        return esActiva;
    }

    /**
     * Devuelve una representación en formato de cadena de la reserva, que incluye
     * el número de confirmación, el cliente, el vuelo, el asiento, la fecha y el estado.
     * 
     * @return una cadena con los detalles de la reserva
     */
    @Override
    public String toString() {
        return "Reserva confirmada: " + numeroConfirmacion + "\n" +
               "Cliente: " + cliente.getNombre() + "\n" +
               "Vuelo: " + vuelo.getNumeroVuelo() + " (Asiento: " + asiento + ")\n" +
               "Fecha de reserva: " + fechaReserva.format(FORMATO_FECHA_HORA) + "\n" +
               "Estado: " + (esActiva ? "Activa" : "Cancelada");
    }
}
