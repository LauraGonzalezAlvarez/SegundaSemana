/**
 * Define los métodos que debe implementar una clase de tipo Array
 * @author Laura Daniel Gonzalez Alvarez <lhaogonzaleza@gmail.com>
 * @version 1.0.0 2022-06-05
 */
public interface IArray {
	/**
     * Ordena el array utilizando el método burbuja     *    
     */
    public double[] bubbleMethodAsc(double[] number);

    /**
     * Ordena el array utilizando el método   quicksort   
     */
    public void quickSort(double[] number, int start, int end);

    /**
     * Método que ordena un vector de manera ascendente por medio de quicksort.        
     */
    public double[] quickSortAsc(double[] number);
}
