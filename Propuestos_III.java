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

    public static void ejercicio29() {

        String nombre = Leer.leerTexto("Introduce tu nombre: ");
        String genero;
        int telefono = Leer.leerEntero("Introduce tu número de teléfono: ");
        String ciudad = Leer.leerTexto("Introduce el nombre de la ciudad de vacaciones: ");
        do {
            genero = Leer.leerTexto("Introduce H/M: ");
        } while (!genero.equals("H") && !genero.equals("M"));

        if (genero.equals("H")) {
            System.out.println("Hola! Soy el viajero " + nombre +". Has llamado al " + telefono + "y ahora no estoy en casa porque estoy en " + ciudad + " de vacaciones!!!");
        } else {
            System.out.println("Hola! Soy la viajera " + nombre +". Has llamado al " + telefono + " y ahora no estoy en casa porque estoy en " + ciudad + " de vacaciones!!!");
        }
    }

    public static void ejercicio30() {
            String frase = Leer.leerTexto("Introduce una frase: ");
            String vocal1 = Leer.leerTexto("Introduce la primera vocal: ");
            String vocal2 = Leer.leerTexto("Introduce la segunda vocal: ");
            int longitud;
            StringBuilder resultat = new StringBuilder();

            System.out.println(frase.replace(vocal1, vocal2));

            longitud = frase.length();

            for (int i = 0; i < longitud; i++) {
                if (Character.toString(frase.charAt(i)).equals(vocal1)) {
                    resultat.append(vocal2);
                } else {
                    resultat.append(frase.charAt(i));
                }
            }
            System.out.println(resultat);
        }

    public static void ejercicio31() {
        String palabra = Leer.leerTexto("Introduce una palabra: ");
        String frase = Leer.leerTexto("Introduce una frase: ");
        String palabraBuscar = Leer.leerTexto("Que palabra de la frase quieres cambiar: ");
        String resultado = frase.replace(palabraBuscar, palabra);

        System.out.println(resultado);
    }

    public static void ejercicio32() {
        String frase = Leer.leerTexto("Introduce una frase: ");
        String fraseReves = "";
        int longitud = frase.length();

        for ( int i = longitud - 1; i >= 0; i--) {
            fraseReves += frase.charAt(i);
        }
        System.out.println(fraseReves);

        if (frase.equals(fraseReves)) {
            System.out.println("Es capicúa.");
        } else System.out.println("No es capicúa.");
    }

    public static void ejercicio33() {
        String cadena = Leer.leerTexto("Introduce una cadena de texto: ").toLowerCase();
        boolean a = false;
        boolean e = false;
        boolean i = false;
        boolean o = false;
        boolean u = false;
        int longitud = cadena.length();

        for (int j = 0; j < longitud; j++) {
            if (cadena.charAt(j) == 'a') {
                a = true;
            } else if (cadena.charAt(j) == 'e') {
                e = true;
            } else if (cadena.charAt(j) == 'i') {
                i = true;
            } else if (cadena.charAt(j) == 'o') {
                o = true;
            } else if (cadena.charAt(j) == 'u') {
                u = true;
            }
        }

        if (a && e && i && o && u) {
            System.out.println("Todas las vocales están presentes.");
        } else System.out.println("No están todas las vocales presentes.");


    }

    public static void ejercicio34() {
        String frase = Leer.leerTexto("Introduce una frase: ");
        String fraseLimpia = frase.trim();
        System.out.println("La frase limpia: " + fraseLimpia);
        int posIni = Leer.leerEntero("Introduce la posición inicial: ");
        int posFin = Leer.leerEntero("Introduce la posición final: ");

        if (posIni < 0 || posFin > fraseLimpia.length() || posIni >= posFin) {
            System.out.println("Las posiciones no son válidas.");
        } else {
            String subcadena = fraseLimpia.substring(posIni, posFin);
            System.out.println("Subcadena: " + subcadena);
        }
    }

    public static void ejercicio35() {
        String cadena = Leer.leerTexto("Introduce la cadena de digitos: ");
        int longitud = cadena.length();
        int digito = 0;
        int noDigito = 0;
        boolean todoDigitos = false;

        for (int i = 0; i < longitud; i++) {
            char caracter = cadena.charAt(i);
            if (Character.isDigit(caracter)) {
                digito += 1;
            } else {
                noDigito += 1;
            }
        }

        if (noDigito == 0) {
            System.out.println("La cadena " + cadena + " es de digitos.");
        } else System.out.println("La cadena " + cadena + " no es de digitos.");
    }
}