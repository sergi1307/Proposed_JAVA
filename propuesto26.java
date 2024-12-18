/*
Realiza un programa que pida una cadena por teclado, muestre su longitud, la convierta a
mínúsculas o mayúsculas (según la elección del usuario) e imprima cada letra en una línia
*/

public class propuesto26 {
    public static void main(String[] args) {

        String cadena = leer.leerTexto("Introduzca la cadena de texto: ");
        int longitud = cadena.length();
        int decision;
        System.out.println("La longitud de la cadena es: " + longitud);

        do {
            System.out.println("------------------------------------");
            System.out.println("1 - Pasar a mayúsculas");
            System.out.println("2 - Pasar a minúsculas");

            decision = leer.leerEntero("Que quiere hacer? ");
        } while (decision < 1 || decision > 2);


        if (decision == 1) {
            String mayusculas = cadena.toUpperCase();
            for (int i = 0; i < longitud; i++) {
                System.out.println(mayusculas.charAt(i));
            }
        } else {
            String minusculas = cadena.toLowerCase();
            for (int i = 0; i < longitud; i++) {
                System.out.println(minusculas.charAt(i));
            }
        }

    }
}
