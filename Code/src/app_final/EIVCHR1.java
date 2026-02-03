package app_final;

import java.util.Scanner;

public class EIVCHR1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        double discount = n * 0.3;
        if (discount > 50000)
            discount = 50000;
        n -= (long) discount;
        System.out.println(n);

    }

}
