package modelo;

/**
 * Clase que representa una reserva de vuelo.
 * Contiene información sobre la selección de asiento, la cantidad de equipaje, la comida y los servicios premium asociados a la reserva.
 */
public class FlightBooking {
    private String seleccionAsiento;
    private int cantidadEquipaje;
    private Comida comida;
    private String serviciosPremium;

    /**
     * Devuelve una representación en cadena de la reserva de vuelo.
     * 
     * @return Una cadena con los detalles de la reserva de vuelo, incluyendo asiento, equipaje, servicios premium y comida.
     */
    @Override
    public String toString() {
        return  "[seleccionAsiento='" + seleccionAsiento + '\'' +
                "\n cantidadEquipaje=" + cantidadEquipaje + '\'' +
                "\n serviciosPremium='" + serviciosPremium + '\'' +
                "\n comida='" + comida.toString() + '\'' + ']';
    }

    // Getters y setters

    /**
     * Obtiene la selección de asiento de la reserva de vuelo.
     * 
     * @return La selección de asiento.
     */
    public String getSeleccionAsiento() {
        return seleccionAsiento;
    }

    /**
     * Establece la selección de asiento en la reserva de vuelo.
     * 
     * @param seleccionAsiento La selección de asiento.
     */
    public void setSeleccionAsiento(String seleccionAsiento) {
        this.seleccionAsiento = seleccionAsiento;
    }

    /**
     * Obtiene la cantidad de equipaje permitido en la reserva de vuelo.
     * 
     * @return La cantidad de equipaje.
     */
    public int getCantidadEquipaje() {
        return cantidadEquipaje;
    }

    /**
     * Establece la cantidad de equipaje permitido en la reserva de vuelo.
     * 
     * @param cantidadEquipaje La cantidad de equipaje.
     */
    public void setCantidadEquipaje(int cantidadEquipaje) {
        this.cantidadEquipaje = cantidadEquipaje;
    }

    /**
     * Obtiene el tipo de comida asociado a la reserva de vuelo.
     * 
     * @return El objeto comida asociado a la reserva.
     */
    public Comida getComida() {
        return comida;
    }

    /**
     * Establece el tipo de comida en la reserva de vuelo.
     * 
     * @param comida El tipo de comida a asignar.
     */
    public void setComida(Comida comida) {
        this.comida = comida;
    }

    /**
     * Obtiene los servicios premium asociados a la reserva de vuelo.
     * 
     * @return Los servicios premium.
     */
    public String getServiciosPremium() {
        return serviciosPremium;
    }

    /**
     * Establece los servicios premium asociados a la reserva de vuelo.
     * 
     * @param serviciosPremium Los servicios premium a asignar.
     */
    public void setServiciosPremium(String serviciosPremium) {
        this.serviciosPremium = serviciosPremium;
    }
}
