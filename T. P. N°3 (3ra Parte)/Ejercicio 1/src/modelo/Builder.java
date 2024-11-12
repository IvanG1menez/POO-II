package modelo;

/**
 * Interfaz que define los métodos para construir una reserva de vuelo.
 * Esta interfaz es parte del patrón de diseño Builder, que permite construir un objeto complejo paso a paso.
 */
public interface Builder {

    /**
     * Reinicia el proceso de construcción de la reserva.
     * Debe ser llamado antes de iniciar la creación de una nueva reserva.
     */
    void reiniciar();

    /**
     * Establece la selección de asiento para la reserva de vuelo.
     * 
     * @param seleccionAsiento La selección de asiento realizada por el cliente (por ejemplo, ventana, pasillo).
     */
    void establecerSeleccionAsiento(String seleccionAsiento);

    /**
     * Establece la cantidad de equipaje permitida para la reserva de vuelo.
     * 
     * @param cantidad La cantidad de equipaje permitida (por ejemplo, en kilogramos o piezas).
     */
    void establecerCantidadEquipaje(int cantidad);

    /**
     * Establece el tipo de comida que se ofrecerá durante el vuelo.
     * 
     * @param comida El tipo de comida que se ofrecerá (por ejemplo, vegetariana, no vegetariana, especial).
     */
    void establecerTipoComida(TipoComida comida);

    /**
     * Establece los servicios premium disponibles para el cliente durante el vuelo.
     * 
     * @param servicios Los servicios premium que se ofrecerán (por ejemplo, acceso a salas VIP, asiento de lujo).
     */
    void establecerServiciosPremium(String servicios);
}
