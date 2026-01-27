package Lab3;

import java.util.Scanner;

public class EIUMARKUP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long total = 0;
        long priceNow = 200;
        while (n > 0 && priceNow > 180) {
            total += priceNow * Math.min(n, 100);
            priceNow--;
            n -= 100;
        }
        if (n > 0)
            total += n * 180;
        System.out.println(total);

    }
}
