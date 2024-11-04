
package pkg8.a9;
class Chalet extends Vivienda {
    private int numParcela;
    private boolean conPiscina;

    public Chalet(String calle, int superficieEnMetros, int numParcela, boolean conPiscina) {
        super(calle, superficieEnMetros);
        this.numParcela = numParcela;
        this.conPiscina = conPiscina;
    }

    @Override
    public double calcularPrecio() {
        return superficieEnMetros * 1300;
    }

    public int getNumParcela() {
        return numParcela;
    }

    public boolean isConPiscina() {
        return conPiscina;
    }
}
