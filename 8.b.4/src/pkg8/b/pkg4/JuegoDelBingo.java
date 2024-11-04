
package pkg8.b.pkg4;
import java.util.HashSet;

public class JuegoDelBingo implements ICarton {
    private int[][] carton;
    private boolean[][] tachados;

    public JuegoDelBingo(int[][] carton) {
        if (!cartonValido(carton)) {
            throw new IllegalArgumentException("Cartón no válido");
        }
        this.carton = carton;
        this.tachados = new boolean[3][9];
    }

    public static boolean cartonValido(int[][] carton) {
        if (carton.length != 3 || carton[0].length != 9) {
            return false;
        }

        HashSet<Integer> numeros = new HashSet<>();
        for (int i = 0; i < 3; i++) {
            int count = 0;
            for (int j = 0; j < 9; j++) {
                int num = carton[i][j];
                if (num < 0 || num > 90) {
                    return false;
                }
                if (num != 0) {
                    if (numeros.contains(num)) {
                        return false; // número repetido
                    }
                    numeros.add(num);
                    count++;
                }
            }
            if (count != 5) {
                return false; // debe haber 5 números
            }
        }

        for (int j = 0; j < 9; j++) {
            int lastNum = -1; // para controlar el orden creciente
            for (int i = 0; i < 3; i++) {
                int num = carton[i][j];
                if (num != 0) {
                    if (num <= lastNum) {
                        return false; // no está en orden creciente
                    }
                    lastNum = num;
                }
            }
        }
        return true;
    }

    @Override
    public boolean tacharNumero(int numero) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 9; j++) {
                if (carton[i][j] == numero) {
                    tachados[i][j] = true;
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean hayLinea() {
        for (int i = 0; i < 3; i++) {
            boolean lineaCompleta = true;
            for (int j = 0; j < 9; j++) {
                if (carton[i][j] != 0 && !tachados[i][j]) {
                    lineaCompleta = false;
                    break;
                }
            }
            if (lineaCompleta) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean hayBingo() {
        for (int j = 0; j < 9; j++) {
            boolean columnaCompleta = true;
            for (int i = 0; i < 3; i++) {
                if (carton[i][j] != 0 && !tachados[i][j]) {
                    columnaCompleta = false;
                    break;
                }
            }
            if (columnaCompleta) {
                return true;
            }
        }
        return false;
    }
}

