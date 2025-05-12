import java.util.Arrays;

public class Exercicio1 {
//    Dada a sequência de números:
//    [3, 4, 9, 2, 5, 8, 2, 1, 7], ordene-a em ordem não decrescente segundo os
//    seguintes algoritmos, apresentando a sequência obtida após cada passo do algoritmo:

    public static void main(String[] args) {

        int[] vetor = {3, 4, 9, 2, 5, 8, 2, 1, 7};

//        bubbleSortPassos(vetor);

        System.out.println(Arrays.toString(insertionSort(vetor)));



    }

    public static void bubbleSortPassos(int[] vetor) {
        for(int i = 0; i < vetor.length - 1; i++) {
            System.out.println("# i = " + i + "#######################");

            boolean ehTrocado = false;
            System.out.println("Foi Trocado? = " + ehTrocado);


            for(int j = 0; j < vetor.length - i - 1; j++) {
                System.out.println("---- j = " + j + "--------------------");

                System.out.println("["+vetor[j]+"]" + " > " + "["+vetor[j+1]+"]" + "?");

                if (vetor[j] > vetor[j + 1]) {
                    int tmp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j+1] = tmp;
                    System.out.println("Trocado!");
                }
                System.out.println(Arrays.toString(vetor));
                ehTrocado = true;

            }

            if (ehTrocado == false) {
                System.out.println("Iteração quebrada pois ehTrocado == false");
                break;
            }
        }
    }

    public static int[] insertionSort(int[] vetor) {
        for(int i = 1; i < vetor.length; i++) {
            int chave = vetor[i];

            while (i > 0 && vetor[i - 1] > chave) {
                vetor[i] = vetor[i-1];
                i = i - 1;
            }
            vetor[i] = chave;

        }
        return vetor;
    }

    public static int[] selectionSort(int[] vetor) {
        return null;
    }
}
