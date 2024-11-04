
package pkg8.b.pkg7;

public class B7 {
    public static void main(String[] args) {
        Numero num1 = new Numero(10);
        Numero num2 = new Numero(20);

        System.out.println("Num1 es mayor que Num2: " + num1.esMayor(num2));
        System.out.println("Num1 es menor que Num2: " + num1.esMenor(num2));
        System.out.println("Num1 es igual a Num2: " + num1.esIgual(num2));

        Numero num3 = new Numero(10);
        System.out.println("Num1 es igual a Num3: " + num1.esIgual(num3));
    }
}
