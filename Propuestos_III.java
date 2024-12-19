public class Propuestos_III {

    public static void ejercicio26() {
        String cadena = Leer.leerTexto("Introduzca la cadena de texto: ");
        int longitud = cadena.length();
        int decision;
        System.out.println("La longitud de la cadena es: " + longitud);

        do {
            System.out.println("------------------------------------");
            System.out.println("1 - Pasar a mayúsculas");
            System.out.println("2 - Pasar a minúsculas");

            decision = Leer.leerEntero("Que quiere hacer? ");
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

    public static void ejercicio27() {
        String palabra1 = Leer.leerTexto("Introduzca la primera palabra: ");
        String palabra2 = Leer.leerTexto("Introduzca la segunda palabra: ");

        if (palabra1.equals(palabra2)) {
            System.out.println("Las palabras son exactamente iguales.");
        } else if(palabra1.equalsIgnoreCase(palabra2)) {
            System.out.println("Las palabras son iguales.");
        } else System.out.println("Las palabras son totalmente diferentes.");
    }

    public static void ejercicio28() {
        int numeroPalabras = Leer.leerEntero("Introduzca el número de palabras: ");
        String frase = "";
        String palabra;

        for (int i = 1; i <= numeroPalabras; i++) {
            palabra = Leer.leerTexto("Introduzca la primera palabra: ");
            frase = frase.concat(palabra);
        }
        System.out.println(frase);
    }

}
