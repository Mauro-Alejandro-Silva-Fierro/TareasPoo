
package pkg8.b.pkg4;

public class PruebaBingo {
    public static void main(String[] args) {
        int[][] carton = {
            {0, 12, 0, 0, 43, 0, 60, 73, 85},
            {5, 0, 22, 34, 0, 55, 0, 78, 0},
            {9, 0, 0, 38, 45, 0, 69, 0, 90}
        };

        try {
            JuegoDelBingo juego = new JuegoDelBingo(carton);
            System.out.println("El cartón es válido: " + JuegoDelBingo.cartonValido(carton));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

    

