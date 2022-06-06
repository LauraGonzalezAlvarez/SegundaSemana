import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		boolean starting = true;
		Numbers values = new Numbers();

        while (starting == true) {
            Integer number;

            Scanner option = new Scanner(System.in);
            System.out.println("Por favor ingrese número");
            number = option.nextInt();
            values.addNumber(number);
        }

	}

}
