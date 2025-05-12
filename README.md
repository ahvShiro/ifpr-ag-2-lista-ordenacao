# AG II - Lista de Exercícios: Ordenação

**Nos exercícios a seguir, desenvolva implementações aplicando todos os algoritmos de ordenação estudados, comparando seus desempenhos quando pertinente.**

1. **Dada a sequência de números:**   
   \[3, 4, 9, 2, 5, 8, 2, 1, 7\], ordene-a em ordem não decrescente segundo os seguintes algoritmos, apresentando a sequência obtida após cada passo do algoritmo:  
   1. **Bubble Sort**  
   2. **Selection Sort**  
   3. **Insertion Sort**  
   4. **Merge Sort**

2. **Ordenação Decrescente**  
   Modifique o algoritmo de ordenação para ordenar um vetor de números inteiros em ordem decrescente.  
     
   **Entrada**: \[3, 0, \-2, 5, 8\]  
   **Saída**: \[8, 5, 3, 0, \-2\]  
     
3. **Ordenação de Vetor de Strings**  
   Faça um método utilizando o algoritmos de ordenação para ordenar um vetor de strings em ordem alfabética. O programa deve receber a entrada fornecida pelo usuário  
     
   **Entrada**: \["bbb", "aaa", "ccc"\]  
   **Saída**: \["aaa", "bbb", "ccc"\]  
     
4. **Ordenação Parcial**  
   Faça um método para ordenar apenas os primeiros N elementos de um vetor usando o algoritmo de ordenação. O programa deve receber a entrada fornecida pelo usuário  
     
   **Entrada**: \[8, 4, 3, 7, 6, 5, 2\] (N \= 4\)  
   **Saída**: \[3, 4, 7, 8, 6, 5, 2\]  
     
5. **Ordenação em Matrizes**  
   Implemente o algoritmo de ordenação para ordenar as linhas de uma matriz 2D.   
     
   **Entrada**: \[\[3, 2, 1\], \[6, 5, 4\], \[9, 8, 7\]\]  
   **Saída**: \[\[1, 2, 3\], \[4, 5, 6\], \[7, 8, 9\]\]  
     
   **Classificação de Notas**  
   Implemente um programa que leia as notas dos alunos e as ordene em ordem crescente usando o algoritmo de ordenação. O programa deve então exibir a lista ordenada e calcular a mediana das notas. Você deve utilizar métodos já implementados anteriormente.  
     
   **Entrada**: \[85, 70, 95, 60, 75, 80\]  
   **Saída**:  
   Notas Ordenadas: \[60, 70, 75, 80, 85, 95\]  
   Mediana: 77.5  
     
6. **Ordenação de Pontuações de Jogos**  
   Escreva um programa que leia as pontuações de jogadores em um torneio e as ordene em ordem decrescente usando o algoritmo ordenação. O programa deve exibir as pontuações ordenadas e determinar a pontuação mais alta em tempo constante. O programa deve receber a entrada fornecida pelo usuário.   
     
   **Entrada**: \[250, 300, 150, 400, 350\]  
   **Saída**:  
   Pontuações Ordenadas: \[400, 350, 300, 250, 150\]  
   Pontuação Mais Alta: 400  
     
7. **Classificação de Crises Hospitalares**  
   Uma lista de pacientes com dados de gravidade e tempo de espera deve ser ordenada de forma que os mais graves sejam atendidos primeiro. Em caso de empate, quem espera há mais tempo tem prioridade.  
   

**Entrada:**  
`[("João", gravidade=3, tempo=5), ("Maria", gravidade=3, tempo=10), ("Lucas", gravidade=5, tempo=2)]`  
**Saída:**  
`Lucas, Maria, João`

8. **Torneio**  
   Desenvolva um sistema de "torneio" entre algoritmos de ordenação.  
   Para cada vetor gerado, registre qual algoritmo realizou a ordenação mais rapidamente.  
   A geração dos vetores deverá ser implementada por meio de uma função própria, capaz de criar diferentes tipos de entrada (por exemplo: vetores ordenados, invertidos e aleatórios).  
     
9. **Comparação de Desempenho**

   Implemente um contador de tempo de execução e aplique os algoritmos de ordenação nos seguintes cenários:

* Vetores totalmente ordenados;

* Vetores totalmente invertidos;

* Vetores com elementos aleatórios;

* Vetores de tamanhos variados (por exemplo: 10.000, 50.000, 100.000, 500.000 elementos).

  Registre e compare o tempo de execução e o número de operações realizadas em cada situação. Por fim, analise e justifique os resultados obtidos, considerando as características de cada algoritmo e tipo de entrada.