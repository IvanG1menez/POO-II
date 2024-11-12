package modelo;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/** 
 * Logger es una clase Singleton que permite registrar eventos en un archivo de log.
 * Asegura que solo haya una instancia de Logger en toda la aplicación.
 */
public final class Logger {

    /** 
     * Instancia única de Logger, marcada como volatile para visibilidad en entornos multihilo.
     */
    private static volatile Logger instancia;

    /** 
     * Nombre del archivo de log.
     */
    private static final String LOG_ARCHIVO = "aplicacion.log";

    /** 
     * Constructor privado para impedir la creación de instancias desde fuera de la clase.
     */
    private Logger() {}

    /**
     * Devuelve la única instancia de Logger, creándola si aún no existe.
     * Utiliza la técnica de doble verificación para asegurar que solo se crea una instancia en entornos multihilo.
     *
     * @return La instancia única de Logger
     */
    public static Logger getInstance() {
        if (instancia == null) { /** Primer chequeo sin bloqueo */
            synchronized (Logger.class) { /** Bloque sincronizado para garantizar que solo un hilo pueda ejecutar */
                if (instancia == null) { /** Segundo chequeo dentro del bloqueo */
                    instancia = new Logger(); /** Inicialización de la instancia única */
                }
            }
        }
        return instancia; /** Retorna la instancia existente o recién creada */
    }

    /**
     * Registra un mensaje informativo en el archivo de log.
     *
     * @param message El mensaje a registrar
     */
    public void informacion(String message) {
        log("INFORMACION", message); /** Llama al método log con el nivel de información INFO */
    }

    /**
     * Registra un mensaje de advertencia en el archivo de log.
     *
     * @param message El mensaje a registrar
     */
    public void advertencia(String message) {
        log("ADVERTENCIA", message); /** Llama al método log con el nivel de advertencia WARNING */
    }

    /**
     * Registra un mensaje de error en el archivo de log.
     *
     * @param message El mensaje a registrar
     */
    public void error(String message) {
        log("ERROR", message); /** Llama al método log con el nivel de error ERROR */
    }

    /**
     * Escribe un mensaje en el archivo de log con el nivel especificado.
     * Sincronizado para evitar problemas de concurrencia en escritura.
     *
     * @param level   El nivel del mensaje (INFO, WARNING, ERROR)
     * @param message El mensaje a registrar
     */
    private synchronized void log(String level, String message) {
        try (FileWriter fileWriter = new FileWriter(LOG_ARCHIVO, true); /** Crea un FileWriter en modo de añadir */
             PrintWriter printWriter = new PrintWriter(fileWriter)) { /** Crea un PrintWriter para escribir en el archivo */
            /** Escribe la entrada de log en el archivo con la fecha, nivel y mensaje */
            printWriter.printf("[%s] %s: %s%n", java.time.LocalDateTime.now(), level, message);
        } catch (IOException e) { /** Captura posibles excepciones de IO */
            e.printStackTrace(); /** Imprime el error si ocurre un problema al escribir en el archivo */
        }
    }
}
