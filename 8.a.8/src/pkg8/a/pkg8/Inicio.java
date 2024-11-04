
package pkg8.a.pkg8;

public class Inicio {
    public static void main(String[] args) {
        Math2 math2 = new Math2();

        // Prueba con enteros
        int[] intArray = {3, 5, 1, 8, 7};
        System.out.println("Mínimo (int): " + math2.min(intArray));
        System.out.println("Máximo (int): " + math2.max(intArray));

        // Prueba con dobles
        double[] doubleArray = {3.5, 5.2, 1.8, 8.0, 7.4};
        System.out.println("Mínimo (double): " + math2.min(doubleArray));
        System.out.println("Máximo (double): " + math2.max(doubleArray));
    }
}
