import java.util.Scanner;

public class propuesto11 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int numero;
        int positivos = 0;
        int negativos = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.println("Introduzca el número: ");
            numero = teclado.nextInt();

            if (numero < 0) {
                negativos++;
            } else if (numero > 0) {
                positivos++;
            }
        }

        System.out.println("Números positivos: "+positivos);
        System.out.println("Números negativos: "+negativos);

    }
}
