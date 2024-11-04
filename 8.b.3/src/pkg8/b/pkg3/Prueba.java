
package pkg8.b.pkg3;

import java.util.Scanner;
import pkg8.b.pkg3.cajaRejistradora.CajaRegistradora;

public class Prueba {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CajaRegistradora caja = new CajaRegistradora("Caja Principal");

        int opcion;
        do {
            System.out.println("\nMenú:");
            System.out.println("1. Ingresar monedas");
            System.out.println("2. Listar contenido");
            System.out.println("3. Mostrar saldo");
            System.out.println("4. Extraer monedas");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese tipo de moneda (0.01, 0.05, 0.10, 0.25, 1.00, 5.00, 10.00): ");
                    double tipo = scanner.nextDouble();
                    System.out.print("Ingrese número de unidades: ");
                    int unidades = scanner.nextInt();
                    if (caja.meterMonedas(tipo, unidades)) {
                        System.out.println("Monedas ingresadas correctamente.");
                    } else {
                        System.out.println("Error al ingresar monedas. Tipo o unidades no válidas.");
                    }
                    break;

                case 2:
                    System.out.println("Contenido de la caja:");
                    for (double t : caja.getTiposDeMonedas()) {
                        System.out.println("Tipo: " + t + ", Unidades: " + caja.getUnidadesTipoMoneda(t));
                    }
                    break;

                case 3:
                    System.out.println("Saldo actual: " + caja.getSaldo());
                    break;

                case 4:
                    System.out.print("Ingrese tipo de moneda: ");
                    double tipoSalida = scanner.nextDouble();
                    System.out.print("Ingrese número de unidades a extraer: ");
                    int unidadesSalida = scanner.nextInt();
                    if (caja.sacarMonedas(tipoSalida, unidadesSalida)) {
                        System.out.println("Monedas extraídas correctamente.");
                    } else {
                        System.out.println("Error al extraer monedas. Tipo o unidades no válidas.");
                    }
                    break;

                case 5:
                    System.out.println("Saliendo del programa.");
                    break;

                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (opcion != 5);

        scanner.close();
    }
}


