package exercicios;

public class Exercicio4 {


    public static void main(String[] args) {
        int ordenarAte = 4;
        int[] vetor = {8, 4, 3, 7, 6, 5, 2};

        Print.imprimirVetor(vetor);

        partialSort(vetor, ordenarAte);

        Print.imprimirVetor(vetor);
    }

    public static int[] partialSort(int[] vetor, int ordenarAte) {
        int[] subvetor = new int[ordenarAte];

        for (int i = 0; i < ordenarAte; i++) {
            subvetor[i] = vetor[i];
        }
        Print.imprimirVetor(subvetor);

        bubbleSort(subvetor);

        for (int i = 0; i < ordenarAte; i++) {
            vetor[i] = subvetor[i];
        }

        return vetor;

    }

    public static int[] bubbleSort(int[] vetor) {
        int tam = vetor.length;
        boolean trocado = false;

        for (int i = 0; i < tam; i++) {

            for (int j = 0; j < tam - i - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int tmp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = tmp;
                }

                trocado = true;
            }

            if (trocado == false) {
                break;
            }

        }
        return vetor;
    }
}
