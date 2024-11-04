
package pkg8.a.pkg5;

class Coche extends Vehiculo {
    private int puertas;

    public Coche(double precioCompra, String marca, int puertas) {
        super(precioCompra, marca);
        this.puertas = puertas;
    }

    @Override
    public double precioVenta() {
        return super.precioVenta(); // El precio se calcula igual que en Vehiculo
    }
}