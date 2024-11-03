## Justificación de la Solución con el Patrón State

El patrón State se utiliza para modelar los estados de un semáforo (`Semaforo`) en tres posibles: Rojo (`EstadoRojo`), Amarillo (`EstadoAmarillo`) y Verde (`EstadoVerde`). Cada estado implementa la interfaz `EstadoSemaforo`, que define los métodos `cambiar(Semaforo semaforo)` para realizar la transición al siguiente estado y `mostrar()` para indicar el comportamiento en el estado actual.

Este diseño permite que el semáforo (`Semaforo`) altere su comportamiento sin utilizar condicionales, ya que cada estado administra sus propias transiciones y muestra su comportamiento específico. Este enfoque respeta el principio de diseño de objetos abiertos a la extensión y facilita la inclusión de futuros estados adicionales sin modificar la estructura del sistema existente.

## Explicación del ejemplo en la aplicación principal

1. Se crea una instancia de la clase Semaforo, que inicia con el estado rojo por defecto.
2. Utilizamos un ciclo para realizar varias transiciones de estado, mostrando en la consola el estado actual y realizando el cambio al siguiente estado.

Al ejecutar este programa, verás una salida en la consola que muestra cómo el semáforo alterna entre los estados Rojo, Verde y Amarillo, cumpliendo con el ciclo de comportamiento deseado.
