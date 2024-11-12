package modelo;

/**
 * Representa el tipo de comida estándar en una reserva de vuelo.
 * Extiende la clase {@link Comida} y establece el tipo de comida como ESTANDAR.
 */
public class ComidaEstandar extends Comida {

    /**
     * Constructor que establece el tipo de comida como ESTANDAR.
     * Llama al constructor de la clase base {@link Comida} para asignar el tipo de comida.
     */
    public ComidaEstandar() {
        /**
         * Establecer el tipo de comida
         */ 
        setTipoComida(TipoComida.ESTANDAR);
    }
}
