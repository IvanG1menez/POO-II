import edu.unam.modelo.Semaforo;

public class App {
    public static void main(String[] args) throws Exception {
        // Crear una instancia del semáforo
        Semaforo semaforo = new Semaforo();

        // Ciclo para mostrar el cambio de estados del semáforo
        System.out.println("Ciclo de estados del semáforo:");
        for (int i = 0; i < 6; i++) {  // Cambiamos el estado varias veces para ver el ciclo completo
            semaforo.mostrar();
            semaforo.cambiar();
        }
    }
}
