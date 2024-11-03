## Justificación de la Solución con el Patrón Strategy

Se utilizó el patrón Strategy para manejar los métodos de envío de una tienda en línea, permitiendo que el `Pedido` (contexto) elija entre diferentes estrategias de envío (`EnvioRegular`, `EnvioExpreso`, `EnvioInternacional`). Cada estrategia implementa la interfaz `MetodoEnvio`, que define el método `calcularCosto` y `descripcion`, encapsulando el comportamiento único de cada tipo de envío.

Este diseño permite al `Pedido` cambiar de estrategia de envío de forma flexible sin modificar su código, cumpliendo con el principio de abierto/cerrado y facilitando la escalabilidad para incorporar nuevos métodos de envío sin alterar el funcionamiento central del sistema.