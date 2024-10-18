package modelo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Clase que representa un vuelo. Contiene información sobre el número de vuelo,
 * la aerolínea, los horarios de salida y llegada, y los aeropuertos de origen y destino.
 */
public class Vuelo {
    /**
     * Número de vuelo.
     */
    private String numeroVuelo;

    /**
     * Aerolínea que opera el vuelo.
     */
    private TipoAerolinea aerolinea;

    /**
     * Fecha y hora de salida del vuelo.
     */
    private LocalDateTime fechaHoraSalida;

    /**
     * Fecha y hora de llegada del vuelo.
     */
    private LocalDateTime fechaHoraLlegada;

    /**
     * Aeropuerto de salida del vuelo.
     */
    private Aeropuerto aeropuertoSalida;

    /**
     * Aeropuerto de llegada del vuelo.
     */
    private Aeropuerto aeropuertoLlegada;

    /**
     * Avión asignado al vuelo.
     */
    private Avion avion;

    /**
     * Formato para mostrar las fechas y horas de los vuelos.
     */
    private static final DateTimeFormatter FORMATO_FECHA_HORA = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

    /**
     * Constructor de la clase Vuelo.
     * 
     * @param numeroVuelo     número de vuelo
     * @param aerolinea      aerolínea que opera el vuelo
     * @param fechaHoraSalida fecha y hora de salida del vuelo
     * @param fechaHoraLlegada fecha y hora de llegada del vuelo
     * @param aeropuertoSalida aeropuerto de salida
     * @param aeropuertoLlegada aeropuerto de llegada
     * @param avion           avión asignado al vuelo
     */
    public Vuelo(String numeroVuelo, TipoAerolinea aerolinea, LocalDateTime fechaHoraSalida, LocalDateTime fechaHoraLlegada,
                 Aeropuerto aeropuertoSalida, Aeropuerto aeropuertoLlegada, Avion avion) {
        this.numeroVuelo = numeroVuelo;
        this.aerolinea = aerolinea;
        this.fechaHoraSalida = fechaHoraSalida;
        this.fechaHoraLlegada = fechaHoraLlegada;
        this.aeropuertoSalida = aeropuertoSalida;
        this.aeropuertoLlegada = aeropuertoLlegada;
        this.avion = avion;
    }

    /**
     * Método que retorna el número de vuelo.
     * 
     * @return número de vuelo
     */
    public String getNumeroVuelo() {
        return numeroVuelo;
    }

    /**
     * Método que retorna la aerolínea que opera el vuelo.
     * 
     * @return aerolínea del vuelo
     */
    public TipoAerolinea getAerolinea() {
        return aerolinea;
    }

    /**
     * Método que retorna la fecha y hora de salida del vuelo.
     * 
     * @return fecha y hora de salida
     */
    public LocalDateTime getFechaHoraSalida() {
        return fechaHoraSalida;
    }

    /**
     * Método que retorna la fecha y hora de llegada del vuelo.
     * 
     * @return fecha y hora de llegada
     */
    public LocalDateTime getFechaHoraLlegada() {
        return fechaHoraLlegada;
    }

    /**
     * Método que retorna el aeropuerto de salida del vuelo.
     * 
     * @return aeropuerto de salida
     */
    public Aeropuerto getAeropuertoSalida() {
        return aeropuertoSalida;
    }

    /**
     * Método que retorna el aeropuerto de llegada del vuelo.
     * 
     * @return aeropuerto de llegada
     */
    public Aeropuerto getAeropuertoLlegada() {
        return aeropuertoLlegada;
    }

    /**
     * Método que retorna el avión asignado al vuelo.
     * 
     * @return avión del vuelo
     */
    public Avion getAvion() {
        return avion;
    }

    /**
     * Devuelve una representación en formato de cadena del vuelo, que incluye
     * el número de vuelo, la aerolínea, horarios, aeropuertos y detalles del avión.
     * 
     * @return una cadena con los detalles del vuelo
     */
    @Override
    public String toString() {
        return "Vuelo " + numeroVuelo + " (" + aerolinea + ")\n" +
               "Salida: " + fechaHoraSalida.format(FORMATO_FECHA_HORA) + " desde " + aeropuertoSalida + "\n" +
               "Llegada: " + fechaHoraLlegada.format(FORMATO_FECHA_HORA) + " en " + aeropuertoLlegada + "\n" +
               "Avión: " + avion.mostrarDetalles();
    }
}
