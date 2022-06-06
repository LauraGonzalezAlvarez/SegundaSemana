import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class RandomMain {

	public static void main(String[] args) {
		String sort = "";
        int length = 0;
        double numbers[];
        float min = -100, max = 100;

        Scanner option = new Scanner(System.in);
        System.out.println("Cuantos numeros aleatorios desea generar?: ");

        /**
         * @exception Si  digita un carácter diferente a entero.
         */
        try {
        	length = option.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("\u001B[31m " + "[ERROR]" + "\u001B[0m \n" +
                    "Introduce un valor numérico");
        }

        /*
         * Arreglo que almacena numeros aleatorios.
         */
        numbers = new double[length];

        /*
         * Recorre el arreglo asignando el valor aleatorio.
         */
        for (int i = 0; i < length; i++) {
            Random random = new Random();
            double randomNumber = min + random.nextDouble() * (max - min);
            double roundedNumber = (double) Math.round(randomNumber * 100) / 100;

            numbers[i] = roundedNumber;
        }

        /*
         * Muestra por pantalla el arreglo
         */
        System.out.println("Arreglo a ordenar: " + Arrays.toString(numbers));

        Scanner option1 = new Scanner(System.in);
        System.out.println("Cómo desea ordenar los números con el método:"
        		+ " burbuja = 1 "
        		+ " quick = 2");
        sort = option1.nextLine();
        /*
         * Condicional 
         * Si es caso 1 ordena por el metodo burbuja
         * De lo contrario por el método quick
         */
        double[] numbersUp = sort.equalsIgnoreCase("1")
                ? Array.getInstance().bubbleMethodAsc(numbers)
                : Array.getInstance().quickSortAsc(numbers);
        System.out.println( Arrays.toString(numbersUp));

	}

}
