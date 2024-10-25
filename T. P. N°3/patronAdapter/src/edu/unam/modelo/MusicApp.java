package edu.unam.modelo;

public class MusicApp {
    private MusicPlayer nativePlayer;       // Reproductor nativo de la aplicación
    private MusicPlayer adaptedPlayer;      // Reproductor adaptado (ThirdPartyAudioPlayer)

    // Constructor que recibe el reproductor nativo y el adaptador como parámetros
    public MusicApp(MusicPlayer nativePlayer, MusicPlayer adaptedPlayer) {
        this.nativePlayer = nativePlayer;
        this.adaptedPlayer = adaptedPlayer;
    }

    // Método para reproducir una canción usando el reproductor nativo
    public void playNativeSong(String fileName) {
        nativePlayer.playSong(fileName);
    }

    // Método para reproducir una canción usando el reproductor adaptado
    public void playAdaptedSong(String fileName) {
        adaptedPlayer.playSong(fileName);
    }
}