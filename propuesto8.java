import java.util.Scanner;

public class propuesto8 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int numero;
        int multiplicacion = 1;
        int suma = 0;

        do {
            System.out.println("Introduzca un número: ");
            numero = teclado.nextInt();
        } while (numero < 0);

        for (int i = 1; i <= numero; i++) {
            System.out.print(i);
            suma += i;
            multiplicacion *= i;

            if (i < numero) {
                System.out.print(", ");
            } else System.out.println(".");
        }

        System.out.println("El resultado de la suma es: " + suma);
        System.out.println("El resultado de la multiplicación es: " + multiplicacion);

    }
}
