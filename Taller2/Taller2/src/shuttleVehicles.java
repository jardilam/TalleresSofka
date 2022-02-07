public abstract class shuttleVehicles {
    /**
     * Atributos:
     */

    /**
     * Se crean atributos generales y que serán comunes entre las
     * naves tripuladas y no tripuladas
     */
    /**
     * Nombre de la nave a crear
     */
    public String nameOfSpacecraft;
    /**
     * Velocidad del vehículo lanzadera
     */
    public int speed;
    /**
     * Booleano para saber si la nave es tripulada o no es tripulada
     */
    public boolean mannedSpacecraft;
    /**
     * ¿Cuántos motores tendrá la nave?
     */
    public int spacecraftEngines;


    public shuttleVehicles(int spacecraftEngines) {
        this.nameOfSpacecraft = "Explorer";
        this.speed = 0;
        this.mannedSpacecraft = false;
        this.spacecraftEngines = 0;
    }

    public abstract void shuttleToSpace();

    public void turnOff() {
        this.speed = 0;
    }

    /**
     * Se realiza un if-else con el fin de seleccionar si la nave será tripulada o no será tripulada
     */
    public void creatingSpacecraft () {
        if (mannedSpacecraft == true) {
            System.out.println("You have created a manned spacecraft");
        } else {
            System.out.println("You have created an unmanned spacecraft");
        }
    }       
}
