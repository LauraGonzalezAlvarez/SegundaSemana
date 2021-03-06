
/**
  * Clase Coche con sus metodos y atribulos
 *
 * @author Laura Daniela Gonzalez Alvarez   <lhaogonzaleza@gmail.com>
 * @version 1.0.0 2022-06-05
 * @since 1.0.0
 */
public class Car extends Vehicle {
    /**
     * Variable l?gica carro  
     */
    private boolean car;

    /**
     * M?todos setters
     */
    public void setCar(boolean car) {
        this.car = car;
    }

    /**
     * M?todos getters
     */
    public boolean getCar() {
        return this.car = car;
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
        return "Tipo de veh?culo: Coche \n" +
                super.toString() + " \n El?ctrico: " + (getCar() == true
                ? "S?"
                : "No"
        );
    }
}
