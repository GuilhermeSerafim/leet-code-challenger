package day01;

public class Tests {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
        int start = 5; 

        if (start < 0) {
            start = (start % arr.length + arr.length) % arr.length; // normaliza negativos
        } else if (start >= arr.length) {
            // 12 / 10 = %2, 2 == 30
            start = start % arr.length; // normaliza maiores que o tamanho
        }

        for (int i = 1; i < arr.length; i++) {
            int index = (start + i) % arr.length;
            System.out.println("Índice " + index + " valor " + arr[index]);
        }
    }
}
