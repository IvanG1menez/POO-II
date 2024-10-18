package modelo;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa un sistema de reservas de vuelos. Permite gestionar vuelos y reservas.
 */
public class SistemaReservasVuelos {
    /**
     * Lista de vuelos disponibles en el sistema.
     */
    private List<Vuelo> vuelos;

    /**
     * Lista de reservas registradas en el sistema.
     */
    private List<Reserva> reservas;

    /**
     * Constructor de la clase SistemaReservasVuelos. Inicializa las listas de vuelos y reservas.
     */
    public SistemaReservasVuelos() {
        this.vuelos = new ArrayList<>();
        this.reservas = new ArrayList<>();
    }

    /**
     * Método para agregar un vuelo a la lista de vuelos disponibles.
     * 
     * @param vuelo el vuelo que se desea agregar
     */
    public void agregarVuelo(Vuelo vuelo) {
        vuelos.add(vuelo);
    }

    /**
     * Método para registrar una reserva en la lista de reservas.
     * 
     * @param reserva la reserva que se desea registrar
     */
    public void registrarReserva(Reserva reserva) {
        reservas.add(reserva);
    }

    /**
     * Método para buscar vuelos entre dos aeropuertos específicos.
     * 
     * @param aeropuertoSalida  el aeropuerto de salida
     * @param aeropuertoLlegada el aeropuerto de llegada
     * @return una lista de vuelos que coinciden con los aeropuertos de salida y llegada
     */
    public List<Vuelo> buscarVuelos(Aeropuerto aeropuertoSalida, Aeropuerto aeropuertoLlegada) {
        List<Vuelo> vuelosEncontrados = new ArrayList<>();
        for (Vuelo vuelo : vuelos) {
            if (vuelo.getAeropuertoSalida().equals(aeropuertoSalida) && vuelo.getAeropuertoLlegada().equals(aeropuertoLlegada)) {
                vuelosEncontrados.add(vuelo);
            }
        }
        return vuelosEncontrados;
    }

    /**
     * Método que retorna la lista de vuelos disponibles.
     * 
     * @return lista de vuelos disponibles
     */
    public List<Vuelo> getVuelos() {
        return vuelos;
    }

    /**
     * Método que retorna la lista de reservas registradas.
     * 
     * @return lista de reservas registradas
     */
    public List<Reserva> getReservas() {
        return reservas;
    }
}
