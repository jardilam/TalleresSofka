    /**
     * Clase de una cuenta bancaria con sus características principales como el número de cuenta y si se encuentra activada
     */
public class BankAccount {

    /**
     * Atributos:
     */

    /**
     * Número entero privado para el número de cuenta
     */
    private int accountNumber;
    /**
     * Booleano protegido para saber si la cuenta se encuentra activa o no
     */
    protected boolean activated;

    /**
     * Se mencionan el get y set según el diagrama UML:
     */
    
    public boolean isActivated() {
        return activated;
    }
    public void setActivated(boolean activated) {
        this.activated = activated;
    }
}
