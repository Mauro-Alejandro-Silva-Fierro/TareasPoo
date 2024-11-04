
package pkg8.b.pkg5;

public class Main {
    public static void main(String[] args) {
        Alumno alumno1 = new Alumno("Juan");
        
      
        System.out.println("Añadiendo notas:");
        System.out.println(alumno1.anadeNota(8)); 
        System.out.println(alumno1.anadeNota(9)); 
        System.out.println(alumno1.anadeNota(11)); 
        System.out.println(alumno1.anadeNota(5));  
        System.out.println(alumno1.anadeNota(-1)); 
        
        // Mostrando nombre y notas
        System.out.println("Nombre: " + alumno1.getNombre());
        System.out.println("Notas: " + java.util.Arrays.toString(alumno1.getNotas()));
        
        // Número de notas y nota media
        System.out.println("Número de notas: " + alumno1.numNotas());
        System.out.println("Nota media: " + alumno1.getNotaMedia());
        
        // Número de aprobados
        System.out.println("Número de aprobados: " + alumno1.getNumeroAprobados());
        
        // Borrando notas
        alumno1.borrarNotas();
        System.out.println("Notas después de borrar: " + java.util.Arrays.toString(alumno1.getNotas()));
    }
}


