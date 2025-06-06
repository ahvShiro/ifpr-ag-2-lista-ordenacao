package exercicios;

class Pessoa {
    private String nome;
    private int gravidade;
    private int tempo;

    public Pessoa(String nome, int gravidade, int tempo) {
        this.nome = nome;
        this.gravidade = gravidade;
        this.tempo = tempo;
    }

    public String getNome() {
        return nome;
    }
    public int getGravidade() {
        return gravidade;
    }
    public int getTempo() {
        return tempo;
    }
}

public class Exercicio7 {
    public static void main(String[] args) {
        Pessoa[] pacientes = {
                new Pessoa("João", 3, 5),
                new Pessoa("Maria", 3, 10),
                new Pessoa("Lucas", 5, 2)
        };

        imprimirNomes(pacientes);

        insertionSort(pacientes);

        imprimirNomes(pacientes);

    }

    public static Pessoa[] insertionSort(Pessoa[] vetor) {
        for (int i = 1; i < vetor.length; i++) {
            Pessoa atual = vetor[i];

            int j = i - 1;

            while(j >= 0 && deveTrocar(vetor[j], atual)) {
                vetor[j + 1] = vetor[j];
                j--;
            }
            vetor[j + 1] = atual;
        }
        return vetor;
    }

    public static boolean deveTrocar(Pessoa pessoa1, Pessoa pessoa2) {
        // se o caso da pessoa 1 é menos grave do que o caso da pessoa 2
        if (pessoa1.getGravidade() < pessoa2.getGravidade()) {
            //troca
            return true;

        // se a gravidade for igual checa o tempo;
        } else if (pessoa1.getGravidade() == pessoa2.getGravidade()) {

            // se a pessoa 1 tá a menos tempo do que a pessoa 2
            if (pessoa1.getTempo() < pessoa2.getTempo()) {
                // troca
                return true;
            }
        }

        // se não, não troca
        return false;
    }


    public static void imprimirNomes(Pessoa[] pessoa) {
        System.out.print("[");

        for (int i = 0; i < pessoa.length; i++) {
            System.out.print(pessoa[i].getNome());
            if(i < pessoa.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]\n");
    }
}
