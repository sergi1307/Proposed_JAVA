/*
Realiza un programa que muestre los números pares comprendidos entre el 1 y el 200, sumando
de 2 en 2
*/

public class propuesto6 {
    public static void main(String[] args) {

        for (int i = 0; i <= 200; i+= 2){
            System.out.print(i);
            if (i < 200) {
                System.out.print(", ");
            } else System.out.println(".");
        }

    }
}
