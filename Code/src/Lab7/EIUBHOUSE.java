package Lab7;

import java.util.Scanner;

public class EIUBHOUSE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long M = sc.nextLong();
        int months = sc.nextInt();
        double rates = sc.nextDouble();

        double borrowMoney = N - M;
        double principal = borrowMoney / months;
        double remainingDebt = borrowMoney;

        for (int i = 1; i <= months; i++) {
            double interest = remainingDebt * (rates/100);
            double totalPayment = principal + interest;
            System.out.println(i + " " + Math.round(totalPayment));
            remainingDebt -= principal;
            sc.close();
        }
    }
}
