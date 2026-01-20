package Lab1;

import java.util.Scanner;

public class EIMONE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long[] bank = { 20, 10, 5, 1 };
        for (int i = 0; i < bank.length; i++) {
            if (n >= bank[i]) {
                System.out.println(bank[i] + " " + n / bank[i]);
                n = n % bank[i];
            }
        }
    }

}
