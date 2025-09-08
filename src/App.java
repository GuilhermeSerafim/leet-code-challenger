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
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp;
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }

        // Verificação
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - 1; j++) {
                if (nums[j] == nums[j + 1]) {
                    return true;
                }
            }
        }
        return false;
    }
}
