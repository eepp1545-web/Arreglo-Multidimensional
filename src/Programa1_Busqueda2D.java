public class Programa1_Busqueda2D {
    public static void main(String[] args) {
        // Declaramos una matriz 3x3
        int[][] matriz = {
            {17, 12, 01},
            {02, 03, 88},
            {24, 07, 15}
        };

        int valorBuscado = 24; // Cambia este valor para buscar
        int[] posicion = buscarValor(matriz, valorBuscado);

        if (posicion[0] != -1) {
            System.out.println("Valor " + valorBuscado + " encontrado en posición ["
                    + posicion[0] + ", " + posicion[1] + "]");
        } else {
            System.out.println("Valor " + valorBuscado + " no encontrado en la matriz.");
        }
    }

    // Método que busca un valor en la matriz
    public static int[] buscarValor(int[][] matriz, int valor) {
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int col = 0; col < matriz[fila].length; col++) {
                if (matriz[fila][col] == valor) {
                    return new int[]{fila, col};
                }
            }
        }
        return new int[]{-1, -1}; // Si no se encuentra
    }
}
