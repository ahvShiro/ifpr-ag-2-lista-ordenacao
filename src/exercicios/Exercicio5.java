package exercicios;

public class Exercicio5 {
    public static void main(String[] args) {
//        algoritmo de ordenação para ordenar as linhas de uma matriz 2D.
//        Entrada: [[3, 2, 1], [6, 5, 4], [9, 8, 7]]
//        Saída: [[1, 2, 3], [4, 5, 6], [7, 8, 9]]

        int[][] matrix = {{3, 2, 1}, {6, 5, 4}, {9, 8, 7}};

        Print.imprimirMatriz(matrix);

        System.out.println("Ordenada: ");
        Print.imprimirMatriz(sortMatrix(matrix));
    }

    public static int[] insertionSort(int[] vetor) {
        int tamanho = vetor.length;
        for (int i = 1; i < tamanho; i++) {

            int chave = vetor[i];
            int j = i - 1;

            while (j >= 0 && vetor[j] > chave) {
                vetor[j + 1] = vetor[j];
                j--;
            }
            vetor[j + 1] = chave;
        }
        return vetor;
    }

    public static int[][] sortMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            insertionSort(matrix[i]);
        }
        return matrix;
    }
}
