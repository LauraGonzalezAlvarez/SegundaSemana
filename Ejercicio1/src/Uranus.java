
/**
 * Clase Urano con sus métodos
 *
 * @author Laura Daniela Gonzalez Alvarez <lhaogonzaleza@gmail.com>
 * @version 1.0.0 2022-06-05
 * @since 1.0.0
 */
public class Uranus extends Planet {
    /*
     *Constructor que inicializa los valores de Urano.
     */
    public Uranus() {
        super("Urano", 8.67, 4.7, 2.5, 5.6);
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