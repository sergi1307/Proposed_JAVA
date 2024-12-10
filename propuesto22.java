/*
Realiza un programa que lea y acepte números double de forma consecutiva teniendo en cuenta
que se deben introducir valores superiores a los anteriores.Únicamente se aceptarán aquellos
que sean mayores que el último dado. La introducción de números finalizará con la introducción
de un 0
*/

import java.util.Scanner;

public class propuesto22 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int aciertos = 0;
        int fallos = 0;
        int total = 0;
        double numero;
        double numero_contador = 0;

        do {
            System.out.println("Introduzca el número:");
            numero = teclado.nextDouble(); teclado.nextLine();

            if (numero > numero_contador) {
                aciertos++;
                total++;
                numero_contador = numero;
            } else if (numero < numero_contador && numero != 0) {
                fallos++;
                total++;
                numero_contador = numero;
            }

        } while (numero != 0);

        System.out.println("Números introducidos: " + total + "\nNúmeros acertados: " + aciertos + "\nNúmeros fallados: " + fallos);

    }
}
