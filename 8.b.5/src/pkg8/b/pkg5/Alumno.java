
package pkg8.b.pkg5;
public class Alumno implements IAlumno {
    private String nombre;
    private int[] notas;
    private int contadorNotas;

    // Constructor
    public Alumno(String nombre) {
        this.nombre = nombre;
        this.notas = new int[10]; 
        this.contadorNotas = 0;    
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public int[] getNotas() {
        int[] notasValidas = new int[contadorNotas];
        System.arraycopy(notas, 0, notasValidas, 0, contadorNotas);
        return notasValidas;
    }

    @Override
    public boolean anadeNota(int nota) {
        if (contadorNotas < 10 && nota >= 0 && nota <= 10) {
            notas[contadorNotas] = nota;
            contadorNotas++;
            return true;
        }
        return false;
    }

    @Override
    public int numNotas() {
        return contadorNotas;
    }

    @Override
    public double getNotaMedia() {
        if (contadorNotas == 0) {
            return 0.0; 
        }
        double suma = 0;
        for (int i = 0; i < contadorNotas; i++) {
            suma += notas[i];
        }
        return suma / contadorNotas;
    }

    @Override
    public int getNumeroAprobados() {
        int aprobados = 0;
        for (int i = 0; i < contadorNotas; i++) {
            if (notas[i] >= 5) { 
                aprobados++;
            }
        }
        return aprobados;
    }

    @Override
    public void borrarNotas() {
        notas = new int[10]; 
        contadorNotas = 0;   
    }
}


    

