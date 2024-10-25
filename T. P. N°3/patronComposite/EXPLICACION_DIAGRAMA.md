# Explicación del Diagrama de Clases

El diagrama utiliza el patrón Composite para representar archivos y directorios de forma uniforme.

1. **FileSystemComponent**: clase base abstracta con el método `showDetails()` que permite que archivos y directorios se manejen de la misma forma.
2. **File y Directory**: `File` representa elementos individuales, mientras que `Directory` actúa como contenedor, permitiendo que un directorio contenga otros archivos y subdirectorios.
3. **Relación de Composición**: `Directory` contiene una lista de `FileSystemComponent`, habilitando la jerarquía anidada y la visualización recursiva de su contenido.

Esta estructura permite gestionar la jerarquía de archivos y directorios como un árbol, facilitando la organización y visualización.
