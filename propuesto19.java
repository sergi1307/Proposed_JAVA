/*
Realiza un programa que cuente los múltiplos de 3 desde el 1 hasta un número que introducimos
por teclado.
*/

import java.util.Scanner;

public class propuesto19 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int numero;
        int multiplo;

        System.out.println("Introduce el número: ");
        numero = teclado.nextInt(); teclado.nextLine();

        for (int i = 1; i <= numero; i++) {
            System.out.println(3 + " x " + i + " = " + (i * 3));
        }
    }
}
