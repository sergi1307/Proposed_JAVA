public class propuesto12 {
    public static void main(String[] args) {

        double multiplo;
        double suma = 0;

        for (int i = 1; i <= 5; i++) {
            multiplo = Math.pow(i, 2);
            suma = suma + multiplo;
            if (i < 5) {
                System.out.print(i+" a la 2 + ");
            } else System.out.println(i+ " a la 2.");
        }

        System.out.println("El resultado es: " + suma);

    }
}
