public class propuesto16 {
    public static void main(String[] args) {

        int impares = 0;
        int pares = 0;

        for (int i = 100; i <= 200; i++) {
            if ((i % 2) != 0) {
                impares = impares + i;
            } else {
                pares = pares + i;
            }
        }

        System.out.println("El resultado de los pares es: " + pares);
        System.out.println("El resultado de los impares es: " + impares);

    }
}
