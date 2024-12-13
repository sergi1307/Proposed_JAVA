/*
Realiza un programa donde el usuario piensa un número del 1 al 100 y el ordenador lo adivina. El
usuario deberá ir indicando al ordenador si es mayor, menor o igual a cada una de las propuestas
*/

import java.util.Scanner;
import java.lang.Math;

public class propuesto24 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int max = 100;
        int min = 1;
        int range;
        int maquina;
        int numero_persona;
        String respuesta;

        System.out.println("Introduce el numero: ");
        numero_persona = teclado.nextInt();teclado.nextLine();

        do {

            range = max - min + 1;
            maquina = (int)(Math.random() * range) + min;
            System.out.println(maquina);

            System.out.println("El número es mayor, menor o igual?");
            respuesta = teclado.nextLine();

            if (respuesta.equals("mayor")) {
                min = maquina + 1;
            } else if (respuesta.equals("menor")) {
                max = maquina - 1;
            } else {
                System.out.println("Acertaste!");
            }


        } while (maquina != numero_persona);

    }
}