package modelo;

/**
 * Clase que representa un avión comercial. Hereda de la clase {@link Avion}.
 */
public class AvionComercial extends Avion {

    /**
     * Constructor de la clase AvionComercial.
     * 
     * @param modelo    modelo del avión comercial
     * @param capacidad capacidad de pasajeros del avión
     * @param aerolinea aerolínea a la que pertenece el avión
     */
    public AvionComercial(String modelo, int capacidad, TipoAerolinea aerolinea) {
        super(modelo, capacidad, aerolinea);
    }

    /**
     * Método que muestra los detalles del avión comercial.
     * 
     * @return una cadena con el formato "Avión Comercial: modelo (aerolínea) - Capacidad: capacidad"
     */
    @Override
    public String mostrarDetalles() {
        return "Avión Comercial: " + modelo + " (" + aerolinea + ") - Capacidad: " + capacidad;
    }

}
