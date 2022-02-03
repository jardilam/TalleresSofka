import java.util.ArrayList;
/**
 * Representa la clase de una fruta para saber sus características como el nombre, color y peso
 */
public class Fruit {
   
    /**
     * Los atributos de la clase son:
     */

    /**
     * Representa el texto público para el nombre de la fruta
     */
    public String name; 
    /**
     * Representa el número decimal o float privado para el peso promedio
     * de la fruta
     */
    private float averageWeight;
    /**
     * Una lista pública con los colores de la o las frutas.
     */
    public ArrayList<String> colors;

    /**
     * Métodos:
     * Se mencionan los get y set según el diagrama UML:
     */

    public ArrayList<String> getColors() {
        return colors;
    }
    public void setColors(ArrayList<String> colors) {
        this.colors = colors;
    }
}
