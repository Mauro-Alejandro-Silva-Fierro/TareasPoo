
package pkg8.a.pkg5;
class Furgoneta extends Vehiculo {
    private double capacidadCarga;

    public Furgoneta(double precioCompra, String marca, double capacidadCarga) {
        super(precioCompra, marca);
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public double precioVenta() {
        double precio = super.precioVenta();
        if (capacidadCarga > 10) {
            precio *= 1.2; // Sumar 20% si la capacidad de carga es mayor a 10
        }
        return precio;
    }
}