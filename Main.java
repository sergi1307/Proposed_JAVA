public class Main {
    public static void main(String[] args) {

        int opc;

        do {
            System.out.println("PROPUESTOS I - 1 A 18");
            System.out.println("PROPUESTOS II - 19 A 24");
            System.out.println("PROPUESTOS III - 26 A 35");
            System.out.println("0 PARA SALIR");

            opc = Leer.leerEntero("Introduce la opción a ejecutar: ");
            switch (opc) {
                case 1:
                    Propuestos_I.ejercicio1();
                    break;
                case 2:
                    Propuestos_I.ejercicio2();
                    break;
                case 3:
                    Propuestos_I.ejercicio3();
                    break;
                case 4:
                    Propuestos_I.ejercicio4();
                    break;
                case 5:
                    Propuestos_I.ejercicio5();
                    break;
                case 6:
                    Propuestos_I.ejercicio6();
                    break;
                case 7:
                    Propuestos_I.ejercicio7();
                    break;
                case 8:
                    Propuestos_I.ejercicio8();
                    break;
                case 9:
                    Propuestos_I.ejercicio9();
                    break;
                case 10:
                    Propuestos_I.ejercicio10();
                    break;
                case 11:
                    Propuestos_I.ejercicio11();
                    break;
                case 12:
                    Propuestos_I.ejercicio12();
                    break;
                case 13:
                    Propuestos_I.ejercicio13();
                    break;
                case 14:
                    Propuestos_I.ejercicio14();
                    break;
                case 15:
                    Propuestos_I.ejercicio15();
                    break;
                case 16:
                    Propuestos_I.ejercicio16();
                    break;
                case 17:
                    Propuestos_I.ejercicio17();
                    break;
                case 18:
                    Propuestos_I.ejercicio18();
                    break;
                case 19:
                    Propuestos_II.ejercicio19();
                    break;
                case 20:
                    Propuestos_II.ejercicio20();
                    break;
                case 21:
                    Propuestos_II.ejercicio21();
                    break;
                case 22:
                    Propuestos_II.ejercicio22();
                    break;
                case 23:
                    Propuestos_II.ejercicio23();
                    break;
                case 24:
                    Propuestos_II.ejercicio24();
                    break;
                case 25:
                    Propuestos_II.ejercicio25();
                    break;
                case 26:
                    Propuestos_III.ejercicio26();
                    break;
                case 27:
                    Propuestos_III.ejercicio27();
                    break;
                case 28:
                    Propuestos_III.ejercicio28();
                    break;
                case 29:
                    Propuestos_III.ejercicio29();
                    break;
                case 30:
                    Propuestos_III.ejercicio30();
                    break;
                case 31:
                    Propuestos_III.ejercicio31();
                    break;
                case 32:
                    Propuestos_III.ejercicio32();
                    break;
                case 33:
                    Propuestos_III.ejercicio33();
                    break;
                case 34:
                    Propuestos_III.ejercicio34();
                    break;
                case 35:
                    Propuestos_III.ejercicio35();
                    break;
            }
        } while (opc != 0);

    }
}
