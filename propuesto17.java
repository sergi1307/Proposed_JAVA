/*
Realiza un programa que calcule el valor de elevar (sin utilizar el operador de potencia) un
número real, a, a un número exponente entero, b
*/

import java.util.Scanner;

public class propuesto17 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int a;
        int b;
        int resultado = 1;

        System.out.println("Introduce el valor de a: ");
        a = teclado.nextInt(); teclado.nextLine();

        System.out.println("Introduce el valor de b: ");
        b = teclado.nextInt(); teclado.nextLine();

        for (int i = 1; i <= b; i++) {
            resultado *= a;
        }

        System.out.println(a + " elevado a " + b + " es: " + resultado);

    }
}
