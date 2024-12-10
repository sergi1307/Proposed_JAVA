/*
Realiza un programa que pida dos número enteros A y B, siendo B mayor que A. Luego visualiza
los números desde A hasta B e indicar cuantos hay que sean pares
*/

import java.util.Scanner;

public class propuesto20 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int a;
        int b;
        int pares = 0;

        System.out.println("Introduce el número a: ");
        a = teclado.nextInt(); teclado.nextLine();

        do {
            System.out.println("Introduce el número b: ");
            b = teclado.nextInt(); teclado.nextLine();
        } while (b < a);

        for (int i = a; i <= b; i++) {
            System.out.print(i);
            if (i < b) {
                System.out.print(", ");
            } else {
                System.out.println(".");
            }
            if (i % 2 == 0) {
                pares ++;
            }
        }

        System.out.println("Hay " + pares + " números pares.");
    }
}
