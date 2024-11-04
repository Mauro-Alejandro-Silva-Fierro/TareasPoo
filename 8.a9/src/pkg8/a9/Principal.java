
package pkg8.a9;
public class Principal {
    public static void main(String[] args) {
        Piso piso = new Piso("Calle Falsa 123", 80, 2, 5);
        Adosado adosado = new Adosado("Calle Ejemplo 456", 120, 2);
        Chalet chalet = new Chalet("Calle Sol 789", 150, 1, true);

        System.out.println("Piso:");
        System.out.println("Calle: " + piso.getCalle());
        System.out.println("Superficie: " + piso.getSuperficieEnMetros() + " m²");
        System.out.println("Precio: " + piso.getPrecio() + " €");
        System.out.println("Planta: " + piso.getPlanta());
        System.out.println("Puerta: " + piso.getPuerta());

        System.out.println("\nAdosado:");
        System.out.println("Calle: " + adosado.getCalle());
        System.out.println("Superficie: " + adosado.getSuperficieEnMetros() + " m²");
        System.out.println("Precio: " + adosado.getPrecio() + " €");
        System.out.println("Número de Plantas: " + adosado.getNumPlantas());

        System.out.println("\nChalet:");
        System.out.println("Calle: " + chalet.getCalle());
        System.out.println("Superficie: " + chalet.getSuperficieEnMetros() + " m²");
        System.out.println("Precio: " + chalet.getPrecio() + " €");
        System.out.println("Número de Parcela: " + chalet.getNumParcela());
        System.out.println("Con Piscina: " + (chalet.isConPiscina() ? "Sí" : "No"));
    }
}