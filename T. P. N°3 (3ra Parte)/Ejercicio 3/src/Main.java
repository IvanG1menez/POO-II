import modelo.Logger;

/**
 * DemoLogging simula el uso del sistema de logging mediante múltiples hilos,
 * demostrando que solo una instancia de Logger registra todos los mensajes.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Probando el sistema de registro con múltiples procesos.");

        /**
         * Crea e inicia tres hilos que simulan diferentes procesos de logging.
         */
        Thread threadProcess1 = new Thread(new LoggingProcess("Proceso 1"));
        Thread threadProcess2 = new Thread(new LoggingProcess("Proceso 2"));
        Thread threadProcess3 = new Thread(new LoggingProcess("Proceso 3"));

        /**
         * Inicia los hilos para cada proceso de logging.
         */
        threadProcess1.start();
        threadProcess2.start();
        threadProcess3.start();
    }

    /**
     * Clase interna que representa un proceso de logging en un hilo separado.
     * Cada hilo realiza un proceso de logging con mensajes informativos, de advertencia y de error.
     */
    static class LoggingProcess implements Runnable {
        private String processName; /**  Nombre del proceso para identificar los mensajes de log*/

        /**
         * Constructor que inicializa el nombre del proceso.
         *
         * @param processName Nombre del proceso.
         */
        public LoggingProcess(String processName) {
            this.processName = processName; // Asigna el nombre del proceso
        }

        /**
         * Método que ejecuta el proceso de logging, registrando varios tipos de mensajes.
         * El proceso registra un mensaje informativo, una advertencia y un error.
         */
        @Override
        public void run() {
            Logger logger = Logger.getInstance(); // Obtiene la instancia única de Logger

            /**
             * Registra un mensaje informativo indicando el inicio del proceso.
             */
            logger.informacion(processName + " - Inicio del proceso");

            /**
             * Registra una advertencia sobre un posible problema en el proceso.
             */
            logger.advertencia(processName + " - Advertencia: posible problema detectado");

            /**
             * Registra un mensaje de error relacionado con el proceso.
             */
            logger.error(processName + " - Error encontrado");
        }
    }
}
