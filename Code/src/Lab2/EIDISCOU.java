package Lab2;

import java.util.Scanner;

public class EIDISCOU {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long payment = sc.nextLong();
        long[] levels = {0, 2000000, 10000000, 50000000, 100000000, 200000000, 500000000, Long.MAX_VALUE / 2 };
        double[] rates = { 0, 3, 5, 7, 10, 12, 15 };
        long discount = 0;
        for (int i = 0; i <= rates.length; i++) {
            if (payment > levels[i]) {
                discount += (Math.min(payment, levels[i + 1]) - levels[i]) * rates[i] / 100;
            }

        }
        payment -= discount;
        System.out.println(payment);

    }
}
