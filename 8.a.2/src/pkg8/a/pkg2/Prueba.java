package pkg8.a.pkg2;

public class Prueba {
    public static void main(String[] args) {
        // Crear un objeto de Empleado
        Empleado empleado1 = new Empleado("Juan Pérez", "12345678A", 30, true, 2000);
        System.out.println(empleado1);
        System.out.println("Clasificación: " + empleado1.clasifica());
        empleado1.subirSalario(10);
        System.out.println("Salario después de aumentar: " + empleado1.getSalario());

        // Crear un objeto de Programador
        Programador programador1 = new Programador("Ana García", "87654321B", 25, false, 2500, 50, "Java");
        System.out.println(programador1);
        System.out.println("Clasificación: " + programador1.clasifica());
        System.out.println("Salario calculado: " + programador1.calculaSalario());
    }
}
