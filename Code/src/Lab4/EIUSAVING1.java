

import java.util.Scanner;

public class EIUSAVING1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        double[] rate = { 3.9, 3.92, 3.95, 3.99, 4.04, 5.54, 5.72, 5.92, 6.14, 6.38, 6.64, 6.92 };
        double total = n;
        int year = m / 12;
        int month = m % 12; 
        if (year > 0)
            total *= Math.pow(1 + rate[11] / 100, year);
        if (month > 0)
            total *= 1 + rate[month - 1] / 12 / 100 * month;
        System.out.println(Math.round(total));

    }

}
