package Lab2;

import java.util.Scanner;

public class EIUMADIS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        long maxDiff = 0;
        long minValue = a[0];

        for (int i = 1; i < n; i++) {
            long current = a[i] - minValue;
            if (current > maxDiff) {
                maxDiff = current;
            }
            if (a[i] < minValue) {
                minValue = a[i];
            }
        }

        System.out.println(maxDiff);
    }
}