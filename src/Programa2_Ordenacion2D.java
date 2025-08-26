import java.util.Arrays;

public class Programa2_Ordenacion2D {
    public static void main(String[] args) {
        // Declaramos una matriz 3x3 con valores de ejemplo
        int[][] matriz = {
            {17, 12, 10},
            {24, 11, 15},
            {30, 20, 10}
        };

        int filaAOrdenar = 1; // Cambia entre 0, 1 o 2 para ordenar la fila deseada

        System.out.println("Matriz original:");
        imprimirMatriz(matriz);

        ordenarFila(matriz, filaAOrdenar);

        System.out.println("\nMatriz después de ordenar la fila " + filaAOrdenar + ":");
        imprimirMatriz(matriz);
    }

    // Método para ordenar una fila específica
    public static void ordenarFila(int[][] matriz, int fila) {
        if (fila >= 0 && fila < matriz.length) {
            Arrays.sort(matriz[fila]); // Orden ascendente
        } else {
            System.out.println("Fila no válida.");
        }
    }

    // Método auxiliar para imprimir la matriz
    public static void imprimirMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int valor : fila) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }
}
