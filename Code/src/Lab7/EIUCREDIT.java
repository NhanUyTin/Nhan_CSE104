package Lab7;

import java.util.Scanner;

public class EIUCREDIT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double r = sc.nextDouble();
        int t = sc.nextInt();

        long[] sum = new long[t + 1];
        for (int i = 0; i < n; i++) {
            int day = sc.nextInt();
            long amount = sc.nextLong();
            if (day < t) {
                sum[day] += amount;
            }
        }
        double currentBalance = 0;
        double laiTheoThang = 0;
        for (int day = 1; day < t; day++) {
            currentBalance += sum[day];
            if (currentBalance < 0) {
                double dailyInterest = (-currentBalance) * (r / 30.0);
                laiTheoThang += dailyInterest;
            }
            if (day % 30 == 0) {
                currentBalance -= laiTheoThang;
                laiTheoThang = 0;
            }
        }
        System.out.printf("%.2f", currentBalance);
        sc.close();
    }
}
