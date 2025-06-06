package exercicios;

public class Print {
    public static void imprimirVetor(int[] vetor) {
        int size = vetor.length;
        System.out.print("[");

        for (int i = 0; i < size; i++) {
            System.out.print(vetor[i]);
            if (i < size - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]\n");
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            imprimirVetor(matriz[i]);
        }
    }

    public static void imprimirVetorPalavras(String[] vetor) {
        int size = vetor.length;
        System.out.print("[");

        for (int i = 0; i < size; i++) {
            System.out.print(vetor[i]);
            if (i < size - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]\n");
    }
}
