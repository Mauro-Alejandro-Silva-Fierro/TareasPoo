
package pkg8.a.pkg2;

public class Programador extends Empleado {
    private int lineasDeCodigoPorHora;
    private String lenguajeDominante;

    // Constructor con parámetros
    public Programador(String nombre, String dni, int edad, boolean casado, double salario,
                       int lineasDeCodigoPorHora, String lenguajeDominante) {
        super(nombre, dni, edad, casado, salario);
        this.lineasDeCodigoPorHora = lineasDeCodigoPorHora;
        this.lenguajeDominante = lenguajeDominante;
    }

    // Constructor sin parámetros
    public Programador() {
        super();
    }

    public double calculaSalario() {
        return 10 * lineasDeCodigoPorHora; // Salario calculado
    }

    @Override
    public String toString() {
        return super.toString() + // Llama al método toString de Empleado
               "Líneas de Código por Hora: " + lineasDeCodigoPorHora + "\n" +
               "Lenguaje Dominante: " + lenguajeDominante + "\n";
    }
}
