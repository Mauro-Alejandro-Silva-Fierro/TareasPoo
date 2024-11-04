
package pkg8.a9;

class Vivienda {
    private String calle;
    private double precio;
    protected int superficieEnMetros;

    public Vivienda(String calle, int superficieEnMetros) {
        this.calle = calle;
        this.superficieEnMetros = superficieEnMetros;
        this.precio = calcularPrecio();
    }

    public double calcularPrecio() {
        return superficieEnMetros * 1000;
    }

    public String getCalle() {
        return calle;
    }

    public double getPrecio() {
        return precio;
    }

    public int getSuperficieEnMetros() {
        return superficieEnMetros;
    }
}