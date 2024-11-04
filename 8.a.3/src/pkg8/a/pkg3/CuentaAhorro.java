
package pkg8.a.pkg3;
class CuentaAhorro extends Cuenta {
    private double saldoMinimo;


    public CuentaAhorro(long numeroCuenta, Persona cliente, double saldoMinimo) {
        super(numeroCuenta, cliente);
        this.saldoMinimo = saldoMinimo;
    }

    public double getSaldoMinimo() {
        return saldoMinimo;
    }

    @Override
    public void retirar(double x) {
        if (x > 0 && (getSaldo() - x) >= saldoMinimo) {
            super.retirar(x);
        } else {
            System.out.println("No se puede retirar el monto, se sobrepasa el saldo mínimo.");
        }
    }

    @Override
    public String toString() {
        return "Cuenta Ahorro [Número de cuenta: " + getNumeroCuenta() + ", Saldo: " + getSaldo() + ", Cliente: " + getCliente().getNombre() + "]";
    }
}