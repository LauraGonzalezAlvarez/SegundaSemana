
/**
 * Clase Mercurio con sus métodos
 *
 * @author Laura Daniela Gonzalez Alvarez <lhaogonzaleza@gmail.com>
 * @version 1.0.0 2022-06-05
 * @since 1.0.0
 */
public class Mercury extends Planet {
    /*
    * Constructor que inicializa los valores de Mercurio.
    */
    public Mercury() {
        super("Mercurio", 1.28, 1.4, 2.1, 1.2);
    }

    @Override
    public String informationPlanet() {
        return  "Identificador: " + getID() + "\n" +
        		"Nombre: " + getName() + "\n" +
                "Densidad: " + getDensity() + "\n" +
                "Masa: " + getMass() + "\n" +
                "Distancia: " + getDistance() + "\n"+
                "Diámetro: " + getDiameter() + "\n" ;
    }
}