/*
Realiza un programa que muestre por pantalla los 20 primeros números naturales (1, 2, 3,…, 20)
*/

public class propuesto5 {
    public static void main(String[] args) {

        for (int i = 1; i <= 20; i++) {
            System.out.print(i);
            if (i < 20) {
                System.out.print(", ");
            } else System.out.println(".");
        }

    }
}
