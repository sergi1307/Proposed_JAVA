/*
Realiza un programa para leer un número positivo N y que calcule y visualice su factorial N!
*/

import java.util.Scanner;

public class propuesto9 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int numero;
        int fac = 1;

        do {
            System.out.println("Introduzca un número:");
            numero = teclado.nextInt();
        } while (numero < 0);

        for (int i = numero; i > 0; i--) {
            fac *= i;
            if (i == numero) {
                System.out.print(numero + "! = " + i + " x ");
            } else if (i != 1) {
                System.out.print(i + " x ");
            } else System.out.println(i + " = " + fac);
        }
    }
}