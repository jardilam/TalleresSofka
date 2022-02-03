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
}
