
/**
 * Clase Bicicleta con sus metodos y atribulos
 *
 * @author Laura Daniela Gonzalez Alvarez   <lhaogonzaleza@gmail.com>
 * @version 1.0.0 2022-06-05
 * @since 1.0.0
 */
public class Bicycle extends Vehicle {
    /**
     * Ruedas peque?as de entrenamiento para los ni?os
     */
    private boolean smallWheels;

    
    public void setsmallWheels(boolean smallWheels) {
        this.smallWheels = smallWheels;
    }

    
    public boolean getsmallWheels() {
        return this.smallWheels;
    }

    
    /**
     * M?todo iniciar marcha
     */
    public String startUp() {
        return "";
    }

    /**
     *M?todo detener marcha
     */
    public String stop() {
        return "";
    }

    @Override
    public String toString() {
        return "Tipo de veh?culo: Bicicleta \n" +
                super.toString() + " \n Ruedas peque?as para ni?os: " + (getsmallWheels() == true
                ? "S?"
                : "No"
        );
    }
}