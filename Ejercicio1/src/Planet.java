import java.util.UUID;

/**
 * Clase abstracta con los Atributos de los planetas
 *
 * @author Laura Daniela Gonzalez Alvarez <lhaogonzaleza@gmail.com>
 * @version 1.0.0 2022-06-05
 * @since 1.0.0
  */
public abstract class Planet implements PlanetMethod {
    /*
     * Atributos por defecto de los planetas
     */

	 /**
     * Valor de la distancia
     */
    private double distance;
    /**
     * Identificador inmutable del planeta
     */
    private UUID ID;
    
    /**
     * Valor del diámetro de un planeta
     */
    private double diameter;
    /**
     * Nombre del planeta
     */
    private String name;
    /**
     * Valor de la masa del planeta
     */
    private double mass;
    /**
     * Valor de la densidad de un planeta
     */
    private double density;
   
   
/**
 * Constructor de la clase con los siguientes parametros
 * @param name  Nombre del planeta
 * @param mass Valor de la densidad de un planeta
 * @param density Valor de la densidad de un planeta
 * @param diameter Valor del diámetro de un planeta
 * @param distance  Valor de la distancia
 */
    public Planet(String name, double mass, double density, double diameter, double distance) {
        this.ID = UUID.randomUUID();
        this.name = name;
        this.mass = mass;
        this.density = density;
        this.diameter = diameter;
        this.distance = distance;
    }

    /*
     * Métodos getters
     */
    public UUID getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public double getMass() {
        return mass;
    }

    public double getDensity() {
        return density;
    }

    public double getDiameter() {
        return diameter;
    }

    public double getDistance() {
        return distance;
    }

    /**
     * Calculo de la fuerza graviacional
     * @return double Valor de la fuerza gravitacional
     */
    public double gravitationalAttraction(Planet planet, double distance) {
    	double mass2 = planet.getMass();      
        double mass1 = this.getMass();
        double gravity = 9.7805;
        double force = gravity * ((mass1 * mass2) / (Math.pow(distance, 2)));
        return force;
    }
}