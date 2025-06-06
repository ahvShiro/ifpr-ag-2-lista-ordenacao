package exercicios;

public class Exercicio2 {

    public static void main(String[] args) {
            int[] vetor = {3, 0, -2, 5, 8};
        Print.imprimirVetor(vetor);

        reverseSelectionSort(vetor);

        Print.imprimirVetor(vetor);
    }

    public static int[] reverseSelectionSort(int[] vetor) {
        int tamanho = vetor.length;
        for(int i = 0; i < tamanho - 1; i++) {
            int indiceDoMenorValor = i;
            int menorValor = vetor[i];

            for (int j = i + 1; j < tamanho; j++) {
                if (menorValor < vetor[j]) {
                    indiceDoMenorValor = j;
                    menorValor = vetor[j];
                }
            }

            int tmp = vetor[indiceDoMenorValor];
            vetor[indiceDoMenorValor] = vetor[i];
            vetor[i] = tmp;

        }
        return vetor;
    }
}
