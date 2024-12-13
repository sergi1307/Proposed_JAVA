/*
Realiza un programa que dada una cantidad de euros (múltiplo de 5) realice el desglose de
billetes (500, 200, 100, 50, 20, 10, 5), siempre intentando dar el mínimo de billetes posible
*/

import java.util.Scanner;

public class propuesto21 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int dinero;
        int b500 = 0;
        int b200 = 0;
        int b100 = 0;
        int b50 = 0;
        int b20 = 0;
        int b10 = 0;
        int b5 = 0;

        do {
            System.out.println("Introduce un número múltiplo de 5: ");
            dinero = teclado.nextInt(); teclado.nextLine();
        } while (dinero % 5 != 0);

        while (dinero > 0) {
            if (dinero >= 500) {
                b500++;
                dinero = dinero - 500;
            } else if (dinero >= 200) {
                b200++;
                dinero = dinero - 200;
            } else if (dinero >= 100) {
                b100++;
                dinero = dinero - 100;
            } else if (dinero >= 50) {
                b50++;
                dinero = dinero - 50;
            } else if (dinero >= 20) {
                b20++;
                dinero = dinero - 20;
            } else if (dinero >= 10) {
                b10++;
                dinero = dinero - 10;
            } else if (dinero >= 5) {
                b5++;
                dinero = dinero - 5;
            }
        }

        System.out.println("Billete/s de 500: " + b500);
        System.out.println("Billete/s de 200: " + b200);
        System.out.println("Billete/s de 100: " + b100);
        System.out.println("Billete/s de 50: " + b50);
        System.out.println("Billete/s de 20: " + b20);
        System.out.println("Billete/s de 10: " + b10);
        System.out.println("Billete/s de 5: " + b5);
    }
}
