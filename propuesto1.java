/*
Realiza un programa que lea dos números, calcule y muestre el valor de su suma, resta, producto,
potencia y división. (Ten en cuenta que no se puede dividir por cero) y
*/

import java.util.Scanner;

public class propuesto1 {
    public static void main(String[]args) {

        Scanner teclado = new Scanner(System.in);
        int num1;
        int num2;

        System.out.println("Introduce el número uno:");
        num1 = teclado.nextInt();

        System.out.println("Introduce el número dos:");
        num2 = teclado.nextInt();

        if (num2 != 0) {
            System.out.println("El resultado de la división es: " + (num1 / num2));
        } else System.out.println("No se puede dividir entre 0.");

        System.out.println("El valor de la suma es: " + (num1 + num2));
        System.out.println("El valor de la resta es: " + (num1 - num2));
        System.out.println("El valor de la multiplicación es: " + (num1 * num2));
        System.out.println("El valor de la potencia es: " + Math.pow(num1, num2));
    }
}
