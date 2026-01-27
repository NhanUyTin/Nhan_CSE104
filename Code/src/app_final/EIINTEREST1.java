package app_final;

import java.util.Scanner;

public class EIINTEREST1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double rate = sc.nextDouble();
        double n = 0;
        for (int i = 1; i <= 12; i++) {
            double moneyIn = sc.nextDouble();
            n = (n + moneyIn) * (1 + rate);
        }
        System.out.println(Math.round(n));

    }

}
