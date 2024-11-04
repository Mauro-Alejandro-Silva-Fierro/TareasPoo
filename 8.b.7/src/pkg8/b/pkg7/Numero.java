
package pkg8.b.pkg7;
public class Numero implements IRelaciones {
    private int valor;

    public Numero(int valor) {
        this.valor = valor;
    }

    @Override
    public boolean esMayor(Object b) {
        if (b instanceof Numero) {
            Numero otroNumero = (Numero) b;
            return this.valor > otroNumero.valor;
        }
        throw new IllegalArgumentException("El objeto no es de tipo Numero");
    }

    @Override
    public boolean esMenor(Object b) {
        if (b instanceof Numero) {
            Numero otroNumero = (Numero) b;
            return this.valor < otroNumero.valor;
        }
        throw new IllegalArgumentException("El objeto no es de tipo Numero");
    }

    @Override
    public boolean esIgual(Object b) {
        if (b instanceof Numero) {
            Numero otroNumero = (Numero) b;
            return this.valor == otroNumero.valor;
        }
        throw new IllegalArgumentException("El objeto no es de tipo Numero");
    }
}
