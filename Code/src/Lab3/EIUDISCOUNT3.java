package Lab3;

import java.util.Scanner;

public class EIUDISCOUNT3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long Payments = sc.nextLong();
        long[] Levels = { 0, 5000000, 20000000, 100000000, 300000000, 600000000, 900000000, Long.MAX_VALUE / 2 };
        double[] Rates = { 0, 3, 5, 7, 10, 12, 15 };
        double Discount = 0;

        double Online = sc.nextDouble();
        double Vip = sc.nextDouble();
        double Saiya = sc.nextDouble();

        for (int i = 0; i < Rates.length; i++) {
            if (Payments > Levels[i]) {
                Discount += (Math.min(Payments, Levels[i + 1]) - Levels[i]) * Rates[i] / 100;
            }

        }
        long afterDiscount = Payments - (long) Discount;
        if (Online == 1) {
            afterDiscount *= 0.98;
        }
        if (Vip == 1) {
            afterDiscount *= 0.98;
        }
        if (Saiya == 1) {
            afterDiscount *= 0.98;
        }
        System.out.println((long) afterDiscount);

    }

}
