package Lab2;

import java.util.Scanner;

public class EIDISCOUNT2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long payments = sc.nextLong();
        long[] levels = { 0, 5000000, 20000000, 100000000, 300000000, 600000000, 900000000, Long.MAX_VALUE / 2 };
        long[] rates = { 0, 3, 5, 7, 10, 12, 15 };
        double discount = 0;
        for (int i = 1; i < rates.length; i++) {
            if (payments > levels[i]) {
                discount += (Math.min(payments, levels[i + 1]) - levels[i]) * rates[i] / 100;
            }

        }
        payments -= discount;
        System.out.println(payments);

    }

}
