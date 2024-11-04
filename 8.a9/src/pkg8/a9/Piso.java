
package pkg8.a9;
class Piso extends Vivienda {
    private int planta;
    private int puerta;

    public Piso(String calle, int superficieEnMetros, int planta, int puerta) {
        super(calle, superficieEnMetros);
        this.planta = planta;
        this.puerta = puerta;
    }

    @Override
    public double calcularPrecio() {
        return super.calcularPrecio();
    }

    public int getPlanta() {
        return planta;
    }

    public int getPuerta() {
        return puerta;
    }
}
