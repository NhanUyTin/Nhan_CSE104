 package Lab3;

import java.util.Scanner;

public class EIUDISCOUNT3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long payments = sc.nextLong();
        long[] levels = { 0, 5000000, 20000000, 100000000, 300000000, 600000000, 900000000, Long.MAX_VALUE / 2 };
        double[] rates = { 0, 3, 5, 7, 10, 12, 15 };
        double discount = 0;

        double online = sc.nextDouble();
        double vip = sc.nextDouble();
        double saiya = sc.nextDouble();

        for (int i = 0; i < rates.length; i++) {
            if (payments > levels[i]) {
                discount += (Math.min(payments, levels[i + 1]) - levels[i]) * rates[i] / 100;
            }

        }
        long afterDiscount = payments - (long) discount;
        if (online == 1) {
            afterDiscount *= 0.98;
        }
        if (vip == 1) {
            afterDiscount *= 0.98;
        }
        if (saiya == 1) {
            afterDiscount *= 0.98;
        }
        System.out.println((long) afterDiscount);

    }

}
