package modelo;

/**
 * Representa el tipo de comida premium en una reserva de vuelo.
 * Extiende la clase {@link Comida} y establece el tipo de comida como PREMIUM.
 */
public class ComidaPremium extends Comida {

    /**
     * Constructor que establece el tipo de comida como PREMIUM.
     * Llama al constructor de la clase base {@link Comida} para asignar el tipo de comida.
     */
    public ComidaPremium() {
        /**
         * Establecer el tipo de comida
         */
        setTipoComida(TipoComida.PREMIUM);
    }
}
