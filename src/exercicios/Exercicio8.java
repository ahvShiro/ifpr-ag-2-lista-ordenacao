package exercicios;

import java.util.*;


public class Exercicio8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("tamanho do vetor: ");
        int tamanho = scanner.nextInt();

        Vetor vetorInstance = new Vetor(tamanho);

        System.out.print("aleatório (1), crescente (2) ou decrescente (3)? : ");
        int tipoVetor = scanner.nextInt();

        int[] vetor;

        switch (tipoVetor) {
            case 1:
                vetor = vetorInstance.getVetorAleatorio();
                break;
            case 2:
                vetor = vetorInstance.getVetorCrescente();
                break;
            case 3:
                vetor = vetorInstance.getVetorDecrescente();
                break;
            default:
                System.out.println("ERRO!");
                return;
        }

        int[] vetorBubble = Arrays.copyOf(vetor, tamanho);
        int[] vetorInsertion = Arrays.copyOf(vetor, tamanho);
        int[] vetorSelection = Arrays.copyOf(vetor, tamanho);
        int[] vetorMerge = Arrays.copyOf(vetor, tamanho);

        // Estrutura para armazenar os tempos de execução
        Map<String, Long> temposExecucao = new HashMap<>();

        // Bubble Sort
        long comecoBubble = System.nanoTime();
        bubbleSort(vetorBubble);
        long fimBubble = System.nanoTime();
        temposExecucao.put("Bubble Sort", calcularTempoExecucao(comecoBubble, fimBubble));

        // Insertion Sort
        long comecoInsertion = System.nanoTime();
        insertionSort(vetorInsertion);
        long fimInsertion = System.nanoTime();
        temposExecucao.put("Insertion Sort", calcularTempoExecucao(comecoInsertion, fimInsertion));

        // Selection Sort
        long comecoSelection = System.nanoTime();
        selectionSort(vetorSelection);
        long fimSelection = System.nanoTime();
        temposExecucao.put("Selection Sort", calcularTempoExecucao(comecoSelection, fimSelection));

        // Merge Sort
        long comecoMerge = System.nanoTime();
        mergeSort(vetorMerge);
        long fimMerge = System.nanoTime();
        temposExecucao.put("Merge Sort", calcularTempoExecucao(comecoMerge, fimMerge));

        // Encontrar o algoritmo mais rápido e o mais lento
        String algoritmoMaisRapido = "";
        String algoritmoMaisLento = "";
        long menorTempo = Long.MAX_VALUE;
        long maiorTempo = Long.MIN_VALUE;

        for (Map.Entry<String, Long> entrada : temposExecucao.entrySet()) {
            String algoritmo = entrada.getKey();
            long tempo = entrada.getValue();
            
            if (tempo < menorTempo) {
                menorTempo = tempo;
                algoritmoMaisRapido = algoritmo;
            }
            
            if (tempo > maiorTempo) {
                maiorTempo = tempo;
                algoritmoMaisLento = algoritmo;
            }
        }

        // Exibir resultados
        System.out.println("\nResultados:");
        System.out.printf("Algoritmo mais rápido: %s (%.3f ms)%n", algoritmoMaisRapido, nanosecondToMilisecond(menorTempo));
        System.out.printf("Algoritmo mais lento: %s (%.3f ms)%n", algoritmoMaisLento, nanosecondToMilisecond(maiorTempo));
        
        System.out.println("\nTodos os tempos de execução:");

        for (Map.Entry<String, Long> entrada : temposExecucao.entrySet()) {
            System.out.printf("%s : %.3f ms %n", entrada.getKey(), nanosecondToMilisecond(entrada.getValue()));
        }

        scanner.close();
    }


    public static long calcularTempoExecucao(long start, long end) {
        return (end - start);
    }

    public static double nanosecondToMilisecond(long nanotime) {
        return nanotime / 1000000.0;
    }

    public static int[] bubbleSort(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            for (int j = 0; j < vetor.length - i - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int tmp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = tmp;
                }
            }
        }
        return vetor;
    }

    public static int[] insertionSort(int[] vetor) {
        for (int i = 1; i < vetor.length; i++) {
            int chave = vetor[i];
            int j = i - 1;
        
            while (j >= 0 && vetor[j] > chave) {
                vetor[j + 1] = vetor[j];
                j = j - 1;
            }
            vetor[j + 1] = chave;
        }
        return vetor;
    }
    public static int[] selectionSort(int[] vetor) {
        for (int i = 0; i < vetor.length - 1; i++) {
            int menorIndice = i;
            
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[j] < vetor[menorIndice]) {
                    menorIndice = j;
                }
            }
            
            // Troca os elementos
            int tmp = vetor[i];
            vetor[i] = vetor[menorIndice];
            vetor[menorIndice] = tmp;
        }
        
        return vetor;
    }

    public static int[] mergeSort(int[] vetor) {
        if (vetor.length <= 1) {
            return vetor;
        }
        
        mergeSortRecursivo(vetor, 0, vetor.length - 1);
        return vetor;
    }
    
    private static void mergeSortRecursivo(int[] vetor, int inicio, int fim) {
        if (inicio < fim) {
            int meio = inicio + (fim - inicio) / 2;
            
            // Ordena as metades esquerda e direita
            mergeSortRecursivo(vetor, inicio, meio);
            mergeSortRecursivo(vetor, meio + 1, fim);
            
            // Une as duas metades ordenadas
            mesclar(vetor, inicio, meio, fim);
        }
    }
    
    private static void mesclar(int[] vetor, int inicio, int meio, int fim) {
        int tamanhoEsquerda = meio - inicio + 1;
        int tamanhoDireita = fim - meio;
        
        int[] esquerda = new int[tamanhoEsquerda];
        int[] direita = new int[tamanhoDireita];
        
        // Copia os dados para os vetores temporários
        for (int i = 0; i < tamanhoEsquerda; i++) {
            esquerda[i] = vetor[inicio + i];
        }
        for (int j = 0; j < tamanhoDireita; j++) {
            direita[j] = vetor[meio + 1 + j];
        }
        
        // Mescla os vetores temporários
        int i = 0, j = 0;
        int k = inicio;
        
        while (i < tamanhoEsquerda && j < tamanhoDireita) {
            if (esquerda[i] <= direita[j]) {
                vetor[k] = esquerda[i];
                i++;
            } else {
                vetor[k] = direita[j];
                j++;
            }
            k++;
        }
        
        // Copia os elementos restantes da esquerda, se houver
        while (i < tamanhoEsquerda) {
            vetor[k] = esquerda[i];
            i++;
            k++;
        }
        
        // Copia os elementos restantes da direita, se houver
        while (j < tamanhoDireita) {
            vetor[k] = direita[j];
            j++;
            k++;
        }
    }
}
