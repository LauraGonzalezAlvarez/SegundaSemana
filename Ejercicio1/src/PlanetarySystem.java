
	import java.util.ArrayList;
	import java.util.Scanner;
	
	/**
	 * Main principal 
	 *
	 * @author Laura Daniela Gonzalez Alvarez <lhaogonzaleza@gmail.com>
	 * @version 1.0.0 2022-06-05
	 * @since 1.0.0
	  */
		
public class PlanetarySystem {

	public static void main(String[] args) {
	
		  int option = 0;

	        /*
	         * Se crean los objetos planetarios y se agregan a la lista 
	         */
	        ArrayList<Planet> list_Planet = new ArrayList<Planet>();

	        list_Planet.add(new Earth());
	        list_Planet.add(new Jupiter());
	        list_Planet.add(new Saturn());
	        list_Planet.add(new Neptune());
	        list_Planet.add(new Mars());
	        list_Planet.add(new Uranus());
	        list_Planet.add(new Venus());
	        list_Planet.add(new Mercury());
	        list_Planet.add(new Earth("Tierra 2"));

	        /*
	         * Menú para que el usuario elija la opcion hasta que desee terminar.
	         */
	        do {
	            Scanner read = new Scanner(System.in);
	            System.out.println("Sistema planetario \n" +
	                    "A continuación digite la opción que desee: \n" +
	                    "1. Ver sistema planetario. \n" +
	                    "2. Calcule la atracción gravitatoria  entre dos cuerpos \n" +
	                    "3. Salir.");
	            option = read.nextInt();

	            switch (option) {
	                case 1:
	                    for (int i = 0; i < list_Planet.size(); i++) {
	                        System.out.println(list_Planet.get(i).informationPlanet());
	                    }
	                    break;

	                case 2:
	                    int flag1, flag2;
	                    Planet planet1, planet2;
	                    float distance;
	                    double force;

	                    for (int i = 0; i < list_Planet.size(); i++) {
	                        System.out.println(i + " " + list_Planet.get(i).getName());
	                    }

	                    Scanner read2 = new Scanner(System.in);
	                    System.out.println("Digite el índice del primer planeta");
	                    flag1 = read2.nextInt();

	                    System.out.println("Digite el índice del segundo planeta");
	                    flag2 = read2.nextInt();

	                    planet1 = list_Planet.get(flag1);
	                    planet2 = list_Planet.get(flag2);

	                    System.out.println("Digite la distancia entre " + planet1.getName() + " y " + planet2.getName());
	                    distance = read2.nextFloat();

	                    force = planet1.gravitationalAttraction(planet2, distance);
	                    System.out.println(
	                            "La atracción gravitatoria entre " +
	                                    planet1.getName() +
	                                    " y " +
	                                    planet2.getName() +
	                                    " es: " +
	                                    force
	                    );
	                    break;

	                case 3:
	                    System.exit(0);
	                    break;
	                
	                default:
	                    System.out.println("Número inválido");
	            }
	        } while (option != 4);
		
	}

}
