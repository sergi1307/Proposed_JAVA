public class Propuestos_II {

        public static void ejercicio19() {
            int numero;
            int multiplo = 0;

            numero = Leer.leerEntero("Introduce el número: ");

            for (int i = 1; i <= numero; i++) {
                if (i % 3 == 0) {
                    System.out.println("Múltiplo de 3: " + i);
                    multiplo++;
                }
            }

            System.out.println("Total de múltiplos: " + multiplo);
        }

        public static void ejercicio20() {
            int a;
            int b;
            int pares = 0;

            a = Leer.leerEntero("Introduce el número a: ");

            do {
                b = Leer.leerEntero("Introduce el número b: ");
            } while (b < a);

            for (int i = a; i <= b; i++) {
                System.out.print(i);
                if (i < b) {
                    System.out.print(", ");
                } else {
                    System.out.println(".");
                }
                if (i % 2 == 0) {
                    pares ++;
                }
            }

            System.out.println("Hay " + pares + " números pares.");
        }

        public static void ejercicio21() {
            int dinero;
            int b500 = 0;
            int b200 = 0;
            int b100 = 0;
            int b50 = 0;
            int b20 = 0;
            int b10 = 0;
            int b5 = 0;

            do {
                dinero = Leer.leerEntero("Introduce un número múltiplo de 5: ");
            } while (dinero % 5 != 0);

            while (dinero > 0) {
                if (dinero >= 500) {
                    b500++;
                    dinero = dinero - 500;
                } else if (dinero >= 200) {
                    b200++;
                    dinero = dinero - 200;
                } else if (dinero >= 100) {
                    b100++;
                    dinero = dinero - 100;
                } else if (dinero >= 50) {
                    b50++;
                    dinero = dinero - 50;
                } else if (dinero >= 20) {
                    b20++;
                    dinero = dinero - 20;
                } else if (dinero >= 10) {
                    b10++;
                    dinero = dinero - 10;
                } else if (dinero >= 5) {
                    b5++;
                    dinero = dinero - 5;
                }
            }

            System.out.println("Billete/s de 500: " + b500);
            System.out.println("Billete/s de 200: " + b200);
            System.out.println("Billete/s de 100: " + b100);
            System.out.println("Billete/s de 50: " + b50);
            System.out.println("Billete/s de 20: " + b20);
            System.out.println("Billete/s de 10: " + b10);
            System.out.println("Billete/s de 5: " + b5);
        }

        public static void ejercicio22() {
            int aciertos = 0;
            int fallos = 0;
            int total = 0;
            double numero;
            double numero_contador = 0;

            do {
                numero = Leer.leerDouble("Introduzca el número: ");

                if (numero > numero_contador) {
                    aciertos++;
                    total++;
                    numero_contador = numero;
                } else if (numero < numero_contador && numero != 0) {
                    fallos++;
                    total++;
                    numero_contador = numero;
                }

            } while (numero != 0);

            System.out.println("Números introducidos: " + total + "\nNúmeros acertados: " + aciertos + "\nNúmeros fallados: " + fallos);
        }

        public static void ejercicio23() {
            int numero;

            do {
                numero = Leer.leerEntero("Introduzca un número entre 1 y 20: ");
            } while (numero < 1 || numero > 20);

            for (int i = 1; i <= numero; i++) {
                for (int x = 1; x <= i; x++) {
                    System.out.print(i);
                }
                System.out.println(" ");
            }
        }

        public static void ejercicio24() {
            int max = 100;
            int min = 1;
            int range;
            int maquina;
            int numero_persona;
            String respuesta;

            numero_persona = Leer.leerEntero("Introduce un número: ");

            do {

                range = max - min + 1;
                maquina = (int)(Math.random() * range) + min;
                System.out.println(maquina);

                respuesta = Leer.leerTexto("El número es mayor, menor o igual? ");

                if (respuesta.equals("mayor")) {
                    min = maquina + 1;
                } else if (respuesta.equals("menor")) {
                    max = maquina - 1;
                } else {
                    System.out.println("Acertaste!");
                }


            } while (maquina != numero_persona);
        }

        public static void ejercicio25() {
            int lineas;
            int asteriscos = 1;

            System.out.println("Introduce el número de veces que se imprimirá el (*): ");
            lineas = Leer.leerEntero("Introduce el número de líneas: ");

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
