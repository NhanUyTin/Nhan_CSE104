package Lab2;

import java.util.Scanner;

public class EIUBIRTH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            long B = sc.nextInt();
            long R = sc.nextInt();
            long X = sc.nextInt();
            long Y = sc.nextInt();
            long Z = sc.nextInt();
            long Blue = Math.min(X, Y + Z);
            long Red = Math.min(Y, X + Z);
            long total = B * Blue + R * Red;
            System.out.println(total);
        }

    }

}
