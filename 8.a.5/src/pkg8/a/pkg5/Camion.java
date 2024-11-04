
package pkg8.a.pkg5;
class Camion extends Vehiculo {
    private double tamanoRemolque;
    private int numeroEjes;

    public Camion(double precioCompra, String marca, double tamanoRemolque, int numeroEjes) {
        super(precioCompra, marca);
        this.tamanoRemolque = tamanoRemolque;
        this.numeroEjes = numeroEjes;
    }

    @Override
    public double precioVenta() {
        return super.precioVenta() * numeroEjes; // Multiplicar por el número de ejes
    }
}