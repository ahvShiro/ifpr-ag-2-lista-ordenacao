package exercicios;

public class Exercicio3 {
    public static void main(String[] args) {
        String[] palavras = {"bbb", "aaa", "ccc"};

        insertionSortString(palavras);

        Print.imprimirVetorPalavras(palavras); // ["aaa", "bbb", "ccc"]
    }

    public static String[] insertionSortString(String[] vetor) {
        for (int i = 1; i < vetor.length; i++) {
            String key = vetor[i];

            int j = i - 1;

            while (j >= 0 && vetor[j].compareToIgnoreCase(key) > 0) {
                vetor[j + 1] = vetor[j];
                j--;
            }
            vetor[j + 1] = key;
        }
        return vetor;
    }
}
