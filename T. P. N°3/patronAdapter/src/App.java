import edu.unam.modelo.*;

public class App{
    public static void main(String[] args) {
        
        ThirdPartyAudioPlayer thirdPartyAudioPlayer = new ThirdPartyAudioPlayer();
        MusicPlayer adaptedPlayer = new AudioPlayerAdapter(thirdPartyAudioPlayer);

        MusicPlayer nativePlayer = new MusicPlayer() {
            @Override
            public void playSong(String fileName) {
                System.out.println("Reproduciendo canción: " + fileName + " con el reproductor nativo.");
            }
        };

        // Creación de MusicApp con ambos reproductores
        MusicApp musicApp = new MusicApp(nativePlayer, adaptedPlayer);
        musicApp.playNativeSong("cancion_nativa.mp3");      // Reproducción con reproductor nativo
        musicApp.playAdaptedSong("pista_externa.mp3");      // Reproducción con reproductor adaptado

    }
}