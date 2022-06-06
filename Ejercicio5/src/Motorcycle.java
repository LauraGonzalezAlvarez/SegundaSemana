
/**
 * Clase Moto con sus metodos y atribulos
 *
  * @author Laura Daniela Gonzalez Alvarez   <lhaogonzaleza@gmail.com>
 * @version 1.0.0 2022-06-05
 * @since 1.0.0
 */
public class Motorcycle extends Vehicle {
    /**
     * Variable logica motocicleta
     */
    private boolean motorcycle;
    
    /**
     * Método getter
     */
    public boolean getMotorcycle() {
        return this.motorcycle;
    }

    /**
     * Método setter
     */
    public void setIsSported(boolean motorcycle) {
        this.motorcycle = motorcycle;
    }   

    /**
     * @return String     
     */
    public String startUp() {
        return "";
    }

    /**
     * @return String     
     */
    public String stop() {
        return "";
    }

    @Override
    public String toString(){
        return "Tipo de vehículo: Moto \n" +
                super.toString() + " \n Motocicleta: " + (getMotorcycle() == true
                ? "Sí"
                : "No"
        );
    }
}
