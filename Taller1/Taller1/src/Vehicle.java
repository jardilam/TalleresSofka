import java.util.ArrayList;
/**
 * La clase vehículo es generalizada, por lo que se puede tomar como vehículo aquél objeto impulsado por un motor
 */
public class Vehicle {

    /**
     * Los atributos de la clase son:
     */

    /**
     * Texto público para saber el nómbre del vehículo
     */
    public String name;
    /**
     * Número decimal para saber el peso del vehículo
     */
    private float weight;
    /**
     * Número entero público para saber cuántas llantas que éste tiene
     */
    public int numberWheels;
    /**
     * Booleano para saber si el vehículo está encendido o apagado
     */
    protected boolean stateVehicle;
    /**
     * Lista para saber el color del vehículo
     */
    public ArrayList<String> color;
}
