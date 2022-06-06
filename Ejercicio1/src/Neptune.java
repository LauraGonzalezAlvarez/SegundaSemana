/**
 * Clase  Neptuno con sus métodos
 *
 * @author Laura Daniela Gonzalez Alvarez <lhaogonzaleza@gmail.com>
 * @version 1.0.0 2022-06-05
 * @since 1.0.0
 */
public class Neptune extends Planet {
    /*
    * Constructor que inicializa los valores de Neptuno.
     */
    public Neptune() {
        super("Neptuno", 1.05, 1.7, 4.1, 1.8);
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