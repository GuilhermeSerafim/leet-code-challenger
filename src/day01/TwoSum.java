package day01;

import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Arr Lenght: ");
        int x = in.nextInt();
        int[] sums = new int[x];
        for (int i = 0; i < sums.length; i++) {
            System.out.print("Num: ");
            sums[i] = in.nextInt();
        }
        System.out.print("Target: ");
        int target = in.nextInt();
        int[] results = twoSum(sums, target);
        if(results == null) System.out.println("Alvo não encontrado");
        else System.out.println("[" + results[0] + "," + results[1] + "]");
        in.close();
    }

    public static int[] twoSum(int[] sums, int target) {
        int start;
        for (int i = 0; i < sums.length; i++) {
            start = sums[i];
            if (start < 0) start = (start % sums.length + sums.length) % sums.length;
            else if (start >= sums.length) start = start % sums.length;
            for (int j = 1; j < sums.length; j++) {
                int index = (start + j) % sums.length;
                if(sums[index] + sums[j] == target) return new int[] {index, j};
            }
        }
        return null;
    }
}
