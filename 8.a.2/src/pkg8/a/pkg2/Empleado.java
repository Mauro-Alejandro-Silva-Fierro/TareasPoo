
package pkg8.a.pkg2;

public class Empleado {
    private String nombre;
    private String dni;
    private int edad; 
    private boolean casado;
    private double salario;

    
    public Empleado(String nombre, String dni, int edad, boolean casado, double salario) {
        setEdad(edad); 
        this.nombre = nombre;
        this.dni = dni;
        this.casado = casado;
        this.salario = salario;
    }

    
    public Empleado() {
    }

    
    public void setEdad(int edad) {
        if (edad < 18 || edad > 45) {
            throw new IllegalArgumentException("La edad debe estar entre 18 y 45 años.");
        }
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public String clasifica() {
        if (edad <= 21) {
            return "Principiante";
        } else if (edad <= 35) {
            return "Intermedio";
        } else {
            return "Senior";
        }
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\n" +
               "DNI: " + dni + "\n" +
               "Edad: " + edad + "\n" +
               "Casado: " + casado + "\n" +
               "Salario: " + salario + "\n";
    }

    public void subirSalario(int porcentaje) {
        salario += salario * porcentaje / 100.0;
    }

    String getSalario() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}

