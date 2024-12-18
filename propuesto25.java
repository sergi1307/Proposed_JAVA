public class propuesto25 {
    public static void main(String[] args) {

        int lineas;
        int asteriscos = 1;

        System.out.println("Introduce el número de veces que se imprimirá el (*): ");
        lineas = leer.leerEntero("Introduce el número de líneas: ");

        for (int i = 1; i <= lineas; i++) {
            int espacios = lineas - (asteriscos / 2);
            for (int j = 1; j <= espacios; j++){
                System.out.print(" ");
            }
            for (int x = 1; x <= asteriscos; x++) {
                System.out.print("*");
            }
            System.out.println();
            asteriscos += 2;
        }
    }
}
