
/**
* Clase Saturno con sus métodos*
* @author Laura Daniela Gonzalez Alvarez <lhaogonzaleza@gmail.com>
* @version 1.0.0 2022-06-05
* @since 1.0.0
*/
public class Saturn extends Planet {
    /*
     Constructor que inicializa los valores de Saturno.
     */
    public Saturn() {
        super("Saturno", 5.98, 2.9, 5.2, 1.9);
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
