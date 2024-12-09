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
