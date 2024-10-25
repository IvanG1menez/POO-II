package edu.unam.modelo;

public class AudioPlayerAdapter implements MusicPlayer{

    private ThirdPartyAudioPlayer thirdPartyAudioPlayer;

    public AudioPlayerAdapter(ThirdPartyAudioPlayer thirdPartyAudioPlayer) {
        this.thirdPartyAudioPlayer = thirdPartyAudioPlayer;
    }

    @Override
    public void playSong(String fileName) {
        thirdPartyAudioPlayer.startAudio(fileName);  // Llama al método del reproductor externo
    }

}
