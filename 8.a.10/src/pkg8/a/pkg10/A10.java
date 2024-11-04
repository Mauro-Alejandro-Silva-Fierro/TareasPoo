
package pkg8.a.pkg10;

public class A10
{
    public static void main(String[] args) {
        AlfombraRedonda alfombraRedonda = new AlfombraRedonda("Rojo", 100, 5);
        AlfombraCuadrada alfombraCuadrada = new AlfombraCuadrada("Azul", 80, 4);

        System.out.println("Alfombra Redonda:");
        System.out.println("Color: " + alfombraRedonda.getColor());
        System.out.println("Superficie: " + alfombraRedonda.calcularSuperficie());
        System.out.println("Precio: " + alfombraRedonda.calcularPrecio());

        System.out.println("\nAlfombra Cuadrada:");
        System.out.println("Color: " + alfombraCuadrada.getColor());
        System.out.println("Superficie: " + alfombraCuadrada.calcularSuperficie());
        System.out.println("Precio: " + alfombraCuadrada.calcularPrecio());
    }
}