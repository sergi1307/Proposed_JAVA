import java.util.Scanner;

public class propuesto18 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int decision;
        int num1;
        int num2;

        do {
            System.out.println("1 - Calcular suma.");
            System.out.println("2 - Calcular resta.");
            System.out.println("3 - Calcular producto.");
            System.out.println("4 - Calcular potencia.");
            System.out.println("5 - Calcular división.");
            System.out.println("0 - Salir");

            System.out.println("Introduce el número 1: ");
            num1 = teclado.nextInt();
            teclado.nextLine();

            System.out.println("Introduce el número 2: ");
            num2 = teclado.nextInt();
            teclado.nextLine();

            decision = teclado.nextInt();
            teclado.nextLine();

            switch (decision) {
                case 1:
                    System.out.println("El resultado de la suma es: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("El resultado de la resta es: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("El resultado del producto es: " + (num1 * num2));
                    break;
                case 4:
                    System.out.println("El resultado de la potencia es: " + Math.pow(num1, num2));
                    break;
                case 5:
                    if (num2 > 0) {
                        System.out.println("El resultado de la división es: " + (num1 / num2));
                    } else System.out.println("No se puede dividir entre 0.");
                    break;

            }
        } while (decision != 0);
    }
}
