package classes;

public class RegisterSong{

    String name;
    String album;
    String mediaType;
    String genre;
    String composer;

    float duration;
    float unitPrice;


    public RegisterSong(String name, String album, String mediaType, String genre, String composer, float duration, float unitPrice){
        this.name = name;
        this.album = album;
        this.mediaType = mediaType;
        this.genre = genre;
        this.composer = composer;
        this.duration = duration;
        this.unitPrice = unitPrice;
    }
}