package edu.unam.modelo;

/**
 * Estado rojo del semáforo. Los autos deben detenerse.
 */
public class EstadoRojo implements EstadoSemaforo {
    @Override
    public void cambiar(Semaforo semaforo) {
        semaforo.establecerEstado(new EstadoVerde());
    }

    @Override
    public void mostrar() {
        System.out.println("Rojo: Los autos deben detenerse.");
    }
}