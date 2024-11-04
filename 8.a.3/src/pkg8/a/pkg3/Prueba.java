package pkg8.a.pkg3;

public class Prueba {
    public static void main(String[] args) {

        Persona p1 = new Persona("Juan Pérez", "12345678A");
        Persona p2 = new Persona("María López", "87654321B");

        CuentaCorriente cc1 = new CuentaCorriente(1001, p1, 500);
        CuentaAhorro ca1 = new CuentaAhorro(2001, p2, 100);

        cc1.ingresar(1000);
        System.out.println(cc1);
        cc1.retirar(300);
        System.out.println(cc1);
        cc1.retirar(800);
        System.out.println(cc1);

        ca1.ingresar(500);
        System.out.println(ca1);
        ca1.retirar(200);
        System.out.println(ca1);
        ca1.retirar(300); 
        System.out.println(ca1);
    }
}