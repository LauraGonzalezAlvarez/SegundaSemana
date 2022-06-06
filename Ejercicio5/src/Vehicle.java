
import java.util.Calendar;
import java.util.UUID;
import java.text.SimpleDateFormat;

/**
 * @author Gretty Mosquera <gretymosquera@gmail.com>
 */
public abstract class Vehicle {
	/**
     * Permite identificar el veh�culo con un codigo �nico
     */
    UUID Id;
	 /**
     * Tipo de veh�culo  medio por donde se desplaza 
     */
    String vehicleGuy;
	 /**
     * N�mero de asientos del veh�culo
     */
    int numSeats;    
    /**
     * Nombre del veh�culo
     */
    String Name;
    /**
     * Fecha de matricula del veh�culo 
     */
    Calendar registration;      
    /**
     * N�mero de pasajeros del veh�culo 
     */
    int numPassengers;
    /**
     * N�mero de puertas del veh�culo
     */
    int numDoors;
       /**    
     * Presencia o ausencia de tripulaci�n
     */
    int occupants;
    /**
     * N�mero de ruedas 
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
     * Muestra la informaci�n que contiene un veh�culo
     *
     * @return String
     * @author Gretty Mosquera <gretymosquera@gmail.com>
     */
    public String toString() {
        SimpleDateFormat format = new SimpleDateFormat("yyyy M d");
        String date = format.format(getRegistration().getTime());
        return "El nombre del veh�culo es: " + getName() +
                "\nCantidad de puertas: " + getNumDoors() +
                "\nCantidad de asientos: " + getNumSeats() +
                "\nCantidad de ruedas: " + getNumWheels() +
                "\nTipo de veh�culo: " + getVehicleGuy();
    }

    /**
     * M�todo abstracto para iniciar marcha
     * @return String     
     */
    public abstract String startUp();

    /**
     * M�todo abstracto para detener marcha
     * @return String     
     */
    public abstract String stop();
}
