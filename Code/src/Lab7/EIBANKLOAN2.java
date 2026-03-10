package Lab7;

import java.util.Scanner;

public class EIBANKLOAN2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextLong();
        double y = sc.nextLong();
        double rates = sc.nextDouble();
        double monthRates = rates / 12 / 100;
        
        int months = 0;
        while (x > 0) {
            x = x * (1 + monthRates) - y;
            months++;
        }
        System.out.println(months);
        sc.close();

    }
}

