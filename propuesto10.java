/*
Realiza un programa para leer 10 números no nulos y que visualice un mensaje de si ha leído
algún número negativo o no.(comprobación para un número menor)
*/

import java.util.Scanner;

public class propuesto10 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int numero;
        int negativos = 0;
        int positivos = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Introduce un número:");
            numero = teclado.nextInt();

            if (numero < 0) {
                negativos++;
            } else if (numero > 0) {
                positivos++;
            }
        }

        if (negativos > 0) {
            System.out.println("Se han encontrado "+negativos+" números negativos.");
        }

        System.out.println("Y has introducido "+positivos+" números positivos");
    }
}
