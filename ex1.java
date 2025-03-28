import java.util.Random;

public class ex1 {
    final static Random gerador = new Random();
    public static void main(String args[]) {
        int[] vetor = new int[10];

        long start = System.currentTimeMillis();
        vetor = preencherVetor(vetor);
        long end = System.currentTimeMillis();

        long timeR = end - start;

        long startImprimir = System.currentTimeMillis();
        vetor = iprimirVetor(vetor);
        long endImprimir = System.currentTimeMillis();

        long timeRImprimir = endImprimir - startImprimir;

        long startMaximo = System.currentTimeMillis();
        int maior = encontrarMaximo(vetor);
        long endMaximo = System.currentTimeMillis();

        long timeRMaximo = endMaximo - startMaximo;

        System.out.println("\nmaior: " + maior);
        System.out.println("Tempo de execução gerar números: " + timeR);
        System.out.println("Tempo de execução imprimir: " + timeRImprimir);
        System.out.println("Tempo de execução maximo: " + timeRMaximo);
    }

    public static int[] preencherVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = gerador.nextInt(100);
        }

        return vetor;
    }

    public static int[] iprimirVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }

        return vetor;
    }

    public static int encontrarMaximo(int[] vetor) {
        int maior = vetor[0];

        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }

        return maior;
    }
}