package edu.unam.modelo;

/**
 * Clase Semaforo que administra el estado actual del semáforo.
 */
public class Semaforo {
    private EstadoSemaforo estado;

    /**
     * Constructor que establece el estado inicial en Rojo.
     */
    public Semaforo() {
        this.estado = new EstadoRojo();
    }

    /**
     * Cambia el estado actual del semáforo.
     */
    public void cambiar() {
        estado.cambiar(this);
    }

    /**
     * Muestra el comportamiento del estado actual.
     */
    public void mostrar() {
        estado.mostrar();
    }

    /**
     * Establece el nuevo estado del semáforo.
     * @param estado el nuevo estado del semáforo.
     */
    public void establecerEstado(EstadoSemaforo estado) {
        this.estado = estado;
    }
}
