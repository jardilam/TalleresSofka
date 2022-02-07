public abstract class mannedSpacecraft extends shuttleVehicles {
    
    /**
     * Atributos:
     */

    /**
     * ¿Cuántas personas llevará la nave?
     */
    public int numHumans;


    /**
     * Constructor:
     */
    
    public mannedSpacecraft(int spacecraftEngines) {
        super(spacecraftEngines);
        this.mannedSpacecraft = true;
    } 

    /**
     * Comportamientos:
     */

    /**
     * Comportamiento de la nave. Enviar humanos al espacio para
     * investigar, reparar y realizar mantenimiento
     */
    public void humansOnSpace() {
        System.out.println("This type of spacecraft transports humans beings to perform some operations that require decisions and skills");
    }
    /**
     * Comportamiento abstracto de la clase principal
     * (shuttleVehicles) para hacer el lanzamiento de la nave al
     * espacio
     */
    public void shuttleToSpace() {
        this.speed = this.speed + 10;
    }
    /**
     * Sobreescritura de el comportamiento turnOff de
     * shuttleVehicles, reduciendo la velocidad a 0
     */
    @Override
    public void turnOff() {
        speed = 0;
    }
}
