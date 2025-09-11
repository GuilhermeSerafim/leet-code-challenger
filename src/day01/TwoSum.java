package day01;

import java.util.Arrays;
import java.util.Scanner;

// Não consegui sozinho esse, precisei de ajuda do GPT, segue a lógica:
// Se você tivesse que resolver isso na mão, olhando para o array [2,7,11,15] e target = 9:

// Você pegaria o primeiro número (2) e pensaria:
// "Qual número falta para dar 9?" → falta 7.

// Depois, verificaria se o array tem o número 7 → sim, tem, no índice 1.

// Então, a resposta é [0,1].
public class TwoSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite o tamanho do array: ");
        int x = in.nextInt();
        int[] sums = new int[x];
        for (int i = 0; i < sums.length; i++) {
            System.out.print("Digite o número: ");
            sums[i] = in.nextInt();
        }
        System.out.print("Digite o alvo: ");
        int target = in.nextInt();
        int[] results = twoSum(sums, target);
        System.out.println("[" + results[0] + "," + results[1] + "]");
        in.close();
    }

    public static int[] twoSum(int[] sums, int target) {
        int complemento = 0, somadorEsquerdo = 0;
        for (int i = 0; i < sums.length; i++) {
            somadorEsquerdo = sums[i];
            // Esse looping precisa começar do indice do somadorEsquerdo até ele mesmo -1 (para percorrer todas as possiveis condições de complemento)
            for (int j = 0; j < sums.length; j++) {

            }
        }
        return null;
    }
}
