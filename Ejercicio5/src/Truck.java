
/**
  * Clase Cami�n con sus metodos y atribulos
 *
 * @author Laura Daniela Gonzalez Alvarez   <lhaogonzaleza@gmail.com>
 * @version 1.0.0 2022-06-05
 * @since 1.0.0
 */
public class Truck extends Vehicle {
    /**
     * Variable cami�n
     */

    private String truck;

    /**
     * M�todos setter
     */
    public void setTruck(String truck) {
        this.truck = truck;
    }

    /**
     * M�todos getter
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
        return "Tipo de veh�culo: Cami�n \n" +
                super.toString() + " \n Tipo: " + (getTruck());
    }
}