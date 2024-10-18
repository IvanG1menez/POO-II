package modelo;

/**
 * Clase abstracta que representa un avión.
 */
public abstract class Avion {
    /**
     * Modelo del avión.
     */
    protected String modelo;

    /**
     * Capacidad de pasajeros del avión.
     */
    protected int capacidad;

    /**
     * Aerolínea a la que pertenece el avión.
     */
    protected TipoAerolinea aerolinea;

    /**
     * Constructor de la clase Avion.
     * 
     * @param modelo    modelo del avión
     * @param capacidad capacidad de pasajeros del avión
     * @param aerolinea aerolínea a la que pertenece el avión
     */
    public Avion(String modelo, int capacidad, TipoAerolinea aerolinea) {
        this.modelo = modelo;
        this.capacidad = capacidad;
        this.aerolinea = aerolinea;
    }

    /**
     * Método que retorna el modelo del avión.
     * 
     * @return modelo del avión
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Método que retorna la capacidad de pasajeros del avión.
     * 
     * @return capacidad del avión
     */
    public int getCapacidad() {
        return capacidad;
    }

    /**
     * Método que retorna la aerolínea a la que pertenece el avión.
     * 
     * @return aerolínea del avión
     */
    public TipoAerolinea getAerolinea() {
        return aerolinea;
    }

    /**
     * Método abstracto que debe ser implementado por las subclases para mostrar
     * los detalles del avión.
     * 
     * @return una cadena con los detalles del avión
     */
    public abstract String mostrarDetalles();
}
