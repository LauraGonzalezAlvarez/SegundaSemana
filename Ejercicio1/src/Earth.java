/**
 * Clase Tierra con sus métodos
 *
 * @author Laura Daniela Gonzalez Alvarez <lhaogonzaleza@gmail.com>
 * @version 1.0.0 2022-06-05
 * @since 1.0.0
 */
public class Earth extends Planet {
    /**
     * Constructor: Asigna un sobrenombre a la tierra.
     *
     * @param nick_name apodo que se asignará a la tierra
     */
    public Earth(String nick_name) {
        super("tierra (" + nick_name + ")", 3.98, 1.3, 5.0, 2.7);
    }

    /*
     * Constructor
     * Inicializa los atributos del planeta tierra.
     */
    public Earth() {
        super("tierra", 3.98, 1.3, 5.0, 2.7);
    }

    
    @Override
    public String getName() {
        return "Yo soy: " + super.getName();
    }


    @Override
    public String informationPlanet() {
        return "Identificador: " + getID() + "\n" +
                "Nombre: " + getName() + "\n" +
                "Densidad: " + getDensity() + "\n" +
                "Masa: " + getMass() + "\n" +
                "Distancia: " + getDistance() + "\n"+
                "Diámetro: " + getDiameter() + "\n" ;
                
    }
}