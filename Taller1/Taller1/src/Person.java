import java.util.Date;

/**
 * En esta parte se crean las variables dependiendo de que sean públicas
 * privadas o protegidas.
 * Después se tiene en cuenta si son String, Date o float.
 * Por último se coloca el nombre de la variable de acuerdo al taller
 */
public class Person {

    /**
     * Atributos:
     */
    
    /**
     * Texto público con el nombre de la persona
     */
    public String name; 
    /**
     * Texto público con el primer apellido de la persona
     */
    public String lastName1; 
    /**
     * Texto público con el segundo apellido de la persona
     */
    public String lastName2; 
    /**
     * Fecha pública con la fecha de nacimiento de la persona
     */
    public Date dateBirth; 
    /**
     * Número decimal para el peso de la persona
     */
    public float height;
    
    /**
     * Se llaman el set y el get según el diagrama UML:
     */

    public String getName() {
        /**
         * This hace mencion a la variable de la línea 7
         */
        return name;
    }
    /**
     * Se llama el set para asignarle nombre a (en este caso), la persona
     */
    public void setName(String name) {
        /**
         * This lo que hace es mencionar la variable del principio
         * encapsularla dentro del set
         */
        this.name = name;
    }

}
