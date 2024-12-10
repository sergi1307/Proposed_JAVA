/*
Realiza un programa que pida un número entero N entre 0 y 20 y luego muestre por pantalla los
números desde 1 hasta N, uno en cada línea, repitiendo cada número tantas veces como su valor
*/

import java.util.Scanner;

public class propuesto23 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int numero;

        do {
            System.out.println("Introduzca un número entre 1 y 20:");
            numero = teclado.nextInt(); teclado.nextLine();
        } while (numero < 1 || numero > 20);

        for (int i = 1; i <= numero; i++) {
            for (int x = 1; x <= i; x++) {
                System.out.print(i);
            }
            System.out.println(" ");
        }

    }
}
