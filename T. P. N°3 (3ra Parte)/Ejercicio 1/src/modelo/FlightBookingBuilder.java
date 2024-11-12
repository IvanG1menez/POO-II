package modelo;

/**
 * Clase que implementa el patrón de diseño Builder para crear un objeto de tipo FlightBooking.
 * Permite construir una reserva de vuelo con opciones como selección de asiento, cantidad de equipaje, 
 * tipo de comida y servicios premium.
 */
public class FlightBookingBuilder implements Builder {
    private FlightBooking reservaVuelo;

    /**
     * Constructor que inicializa una nueva reserva de vuelo.
     * Llama al método reiniciar para comenzar la construcción desde cero.
     */
    public FlightBookingBuilder() {
        this.reiniciar();
    }

    /**
     * Reinicia la construcción de la reserva de vuelo.
     * Crea una nueva instancia de FlightBooking.
     */
    @Override
    public void reiniciar() {
        this.reservaVuelo = new FlightBooking();
    }

    /**
     * Establece la selección de asiento en la reserva de vuelo.
     * 
     * @param seleccionAsiento La selección de asiento para la reserva.
     */
    @Override
    public void establecerSeleccionAsiento(String seleccionAsiento) {
        this.reservaVuelo.setSeleccionAsiento(seleccionAsiento);
    }

    /**
     * Establece la cantidad de equipaje en la reserva de vuelo.
     * 
     * @param cantidad La cantidad de equipaje permitida para la reserva.
     */
    @Override
    public void establecerCantidadEquipaje(int cantidad) {
        this.reservaVuelo.setCantidadEquipaje(cantidad);
    }

    /**
     * Establece el tipo de comida en la reserva de vuelo.
     * Dependiendo del tipo de comida (ESTANDAR o PREMIUM), se crea la comida correspondiente.
     * 
     * @param tipoComida El tipo de comida que se debe asignar a la reserva de vuelo.
     */
    @Override
    public void establecerTipoComida(TipoComida tipoComida) {
        Comida comida;
        if (tipoComida == TipoComida.ESTANDAR) {
            comida = new ComidaEstandar();
        } else {
            comida = new ComidaPremium();
        }
        this.reservaVuelo.setComida(comida);
    }

    /**
     * Establece los servicios premium en la reserva de vuelo.
     * 
     * @param servicios Los servicios premium que se deben asignar a la reserva de vuelo.
     */
    @Override
    public void establecerServiciosPremium(String servicios) {
        this.reservaVuelo.setServiciosPremium(servicios);
    }

    /**
     * Obtiene el resultado final de la construcción de la reserva de vuelo.
     * 
     * @return La reserva de vuelo construida.
     */
    public FlightBooking obtenerResultado() {
        return this.reservaVuelo;
    }
}
