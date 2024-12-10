/*
Realiza un programa para leer una secuencia de números no nulos quefinalice con la introducción
de un 0, y que obtenga e imprima si ha leído algún número negativo, cuantos positivos y cuantos
negativos
*/

import java.util.Scanner;

public class propuesto13 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int numero;
        int negativos = 0;
        int positivos = 0;

        do {
            System.out.println("Introduzca un número: ");
            numero = teclado.nextInt();
            if (numero < 0) {
                negativos++;
            } else if (numero > 0) {
                positivos++;
            }

        } while (numero != 0);

        if (negativos > 0) {
            System.out.println("Se han encontrado números negativos.");
        }

        System.out.println(positivos + " números positivos.");
        System.out.println(negativos + " números negativos");

    }
}
