package app_final;

import java.util.Scanner;

public class EIVCHR2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long totalSum = 0;
        long maxDiscount = 0;
        for (int i = 0; i < n; i++) {
            long price = sc.nextLong();
            totalSum += price;
            double currentDiscount = price * 0.3;
            if (currentDiscount > 50000) {
                currentDiscount = 50000;
            }
            if (currentDiscount > maxDiscount) {
                maxDiscount = (long) currentDiscount;
            }
        }
        System.out.println(totalSum - maxDiscount);
    }
}