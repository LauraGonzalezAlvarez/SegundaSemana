
/**
  * Clase Bote con sus metodos y atribulos
 *
  * @author Laura Daniela Gonzalez Alvarez   <lhaogonzaleza@gmail.com>
 * @version 1.0.0 2022-06-05
 * @since 1.0.0
 */
public class Boat extends Vehicle {
    /**
     * Variable logica motor
     */
    private boolean engine;
    
    /**
     * M�todo getter
     */
    public boolean getEngine() {
        return this.engine;
    }

    /**
     * M�todo setter
     */
    public void setHasEngine(boolean engine) {
        this.engine = engine;
    }

   

    /**
     * M�todo para iniciar marcha
     * @return String
      */
    public String startUp() {
        return "";
    }

    /**
     * M�todo para detener marcha
     * @return String    
     */
    public String stop() {
        return "";
    }

    @Override
    public String toString() {
        return "Tipo de veh�culo: Lancha \n" +
                super.toString() + " \n Motor: " + (getEngine() == true
                ? "S�"
                : "No"
        );
    }
}