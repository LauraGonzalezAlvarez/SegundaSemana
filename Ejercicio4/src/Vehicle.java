import java.util.Calendar;
import java.util.UUID;


	
/**
 * Clase Vehiculo con sus atributos
 *
 * @author Laura Daniela Gonzalez Alvarez <lhaogonzaleza@gmail.com>
 * @version 1.0.0 2022-06-05
 * @since 1.0.0
 */
public class Vehicle {
	/**
     * Permite identificar el vehículo con un codigo único
     */
    UUID Id;
	 /**
     * Tipo de vehículo  medio por donde se desplaza 
     */
    String vehicleGuy;
	 /**
     * Número de asientos del vehículo
     */
    int numSeats;    
    /**
     * Nombre del vehículo
     */
    String Name;
    /**
     * Fecha de matricula del vehículo 
     */
    Calendar registration;      
    /**
     * Número de pasajeros del vehículo 
     */
    int numPassengers;
    /**
     * Número de puertas del vehículo
     */
    int numDoors;
       /**    
     * Presencia o ausencia de tripulación
     */
    int occupants;
    /**
     * Número de ruedas 
     */
    int numWheels;
   

    /**
     * Constructor vehiculo que asigna codigo unico al Id
     */
    public Vehicle() {
        this.Id = UUID.randomUUID();
    }

    
    public void setName(String Name) {
        this.Name = Name;
    }

    public void setRegistration(Calendar registration) {
        this.registration = registration;
    }

   
    public void setNumPassengers(int numPassengers) {
        this.numPassengers = numPassengers;
    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }

    public void setNumSeats(int numSeats) {
        this.numSeats = numSeats;
    }

    public void setOccupants(int occupants) {
        this.occupants = occupants;
    }

    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }

    public void setVehicleGuy(String vehicleGuy) {
        this.vehicleGuy = vehicleGuy;
    }

   
    public UUID getID() {
        return Id;
    }

    public String getName() {
        return Name;
    }

    public Calendar getRegistration() {
        return registration;
    }

   
    public int getNumPassengers() {
        return numPassengers;
    }

    public int getNumDoors() {
        return numDoors;
    }

    public int getNumSeats() {
        return numSeats;
    }

    public int getOccupants() {
        return occupants;
    }

    public int getNumWheels() {
        return numWheels;
    }

    public String getVehicleGuy() {
        return vehicleGuy;
    }

    /**     
     * Imprime por pantalla la informacion que el usuario registró     
     * @return String   
     */
    public String toString() {
        return "El nombre del vehículo es: " + getName() +
                "\nCantidad de puertas: " + getNumDoors() +
                "\nCantidad de asientos: " + getNumSeats() +
                "\nCantidad de ruedas: " + getNumWheels() +
                "\nTipo de vehículo: " + getVehicleGuy();
    }
}	