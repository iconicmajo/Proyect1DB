package classes;

public class RegisterSong{

    private String name;
    private String album;
    private String mediaType;
    private String genre;
    private String composer;

    private float duration;
    private float unitPrice;


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