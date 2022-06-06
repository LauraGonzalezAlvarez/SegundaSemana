
/**
  * Clase Camión con sus metodos y atribulos
 *
 * @author Laura Daniela Gonzalez Alvarez   <lhaogonzaleza@gmail.com>
 * @version 1.0.0 2022-06-05
 * @since 1.0.0
 */
public class Truck extends Vehicle {
    /**
     * Variable camión
     */

    private String truck;

    /**
     * Métodos setter
     */
    public void setTruck(String truck) {
        this.truck = truck;
    }

    /**
     * Métodos getter
     */
    public String getTruck() {
        return this.truck;
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
        return "Tipo de vehículo: Camión \n" +
                super.toString() + " \n Tipo: " + (getTruck());
    }
}