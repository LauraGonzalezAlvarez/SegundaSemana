import java.util.Arrays;
/**
 * Clase que permite ordenar por los métodos  burbuja y quicksort de manera ascendente.
 *
 * @author Laura Daniela Gonzalez Alvarez <lhaogonzaleza@gmail.com>
 * @version 1.0.0 2022-06-05
 * @since 1.0.0
 */
public class Array implements IArray  {
	
	 /**
     *  instancia del array      
     */
    private static Array instance;
    /*
     * Constructor vacio
     */
    private Array() {

    }

    /**
     * Obtiene la instancia de la clase
     *
     * @return instance  
     */
    public static Array getInstance() {
        if (instance == null) {
            instance = new Array();
        }
        return instance;
    }

    /**
     * Implementación del método abstracto burbuja
     */
    @Override
    public double[] bubbleMethodAsc(double[] number) {
        int i;
        boolean flag = true;
        double aux;

        while (flag) {
            flag = false;
            for (i = 0; i < number.length - 1; i++) {
                if (number[i] > number[i + 1]) {
                    aux = number[i];
                    number[i] = number[i + 1];
                    number[i + 1] = aux;
                    flag = true;
                }
            }
        }
        return number;
    }

    /**
     * Implementación del método abstracto quick sort
     */
    
    @Override
    public void quickSort(double[] number, int start, int end) {
        if (start >= end) {
            return;
        }

        double pivot = number[start];
        int leftLimit = start + 1;
        int rightLimit = end;

        while (leftLimit <= rightLimit) {
            while (leftLimit <= end && number[leftLimit] < pivot) {
                leftLimit++;
            }
            while (rightLimit > start && number[rightLimit] >= pivot) {
                rightLimit--;
            }
            if (leftLimit < rightLimit) {
                double temp = number[leftLimit];
                number[leftLimit] = number[rightLimit];
                number[rightLimit] = temp;
            }
        }
        if (rightLimit > start) {
            double temp = number[start];
            number[start] = number[rightLimit];
            number[rightLimit] = temp;
        }
        this.quickSort(number, start, rightLimit - 1);
        this.quickSort(number, rightLimit + 1, end);
    }

    /**
      * Método que ordena un vector de manera ascendente por medio de quicksort.
     */
    @Override
    public double[] quickSortAsc(double[] number) {
        double[] arrayCopy = Arrays.copyOf(number, number.length);
        this.quickSort(arrayCopy, 0, arrayCopy.length - 1);
        return arrayCopy;

}
    
}
