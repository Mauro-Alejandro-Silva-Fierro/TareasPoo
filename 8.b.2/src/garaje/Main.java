
package garaje;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Garaje garaje = new Garaje();

        while (true) {
            System.out.println("1.- Alquilar un espacio");
            System.out.println("2.- Retirar vehículo");
            System.out.println("3.- Consulta de ingresos mensuales");
            System.out.println("4.- Consulta proporción autos / motos");
            System.out.println("5.- Listado de matrículas y cuota mensual y tipo vehículo");
            System.out.println("0.- Salir");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                  
                    break;
                case 2:

                    break;
                case 3:
                    System.out.println("Ingresos mensuales: " + garaje.calcularIngresos());
                    break;
                case 4:
                  
                    break;
                case 5:
                   
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
}
