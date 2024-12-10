/*
Realiza un programa que cuente los múltiplos de 3 desde el 1 hasta un número que introducimos
por teclado.
*/

import java.util.Scanner;

public class propuesto19 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int numero;
        int multiplo = 0;

        System.out.println("Introduce el número: ");
        numero = teclado.nextInt(); teclado.nextLine();

        for (int i = 1; i <= numero; i++) {
            if (i % 3 == 0) {
                System.out.println("Múltiplo de 3: " + i);
                multiplo++;
            }
        }

        System.out.println("Total de múltiplos: " + multiplo);
    }
}
