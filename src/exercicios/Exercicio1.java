package exercicios;

import java.util.*;

public class Exercicio1 {
//    Dada a sequência de números:
//    [3, 4, 9, 2, 5, 8, 2, 1, 7], ordene-a em ordem não decrescente segundo os
//    seguintes algoritmos, apresentando a sequência obtida após cada passo do algoritmo:

    public static void main(String[] args) {

        int[] vetor = {3, 4, 9, 2, 5, 8, 2, 1, 7};
        Scanner scanner = new Scanner(System.in);

        System.out.println("1: bubble, 2: insertion, 3: selection, 4: merge");
        int input = scanner.nextInt();

        switch (input) {
            case 1:
                bubbleSortPassos(vetor);
                break;
            case 2:
                insertionSortPassos(vetor);
                break;
            case 3:
                selectionSortPassos(vetor);
                break;
            case 4:
                mergeSortPassos(vetor);
                break;
            default:
                System.out.println("ERRO");
                break;
        }
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

                imprimirVetor(vetor);
                ehTrocado = true;

            }

            if (ehTrocado == false) {
                System.out.println("Iteração quebrada pois ehTrocado == false");
                break;
            }
        }
    }

    public static void insertionSortPassos(int[] vetor) {
        for(int i = 1; i < vetor.length; i++) {
            System.out.println("i: " + i);
            int chave = vetor[i];

            int j = i - 1 ;
            System.out.println("j: " + j);

            System.out.println("== Chave: " + chave + " ==");

            System.out.println("vetor[i]: " + vetor[i] + " vetor[j]: " + vetor[j]);

            System.out.print("Antes: ");
            imprimirVetor(vetor);

            while (j >= 0 && vetor[j] > chave) {
                vetor[j+1] = vetor[j];
                j--;
            }
            vetor[j+1] = chave;

            System.out.print("Depois: ");
            imprimirVetor(vetor);
        }

        System.out.print("Final: ");
        imprimirVetor(vetor);

    }

    public static void selectionSortPassos(int[] vetor) {
        for(int i = 0; i <= vetor.length - 1; i++) {
            int indiceMenorValor = i;
            int menorValor = vetor[i];

            imprimirVetor(vetor);
            System.out.println("indiceMenorValor = " + i);
            System.out.println("vetor[indiceMenorValor] " + vetor[i]);

            for(int j = i + 1; j < vetor.length; j++) {
                System.out.println("[" + vetor[j] + "] < [" + menorValor + "]?");
                if (vetor[j] < menorValor) {
                    System.out.println("Menor valor até agora, indices atualizados");
                    indiceMenorValor = j;
                    menorValor = vetor[j];
                }
            }


            System.out.println("Trocando " + vetor[i] + " com " + vetor[indiceMenorValor]);
            int tmp = vetor[i];
            vetor[i] = vetor[indiceMenorValor];
            vetor[indiceMenorValor] = tmp;

        }
        imprimirVetor(vetor);
    }

    public static int[] mergeSortPassos(int[] vetor) {
        System.out.printf("Vetor inicial: ");
        imprimirVetor(vetor);

        int tam = vetor.length;

        if (tam < 2)  {
            return vetor;
        }

        int indiceDoMeio = tam / 2;
        
        int[] metadeEsquerda = new int[indiceDoMeio];
        int[] metadeDireita = new int[tam - indiceDoMeio];
        
        for (int i = 0; i < indiceDoMeio; i++) {
            metadeEsquerda[i] = vetor[i];
        }
        
        System.out.printf("Metade Esquerda: ");
        imprimirVetor(metadeEsquerda);

        for (int i = indiceDoMeio; i < tam; i++) {
            metadeDireita[i - indiceDoMeio] = vetor[i];
        }
        
        System.out.printf("Metade Direita: ");
        imprimirVetor(metadeDireita);

        System.out.println("Dividindo...");
        mergeSortPassos(metadeDireita);
        mergeSortPassos(metadeEsquerda);

        System.out.println("Unindo vetores...");
        merge(vetor, metadeEsquerda, metadeDireita);

        return vetor;
    }

    private static void merge(int[] vetor, int[] metadeEsquerda, int[] metadeDireita) {
        int tamanhoEsquerda = metadeEsquerda.length;
        int tamanhoDireita = metadeDireita.length;

        int e = 0, d = 0, i = 0;
        
        
        while (e < tamanhoEsquerda && d < tamanhoDireita) {
            System.out.println("= Comparando 2 vetores ===================");
            System.out.println("i = " + i);

            System.out.printf("Vetor original: ");
            imprimirVetor(vetor);
            
            System.out.printf("Vetor esquerda: ");
            imprimirVetor(metadeEsquerda);

            System.out.printf("Vetor direita: ");
            imprimirVetor(metadeDireita);
            
            if (metadeEsquerda[e] <= metadeDireita[d]) {
                System.out.println("[" + metadeEsquerda[e] + "] <= [" + metadeDireita[d] + "]");
                vetor[i] = metadeEsquerda[e];
                e++;
            }

            else {
                System.out.println("[" + metadeDireita[d] + "] < [" + metadeEsquerda[e] + "]");
                vetor[i] = metadeDireita[d];
                d++;
            }

            i++;
        }

        while (e < tamanhoEsquerda) {
            System.out.println("Inserindo itens que sobraram da esquerda...");

            vetor[i] = metadeEsquerda[e];
            e++;
            i++;

            System.out.printf("Vetor original: ");
            imprimirVetor(vetor);

            System.out.printf("Vetor esquerda: ");
            imprimirVetor(metadeEsquerda);
        }

        while (d < tamanhoDireita) {
            System.out.println("Inserindo itens que sobraram da direita...");

            vetor[i] = metadeDireita[d];
            d++;
            i++;

            System.out.printf("Vetor original: ");
            imprimirVetor(vetor);

            System.out.printf("Vetor direita: ");
            imprimirVetor(metadeDireita);
        }

    }

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
}
