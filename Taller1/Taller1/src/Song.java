import java.util.ArrayList;
import java.util.Date;
/**
 * Clase para saber los datos de una cancion
 */
public class Song {

    /**
     * Atributos:
     */

    /**
     * Texto público con el nombre de la canción
     */
    public String nameSong;
    /**
     * Texto público con el nombre del album
     */
    public String nameAlbum;
    /**
     * Texto público con el nombre del artista
     */
    public String nameArtist;
    /**
     * Una lista protegida con el género de la canción
     */
    protected ArrayList<String> songGenre;
    /**
     * Fecha protegida del año de lanzamiento del album
     */
    protected Date yearReleaseAlbum;
    /**
     * Número entero público de el número de canciones lanzadas en el album
     */
    public int numberOfSongsReleased;

    /**
     * Métodos:
     */

     /**
      * Setters and getters para asignar el nombre de la canción
      */

    public String getNameSong() {
        return nameSong;
    }
    public void setNameSong(String nameSong) {
        this.nameSong = nameSong;
    }
    /**
     * Se realiza un method para reproducir, pausar y parar canción
     */
    public void play() {
        System.out.println("Playing song");
    }
    public void pause() {
        System.out.println("Pausing song");
    }
    public void stop() {
        System.out.println("Stopping song");
    }
}
