/**
 * Clase haciendo referencia a un perfil dentro de una red social
 */
public class SocialProfile {

    /**
     * Atributos:
     */

    /**
     * Texto público para el nombre en la red social
     */
    public String name;
    /**
     * Texto público con el primer apellido del perfil
     */ 
    public String lastName1;
    /**
     * Texto público con el segundo apellido del perfil
     */
    public String lastName2;
    /**
     * Número entero privado con los likes que éste perfil ha dado o hecho
     */
    private int likes;
    /**
     * Número entero privado para el número de celular de éste perfil
     */
    private int phoneNumber;
    /**
     * Booleano protegido para el estado de vista del perfil. (Si es un
     * perfil público o privado)
     */
    protected boolean stateProfileView; 

    /**
     * Métodos:
     * Setters and Getters del estado de vista del perfil:
     */

    public boolean isStateProfileView() {
        return stateProfileView;
    }
    public void setStateProfileView(boolean stateProfileView) {
        this.stateProfileView = stateProfileView;
    }
    /**
     * Se realiza un method para enviar mensaje a otro perfil
     */
    public void message() {
        System.out.println("You sent a message");
    }
}
