package exercicios;

public class Exercicio6 {
    public static void main(String[] args) {
        int[] pontuacao = {250, 300, 150, 400, 350};

        calcularPontuacao(pontuacao);

    }

    public static void calcularPontuacao(int[] vetor) {
        int tamanho = vetor.length;
        boolean trocado = false;

        for (int i = 0; i < vetor.length; i++) {

            for (int j = 0; j < vetor.length - i - 1; j++) {
                if (vetor[j + 1] > vetor[j]) {
                    int tmp = vetor[j+1];
                    vetor[j+1] = vetor[j];
                    vetor[j] = tmp;
                }
                trocado = true;
            }
            if (trocado == false) {
                break;
            }
        }
        System.out.printf("Pontuações Ordenadas: ");
        Print.imprimirVetor(vetor);
        System.out.println("Pontuação mais alta: " + vetor[0]);
    }
}
