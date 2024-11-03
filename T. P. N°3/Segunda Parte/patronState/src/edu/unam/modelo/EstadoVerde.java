package edu.unam.modelo;

/**
 * Estado verde del semáforo. Los autos pueden avanzar.
 */
public class EstadoVerde implements EstadoSemaforo {
    @Override
    public void cambiar(Semaforo semaforo) {
        semaforo.establecerEstado(new EstadoAmarillo());
    }

    @Override
    public void mostrar() {
        System.out.println("Verde: Los autos pueden avanzar.");
    }
}
