package day01;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Arr Lenght: ");
        int x = in.nextInt();
        int[] nums = new int[x];
        for (int i = 0; i < nums.length; i++) {
            System.out.print("Num: ");
            nums[i] = in.nextInt();
        }
        System.out.print("Target: ");
        int target = in.nextInt();
        int[] results = twoSum2(nums, target);
        if(results == null) System.out.println("Alvo não encontrado");
        else System.out.println("[" + results[0] + "," + results[1] + "]");
        in.close();
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) return new int[] {i, j};
            }
        }
        throw new IllegalArgumentException("Nenhuma solução encontrada");
    }

    // Complexidade O(1)
    public static int[] twoSum2(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    
    for (int i = 0; i < nums.length; i++) {
        int complemento = target - nums[i];
        
        // Verifica se o complemento já está no mapa
        if (map.containsKey(complemento)) {
            return new int[] {map.get(complemento), i};
        }
        
        // Se não, adiciona o número atual e seu índice
        map.put(nums[i], i);
    }
    
    throw new IllegalArgumentException("Nenhuma solução encontrada");
}
}
