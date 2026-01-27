package app_final;

import java.util.Scanner;

public class EIUPASSBOOK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        int n = sc.nextInt();
        int m = sc.nextInt();
        double r1 = sc.nextDouble();
        double r2 = sc.nextDouble();

        r1 = r1 / 100;
        r2 = r2 / 100;

        double tienTietKiem = (double) x * (1 + (r1 * n) / 12);
        double mucVay = 1 + (r2 * (n - m)) / 12;
        double y = tienTietKiem / mucVay;

        if (y > x) {
            System.out.println(Math.round(y));
        } else {
            System.out.println(Math.round(x));
        }

    }

}
