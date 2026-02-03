import java.util.Scanner;

public class EIUSAVING2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        double total = 0;
        for (int i = 0; i < m; i++) {
            double n = sc.nextLong();
            int months = m - i;
            total = total + moneyMonths(n, months);
        }
        System.out.println(Math.round(total));

    }

    public static double moneyMonths(double n, int m) {
        double[] rate = { 3.9, 3.92, 3.95, 3.99, 4.04, 5.54, 5.72, 5.92, 6.14, 6.38, 6.64, 6.92 };
        double money = n;
        int years = m / 12;
        int months = m % 12;
        if (years > 0) {
            money = money * Math.pow((1 + rate[11] / 100), years);
        }
        if (months > 0) {
            money = money * (1 + rate[months - 1] * (months) / 12 / 100);
        }
        return money;
    }
}