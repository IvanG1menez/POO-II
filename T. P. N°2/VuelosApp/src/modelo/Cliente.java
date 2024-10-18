package modelo;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa un cliente.
 */
public class Cliente {
    /**
     * Nombre del cliente.
     */
    private String nombre;

    /**
     * Email del cliente.
     */
    private String email;

    /**
     * Lista de reservas asociadas al cliente.
     */
    private List<Reserva> reservas;

    /**
     * Constructor de la clase Cliente.
     * 
     * @param nombre nombre del cliente
     * @param email  email del cliente
     */
    public Cliente(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
        this.reservas = new ArrayList<>();
    }

    /**
     * Método que retorna el nombre del cliente.
     * 
     * @return nombre del cliente
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método que retorna el email del cliente.
     * 
     * @return email del cliente
     */
    public String getEmail() {
        return email;
    }

    /**
     * Método que retorna la lista de reservas del cliente.
     * 
     * @return lista de reservas del cliente
     */
    public List<Reserva> getReservas() {
        return reservas;
    }

    /**
     * Método para agregar una reserva a la lista de reservas del cliente.
     * 
     * @param reserva la reserva que se va a agregar
     */
    public void agregarReserva(Reserva reserva) {
        reservas.add(reserva);
    }

    /**
     * Devuelve una representación en formato de cadena del cliente, que incluye
     * su nombre y email.
     * 
     * @return una cadena con el formato "nombre (email)"
     */
    @Override
    public String toString() {
        return nombre + " (" + email + ")";
    }
}
