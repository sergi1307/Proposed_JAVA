import java.util.Scanner;

public class propuesto3 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        float precio;
        float iva;
        float resultado;

        do {
            System.out.println("Introduce el IVA a aplicar:");
            iva = teclado.nextInt();

        } while (iva != 4 && iva != 10 && iva != 21);

        System.out.println("Introduce el precio del producto:");
        precio = teclado.nextFloat();

        resultado = precio + (precio * (iva / 100));

        System.out.println("El precio total es: " + resultado);

    }
}
