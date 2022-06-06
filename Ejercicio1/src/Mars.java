/**
 * Clase Marte con sus métodos
 *
 * @author Laura Daniela Gonzalez Alvarez <lhaogonzaleza@gmail.com>
 * @version 1.0.0 2022-06-05
 * @since 1.0.0
 */
public class Mars extends Planet {
    /*     
     * Constructor que inicializa los valores de Marte.
     */
    public Mars() {
        super("Marte", 8.40, 1.7, 3.1, 1.6);
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