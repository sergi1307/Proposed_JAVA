import java.util.Scanner;

public class propuesto15 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        boolean nota10 = false;
        int nota;

        do {
            System.out.println("Introduce una nota: ");
            nota = teclado.nextInt(); teclado.nextLine();
            if (nota == 10) {
                nota10 = true;
            }

        } while (nota != -1);

        if (nota10) System.out.println("Si que hay algún diez.");
        else System.out.println("No hay ningún 10.");
    }
}
