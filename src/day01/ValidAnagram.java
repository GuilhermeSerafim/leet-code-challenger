package day01;

import java.util.Arrays;
import java.util.Scanner;

public class ValidAnagram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s, t;
        s = in.nextLine();
        t = in.nextLine();
        System.out.println("É um anagrama? " + isAnagram(s, t));
        in.close();
    }

    public static boolean isAnagram(String s, String t) {
        String[] x = s.split("");
        String[] y = t.split("");
        if(x.length != y.length) return false;
        Arrays.sort(x);
        Arrays.sort(y);
        for (int i = 0; i < y.length; i++) {
            if (!(x[i].equals(y[i])))
                return false;
        }
        return true;
    }
}
