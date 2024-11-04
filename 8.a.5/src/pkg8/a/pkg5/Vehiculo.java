
package pkg8.a.pkg5;

class Vehiculo {
    protected double precioCompra;
    protected String marca;

    public Vehiculo(double precioCompra, String marca) {
        this.precioCompra = precioCompra;
        this.marca = marca;
    }

    public double precioVenta() {
        return precioCompra * 1.6; 
    }
}