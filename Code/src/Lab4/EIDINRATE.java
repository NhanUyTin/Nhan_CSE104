

import java.util.Scanner;

public class EIDINRATE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            double N = sc.nextDouble();
            double L = sc.nextDouble();
            double M = sc.nextDouble();
            int years = 0;
            double rate = 1 + L / 100.0;
            double amount = N;
            while (amount < M) {
                amount *= rate;
                years++;
            }
            System.out.println(years);
        }

    }
}
