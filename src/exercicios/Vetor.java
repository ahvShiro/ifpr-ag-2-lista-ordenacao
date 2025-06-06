package exercicios;

import java.util.Random;

class Vetor {
    private int tamanho;
    private int[] vetorAleatorio;
    private int[] vetorCrescente;
    private int[] vetorDecrescente;

    Random random = new Random();

    public Vetor(int tamanho) {
        this.tamanho = tamanho;
        this.vetorAleatorio = gerarVetorAleatorio(tamanho);
        this.vetorCrescente = gerarVetorCrescente(tamanho);
        this.vetorDecrescente = gerarVetorDecrescente(tamanho);
    }

    public int[] gerarVetorAleatorio(int tamanho) {
        int[] vetor = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = random.nextInt(tamanho);
        }
        return vetor;
    }

    public int[] gerarVetorCrescente(int tamanho) {
        int[] vetor = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            if (i == 0) {
                vetor[i] = 0;
            } else {
                vetor[i] = vetor[i - 1] + random.nextInt(i) + 1;
            }
        }
        return vetor;
    }

    public int[] gerarVetorDecrescente(int tamanho) {
        int[] vetor = new int[tamanho];

        int valor = tamanho;

        for (int i = 0; i < tamanho; i++) {
            vetor[i] = valor;
            valor -= random.nextInt(3) + 1;
        }
        return vetor;
    }

    public int[] getVetorAleatorio() {
        return vetorAleatorio;
    }

    public int[] getVetorCrescente() {
        return vetorCrescente;
    }

    public int[] getVetorDecrescente() {
        return vetorDecrescente;
    }

    public int getTamanho() {
        return tamanho;
    }

}