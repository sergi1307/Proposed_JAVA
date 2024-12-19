import java.util.Scanner;
public class Propuestos_I {

        public static void ejercicio1() {
            Scanner teclado = new Scanner(System.in);
            int num1;
            int num2;

            System.out.println("Introduce el número uno:");
            num1 = teclado.nextInt();

            System.out.println("Introduce el número dos:");
            num2 = teclado.nextInt();

            if (num2 != 0) {
                System.out.println("El resultado de la división es: " + (num1 / num2));
            } else System.out.println("No se puede dividir entre 0.");

            System.out.println("El valor de la suma es: " + (num1 + num2));
            System.out.println("El valor de la resta es: " + (num1 - num2));
            System.out.println("El valor de la multiplicación es: " + (num1 * num2));
            System.out.println("El valor de la potencia es: " + Math.pow(num1, num2));
        }

        public static void ejercicio2() {
            int num1;
            int num2;

            num1 = Leer.leerEntero("Introduce el número 1: ");
            num2 = Leer.leerEntero("Introduce el número 2: ");

            if (num1 < num2) {
                System.out.println("El número: " + num2 + " es mayor que el numero " + num1);
            } else if (num1 == num2) {
                System.out.println("El número: " + num1 + " es mayor que el numero " + num2);
            } else System.out.println("Los dos números son iguales");
        }

        public static void ejercicio3() {
            double precio;
            float iva;
            double resultado;

            do {
                iva = Leer.leerEntero("Introduce el IVA a aplicar:" );

            } while (iva != 4 && iva != 10 && iva != 21);

            System.out.println();
            precio = Leer.leerDouble("Introduce el precio del producto: ");

            resultado = precio + (precio * (iva / 100));

            System.out.println("El precio total es: " + resultado);
        }

        public static void ejercicio4() {
            double nota;

            do {
                nota = Leer.leerDouble("Introduce la nota a examinar: ");
            } while (nota < 0 || nota > 10);

            if (nota < 5) {
                System.out.println("Insuficiente");
            } else if (nota <= 6) {
                System.out.println("Suficiente");
            } else if (nota <= 7) {
                System.out.println("Bien");
            } else if (nota <= 9) {
                System.out.println("Notable");
            } else if (nota < 10) {
                System.out.println("Excelente");
            } else System.out.println("Matrícula de honor.");
        }

        public static void ejercicio5() {
            for (int i = 1; i <= 20; i++) {
                System.out.print(i);
                if (i < 20) {
                    System.out.print(", ");
                } else System.out.println(".");
            }
        }

        public static void ejercicio6() {
            for (int i = 0; i <= 200; i+= 2){
                System.out.print(i);
                if (i < 200) {
                    System.out.print(", ");
                } else System.out.println(".");
            }
        }

        public static void ejercicio7() {
            for (int i = 1; i <= 200; i++) {
                if (i % 2 != 0){
                    System.out.print(i);
                    if (i < 199) {
                        System.out.print(", ");
                    } else System.out.println(".");
                }
            }
        }

        public static void ejercicio8() {
            int numero;
            int multiplicacion = 1;
            int suma = 0;

            do {
                numero = Leer.leerEntero("Introduzca un número: ");
            } while (numero < 0);

            for (int i = 1; i <= numero; i++) {
                System.out.print(i);
                suma += i;
                multiplicacion *= i;

                if (i < numero) {
                    System.out.print(", ");
                } else System.out.println(".");
            }

            System.out.println("El resultado de la suma es: " + suma);
            System.out.println("El resultado de la multiplicación es: " + multiplicacion);
        }

        public static void ejercicio9() {
            int numero;
            int fac = 1;

            do {
                numero = Leer.leerEntero("Introduzca un número: ");
            } while (numero < 0);

            for (int i = numero; i > 0; i--) {
                fac *= i;
                if (i == numero) {
                    System.out.print(numero + "! = " + i + " x ");
                } else if (i != 1) {
                    System.out.print(i + " x ");
                } else System.out.println(i + " = " + fac);
            }
        }

        public static void ejercicio10() {
            int numero;
            int negativos = 0;
            int positivos = 0;

            for (int i = 1; i <= 10; i++) {
                numero = Leer.leerEntero("Introduce un número: ");

                if (numero < 0) {
                    negativos++;
                } else if (numero > 0) {
                    positivos++;
                }
            }

            if (negativos > 0) {
                System.out.println("Se han encontrado "+negativos+" números negativos.");
            }

            System.out.println("Y has introducido "+positivos+" números positivos");
        }

        public static void ejercicio11() {
            int numero;
            int positivos = 0;
            int negativos = 0;

            for (int i = 1; i <= 20; i++) {
                numero = Leer.leerEntero("Introduzca el número: ");

                if (numero < 0) {
                    negativos++;
                } else if (numero > 0) {
                    positivos++;
                }
            }

            System.out.println("Números positivos: "+positivos);
            System.out.println("Números negativos: "+negativos);
        }

        public static void ejercicio12() {
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

        public static void ejercicio13() {
            int numero;
            int negativos = 0;
            int positivos = 0;

            do {
                numero = Leer.leerEntero("Introduzca un número: ");
                if (numero < 0) {
                    negativos++;
                } else if (numero > 0) {
                    positivos++;
                }

            } while (numero != 0);

            if (negativos > 0) {
                System.out.println("Se han encontrado números negativos.");
            }

            System.out.println(positivos + " números positivos.");
            System.out.println(negativos + " números negativos");
        }

        public static void ejercicio14() {
            int suma = 0;
            int producto = 1;

            for (int i = 1; i <= 10; i++) {
                suma = suma + i;
                producto = producto * i;
            }

            System.out.println("El resultado de la suma es: " + suma);
            System.out.println("El resultado del producto es: " + producto);
        }

        public static void ejercicio15() {
            boolean nota10 = false;
            int nota;

            do {
                nota = Leer.leerEntero("Introduce una nota.");
                if (nota == 10) {
                    nota10 = true;
                }

            } while (nota != -1);

            if (nota10) System.out.println("Si que hay algún diez.");
            else System.out.println("No hay ningún 10.");
        }

        public static void ejercicio16() {
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

        public static void ejercicio17() {
            int a;
            int b;
            int resultado = 1;

            a = Leer.leerEntero("Introduce el valor de a: ");
            b = Leer.leerEntero("Introduce el valor de b: ");

            for (int i = 1; i <= b; i++) {
                resultado *= a;
            }

            System.out.println(a + " elevado a " + b + " es: " + resultado);
        }

        public static void ejercicio18() {
            int decision;
            int num1;
            int num2;

            do {
                System.out.println("1 - Calcular suma.");
                System.out.println("2 - Calcular resta.");
                System.out.println("3 - Calcular producto.");
                System.out.println("4 - Calcular potencia.");
                System.out.println("5 - Calcular división.");
                System.out.println("0 - Salir");

                decision = Leer.leerEntero("Que desea hacer? ");

                num1 = Leer.leerEntero("Introduce el número 1: ");
                num2 = Leer.leerEntero("Introduce el número 2: ");

                switch (decision) {
                    case 1:
                        System.out.println("El resultado de la suma es: " + (num1 + num2));
                        break;
                    case 2:
                        System.out.println("El resultado de la resta es: " + (num1 - num2));
                        break;
                    case 3:
                        System.out.println("El resultado del producto es: " + (num1 * num2));
                        break;
                    case 4:
                        System.out.println("El resultado de la potencia es: " + Math.pow(num1, num2));
                        break;
                    case 5:
                        if (num2 > 0) {
                            System.out.println("El resultado de la división es: " + (num1 / num2));
                        } else System.out.println("No se puede dividir entre 0.");
                        break;

                }
            } while (decision != 0);
        }
}
