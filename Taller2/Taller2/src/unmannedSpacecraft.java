public abstract class unmannedSpacecraft extends shuttleVehicles {

    /**
     * Atributos:
     */

    /**
     * ¿Cuántas celdas fotovoltáicas tendrá?
     */
    public int photovoltaicCells;
    

    /**
     * Constructor:
     */

    public unmannedSpacecraft(int spacecraftEngines) {
        super(spacecraftEngines);
        this.mannedSpacecraft = false;
    } 

    /**
     * Comportamientos:
     */

    /**
     * Comportamiento para estudiar objetos celestes, generalmente
     * son naves robóticas compuestas de motores y celdas
     * fotovoltaicas para seguir funcionando
     */
    public void studyCelestialObjects() {
        System.out.println("This spacecraft studies celestial objects on space");
    }
    /**
     * Comportamiento abstracto de la clase principal
     * (shuttleVehicles) para hacer el lanzamiento de la nave al
     * espacio
     */
    public void shuttleToSpace() {
        this.speed = this.speed + 20;
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
