
package pkg8.a9;
class Adosado extends Vivienda {
    private int numPlantas;

    public Adosado(String calle, int superficieEnMetros, int numPlantas) {
        super(calle, superficieEnMetros);
        this.numPlantas = numPlantas;
    }

    @Override
    public double calcularPrecio() {
        return super.calcularPrecio();
    }

    public int getNumPlantas() {
        return numPlantas;
    }
}