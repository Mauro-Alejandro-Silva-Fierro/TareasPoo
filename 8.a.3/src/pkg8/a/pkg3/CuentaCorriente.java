
package pkg8.a.pkg3;

class CuentaCorriente extends Cuenta {
    private double maximoRetirable;

  
    public CuentaCorriente(long numeroCuenta, Persona cliente, double maximoRetirable) {
        super(numeroCuenta, cliente);
        this.maximoRetirable = maximoRetirable;
    }

    public double getMaximoRetirable() {
        return maximoRetirable;
    }

    @Override
    public void retirar(double x) {
        if (x > 0 && x <= getSaldo() && x <= maximoRetirable) {
            super.retirar(x);
        } else {
            System.out.println("El monto a retirar debe ser menor o igual que el máximo retirable y mayor que 0.");
        }
    }

    @Override
    public String toString() {
        return "Cuenta Corriente [Número de cuenta: " + getNumeroCuenta() + ", Saldo: " + getSaldo() + ", Cliente: " + getCliente().getNombre() + "]";
    }
}
