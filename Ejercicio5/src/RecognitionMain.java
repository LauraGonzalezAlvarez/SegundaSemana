import java.text.ParseException;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;

public class RecognitionMain {

	public static void main(String[] args) {
		int ferryCapacity = 2;
        Vehicle[] ferry = new Vehicle[ferryCapacity];

        for (int i = 0; i < ferryCapacity; i++){
           try {
               String registerDate;
               Vehicle vehicle = getVehicle();

               System.out.println("Registro #" + (i + 1));
               vehicle.setName(readString("Ingrese el nombre del vehículo: "));
               registerDate = readString("Ingrese la fecha de registro de vehículo (Año/mes/dia yyyy/mm/dd): ");
               SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
               Date date = format.parse(registerDate);
               Calendar calendar = Calendar.getInstance();
               calendar.setTime(date);
               vehicle.setRegistration(calendar);
               vehicle.setNumWheels(readInt("Ingrese la cantidad de ruedas: "));
               vehicle.setVehicleGuy(readString("Ingrese el tipo de vehículo: "));
               vehicle.setNumDoors(readInt("Ingrese la cantidad de puertas: "));
               vehicle.setNumSeats(readInt("Ingrese la cantidad de asientos: "));
              
               ferry[i] = vehicle;
           } catch (ParseException e){
                e.printStackTrace();
                i --;
           }
        }

        for (int i = 0; i < ferryCapacity; i++){
            System.out.println("Registro #" + (i + 1));
            System.out.println(ferry[i].toString());
           
        }
    }
	
	 /**
    *
    * @param message
    * @return
    */
   static Integer readInt (String message){
       Scanner option = new Scanner(System.in);
       System.out.println(message);
       return option.nextInt();

   }

    /**
     *
     * @param message
     * @return
     */
    static String readString (String message){
        Scanner option = new Scanner(System.in);
        System.out.println(message);
        return option.nextLine();
    }

   

    /**
     *
     * @return
     */
    static Vehicle getVehicle(){
        Vehicle vehicle;
        String vehicleType;
        Scanner entry = new Scanner(System.in);
        System.out.println("Digite el tipo de vehículo:" +
                "\nBicicleta" +
                "\nLancha" +
                "\nCoche" +
                "\nMoto" +
                "\nCamión");

        vehicleType = entry.nextLine();

        if (vehicleType.equalsIgnoreCase("Bicicleta")){
            vehicle = new Bicycle();
            String answer = readString("¿Tiene ruedas para niños? [Sí - No]");
            ((Bicycle) vehicle).setsmallWheels(answer.equalsIgnoreCase("Si"));
        } else if (vehicleType.equalsIgnoreCase("Lancha")){
            vehicle = new Boat();
            String answer = readString("¿Tiene un motor? [Sí - No]");
            ((Boat) vehicle).setHasEngine(answer.equalsIgnoreCase("Si"));
        } else if (vehicleType.equalsIgnoreCase("Coche")){
            vehicle = new Car();
            String answer = readString("¿Es Tiene cuatro llantas y es familiar? [Si - No]");
            ((Car) vehicle).setCar(answer.equalsIgnoreCase("Si"));
        } else if (vehicleType.equalsIgnoreCase("Moto")){
            vehicle = new Motorcycle();
            String answer = readString("¿Tiene 2 llantas y utiliza gasolina? [Si - No]");
            ((Motorcycle) vehicle).setIsSported(answer.equalsIgnoreCase("Si"));
        } else if (vehicleType.equalsIgnoreCase("Camion")){
            vehicle = new Truck();
            String answer = readString("Tipo de camión: ");
            ((Truck) vehicle).setTruck(answer);
        } else {
            vehicle = null;
        }
        return vehicle;

	}

}
