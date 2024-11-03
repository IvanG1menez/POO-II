package edu.unam.modelo;

/**
 * Estado amarillo del semáforo. Los autos deben prepararse.
 */
public class EstadoAmarillo implements EstadoSemaforo {
    @Override
    public void cambiar(Semaforo semaforo) {
        semaforo.establecerEstado(new EstadoRojo());
    }

    @Override
    public void mostrar() {
        System.out.println("Amarillo: Los autos deben prepararse.");
    }
}
