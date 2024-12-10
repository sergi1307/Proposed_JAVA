/*
Escribe un programa que lea una nota numérica entre 0 y 10 y muestre si el resultado es: insuficiente (menos de 5), suficiente (entre 5 y 6), bien (entre 6 y 7), notable (entre 7 y 9), excelente
(entre 9 y 10) o matrícula de honor (10)
*/

import java.util.Scanner;

public class propuesto4 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        float nota;

        do {
            System.out.println("Introduce la nota a examinar:");
             nota = teclado.nextFloat();
        } while (nota < 0 || nota > 10);

        if (nota < 5) {
            System.out.println("Insuficiente");
        } else if (nota <= 6) {
            System.out.println("Suficiente");
        } else if (nota <= 7) {
            System.out.println("Bien");
        } else if (nota <= 9) {
            System.out.println("Notable");
        } else if (nota < 10) {
            System.out.println("Excelente");
        } else System.out.println("Matrícula de honor.");
    }
}
