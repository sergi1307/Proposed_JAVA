/*
Realiza un programa que lea 2 números y muestre el mensaje “Son iguales” o que muestre el
número más grande.
*/

import java.util.Scanner;

public class propuesto2 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int num1;
        int num2;

        System.out.println("Introduce el primer número:");
        num1 = teclado.nextInt();

        System.out.println("Introduce el segundo número:");
        num2 = teclado.nextInt();

        if (num1 < num2) {
            System.out.println("El número: " + num2 + " es mayor que el numero " + num1);
        } else if (num1 == num2) {
            System.out.println("El número: " + num1 + " es mayor que el numero " + num2);
        } else System.out.println("Los dos números son iguales");

    }
}
