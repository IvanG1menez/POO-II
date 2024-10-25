# Explicación del Diagrama de Clases

1. **Interfaz MusicPlayer**: Define el método `playSong(fileName: String)` para reproducir canciones, asegurando uniformidad en las implementaciones.

2. **Clase ThirdPartyAudioPlayer**: Representa un reproductor de audio externo con un método `startAudio(file: String)`, que no se puede modificar.

3. **Clase AudioPlayerAdapter**:
   - Implementa la interfaz MusicPlayer.
   - Contiene una instancia de ThirdPartyAudioPlayer (relación de composición).
   - Adapta el método `playSong` para que llame a `startAudio`, permitiendo la compatibilidad con el reproductor externo.

4. **Clase MusicApp**:
   - Tiene dos atributos de tipo MusicPlayer: `nativePlayer` y `adaptedPlayer`.
   - Proporciona métodos `playNativeSong` y `playAdaptedSong` para elegir qué reproductor utilizar.

El patrón Adapter permite integrar ThirdPartyAudioPlayer sin modificar su código, adaptándolo a la interfaz MusicPlayer. Esto encapsula los detalles de integración y facilita el uso de múltiples reproductores en MusicApp, garantizando una arquitectura escalable y limpia para futuras extensiones.
