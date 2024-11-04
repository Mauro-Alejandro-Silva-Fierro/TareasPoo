
package pkg8.a.pkg3;
class Cuenta {
    private long numeroCuenta;
    private double saldo;
    private Persona cliente;

  
    public Cuenta(long numeroCuenta, Persona cliente) {
        this.numeroCuenta = numeroCuenta;
        this.cliente = cliente;
        this.saldo = 0.0;
    }

   
    public long getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public Persona getCliente() {
        return cliente;
    }   
    public void ingresar(double x) {
        if (x > 0) {
            saldo += x;
        } else {
            System.out.println("El monto a ingresar debe ser mayor que 0.");
        }
    }
    public void retirar(double x) {
        if (x > 0 && x <= saldo) {
            saldo -= x;
        } else {
            System.out.println("El monto a retirar es inválido.");
        }
    }
}