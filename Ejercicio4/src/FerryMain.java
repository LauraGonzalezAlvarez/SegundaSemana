import java.util.Scanner;

public class FerryMain {

	public static void main(String[] args) {
		 int Capacity = 10;
	        Vehicle[] ferry = new Vehicle[Capacity];

	        for (int i = 0; i < Capacity; i++) {
	            Vehicle vehicle = new Vehicle();
	            System.out.println("Registro #" + (i + 1));
	            vehicle.setName(readString("Ingrese el nombre del vehículo: "));
	            vehicle.setVehicleGuy(readString("Ingrese el tipo de vehículo (Maritimo, terrestre, aereo): "));
	            vehicle.setNumDoors(readInt("Ingrese la cantidad de puertas: "));
	            vehicle.setNumWheels(readInt("Ingrese la cantidad de ruedas: "));
	            vehicle.setNumSeats(readInt("Ingrese la cantidad de asientos: "));            
	            
	            ferry[i] = vehicle;
	        }

	        for (int i = 0; i < Capacity; i++) {
	            System.out.println("Registro #" + (i + 1));
	            System.out.println(ferry[i].toString());
	            
	        }
	    }

		/**
	     *  Método que recibe un valor de tipo Integer
	     *
	     * @param message
	     * @return Integer
	     */
	    static Integer readInt(String message) {
	        Scanner option = new Scanner(System.in);
	        System.out.println(message);
	        return option.nextInt();
	
	    }

	    /**
	     * Método que recibe un valor de tipo String
	     *
	     * @param message
	     * @return String
	     */
	    static String readString(String message) {
	        Scanner option = new Scanner(System.in);
	        System.out.println(message);
	        return option.nextLine();
	    }

	    

}
