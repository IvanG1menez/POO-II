package modelo;

/**
 * Clase que actúa como el director del patrón de diseño Builder.
 * Se encarga de dirigir el proceso de construcción de las reservas de vuelo,
 * utilizando un builder para crear reservas de vuelo estándar o premium.
 */
public class Director {

    /**
     * Construye una reserva de vuelo estándar utilizando el builder proporcionado.
     * 
     * @param builder El builder que se utilizará para construir la reserva de vuelo.
     * @param cantAsientos La cantidad de asientos para la reserva.
     */
    public void construirReservaEstandar(Builder builder, int cantAsientos) {
        builder.reiniciar();
        builder.establecerSeleccionAsiento("Estandar");
        builder.establecerCantidadEquipaje(cantAsientos);
        builder.establecerTipoComida(TipoComida.ESTANDAR);
        builder.establecerServiciosPremium("Ninguno");
    }

    /**
     * Construye una reserva de vuelo premium utilizando el builder proporcionado.
     * 
     * @param builder El builder que se utilizará para construir la reserva de vuelo.
     * @param cantAsientos La cantidad de asientos para la reserva.
     */
    public void construirReservaPremium(Builder builder, int cantAsientos) {
        builder.reiniciar();
        builder.establecerSeleccionAsiento("Premium");
        builder.establecerCantidadEquipaje(cantAsientos);
        builder.establecerTipoComida(TipoComida.PREMIUM);
        builder.establecerServiciosPremium("Todos");
    }
}
