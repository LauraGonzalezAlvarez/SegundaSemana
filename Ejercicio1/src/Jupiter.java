
/**
 * Clase Júpiter con sus métodos
 *
* @author Laura Daniela Gonzalez Alvarez <lhaogonzaleza@gmail.com>
* @version 1.0.0 2022-06-05
* @since 1.0.0
 */
public class Jupiter extends Planet {
    /*
     * Constructor que inicializa los valores de Júpiter
     */
    public Jupiter() {
        super("Júpiter", 2.84, 1.7, 4.4, 1.6);
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