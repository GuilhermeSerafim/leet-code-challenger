import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite o tamanho do arr: ");
        int x = in.nextInt();
        int[] arr = new int[x];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Digite um número: ");
            arr[i] = in.nextInt();
        }
        System.out.println("O array tem números duplicado? " + containsDuplicate(arr));
        in.close();
    }

    public static boolean containsDuplicate(int[] nums) {
        // Ordenação
        Arrays.sort(nums);

        // Verificação
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }
}
