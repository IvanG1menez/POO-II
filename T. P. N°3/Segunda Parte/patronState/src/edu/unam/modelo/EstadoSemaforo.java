package edu.unam.modelo;

/**
 * Interfaz que representa el estado de un semáforo.
 */
public interface EstadoSemaforo {
    /**
     * Cambia al siguiente estado del semáforo.
     * @param semaforo el semáforo que realiza el cambio de estado.
     */
    void cambiar(Semaforo semaforo);

    /**
     * Muestra el comportamiento del estado actual.
     */
    void mostrar();
}
