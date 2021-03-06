import java.util.Vector;

/**
 * Esta clase contiene valores de un vector
 *
 * @author Laura Daniela Gonzalez <lhaogonzaleza@gmail.com>
 * @version 1.0.0 2022-06-05
 * @since 1.0.0
 */
public class Numbers {

	/*
     * Atributos
     */
    private Vector<Integer> values;

    /*
     * Constructor
     */
    public Numbers() {
        this.values = new Vector<Integer>(5);
    }

    
    /**
     * Agrega los valores al vector y si se repite un valor sale del programa   
     */
    public void addNumber(Integer number) {
        int length = this.values.size();

        if (length > 0 && number == this.values.get(this.values.size() - 1)) {
            this.seeNumbers();
            System.exit(0);
        } else {
            this.values.add(number);
        }
    }
    /**
     * Muestra cada elemento del vector   
     */
    public void seeNumbers() {
        int length = this.values.size();

        for (int i = 0; i < length; i++) {
            System.out.println(this.values.get(i));
        }
    }

    
}
