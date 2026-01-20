package Lab2;

import java.util.Scanner;

public class EISNAIL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long v = sc.nextLong();
        double days = 0;
        days = Math.ceil(((double) (v - a) / (a - b) + 1));
        System.out.println((long) days);
    }

}
