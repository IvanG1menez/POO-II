package modelo;

import java.util.Arrays;

/**
 * Representa un tipo de comida en una reserva de vuelo.
 * Define un conjunto de platos según el tipo de comida (ESTANDAR o PREMIUM).
 */
public class Comida {
    private TipoComida tipoComida;
    private String[] platos;

    /**
     * Obtiene el tipo de comida asociado a esta instancia.
     * 
     * @return El tipo de comida (ESTANDAR o PREMIUM).
     */
    public TipoComida getTipoComida() {
        return tipoComida;
    }

    /**
     * Establece el tipo de comida y actualiza los platos disponibles en función de dicho tipo.
     * 
     * @param tipoComida El tipo de comida a asignar (ESTANDAR o PREMIUM).
     */
    public void setTipoComida(TipoComida tipoComida) {
        this.tipoComida = tipoComida;
        setPlatos();
    }

    /**
     * Obtiene la lista de platos disponibles según el tipo de comida.
     * 
     * @return Un arreglo de cadenas con los platos correspondientes.
     */
    public String[] getPlatos() {
        return platos;
    }

    /**
     * Establece los platos según el tipo de comida asignado.
     * Si el tipo de comida es ESTANDAR, se asignan platos estándar; 
     * si es PREMIUM, se asignan platos premium.
     */
    public void setPlatos() {
        if (tipoComida == TipoComida.ESTANDAR) {
            platos = new String[]{"Pollo a la parrilla", "Pasta con salsa de tomate",
            "Ensalada mixta", "Fruta fresca", "Agua mineral"};
        } else if (tipoComida == TipoComida.PREMIUM) {
            platos = new String[]{"Caviar", "Langosta", "Filete Mignon","Trufas", 
            "Champán"};
        }
    }

    /**
     * Devuelve una representación en cadena de la comida, incluyendo los platos.
     * 
     * @return Una cadena con el nombre de la clase y los platos disponibles.
     */
    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "platos=" + Arrays.toString(platos) +
                '}';
    }
}
