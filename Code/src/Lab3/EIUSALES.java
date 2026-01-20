package Lab3;

import java.util.Scanner;

public class EIUSALES {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long[] levels = { 20, 50, 200, 500, 2000, Long.MAX_VALUE / 2 };
        double[] rates = { 2, 3, 4, 5, 6, 7 };
        double down = 0;
        long remaining = n;

        for (int i = 0; i < rates.length; i++) {
            if (n > levels[i]) {
                down += (Math.min(remaining, levels[i + 1]) - levels[i]);
                remaining -= n;

            }
        }

        n -= down;
        System.out.println(n);

    }

}
