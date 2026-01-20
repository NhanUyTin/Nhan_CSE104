package Lab2;

import java.util.Scanner;

public class EIUFING {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] fingers = { "cai", "tro", "giua", "ap ut", "ut" };
        String[] hands = { "trai", "phai" };
        n %= 18;
        if (n == 0)
            n = 18;
        if (n > 10)
            n = 20 - n;
        if (n > 5)
            System.out.println("Ngon " + fingers[10 - n] + " cua ban tay " + hands[1]);
        else
            System.out.println("Ngon " + fingers[n - 1] + " cua ban tay " + hands[0]);
    }

}
    