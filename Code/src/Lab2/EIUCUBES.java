package Lab2;

import java.util.Scanner;

public class EIUCUBES {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int layer = 0;
        int total = 0;
        int i = 1;
        while (total + (i * (i + 1)) / 2 <= n) {
            total += (i * (i + 1)) / 2;
            layer++;
            i++;
        }
        System.out.println(layer);
    }
}
