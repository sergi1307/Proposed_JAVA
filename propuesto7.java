/*
Realiza un programa que muestre los números impares comprendidos entre el 1 y el 200 pero
sumando de 1 a 1
*/

public class propuesto7 {
    public static void main(String[] args) {

        for (int i = 1; i <= 200; i++) {
            if (i % 2 != 0){
                System.out.print(i);
                if (i < 199) {
                    System.out.print(", ");
                } else System.out.println(".");
            }
        }

    }
}
