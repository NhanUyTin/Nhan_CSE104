package Lab7;

import java.util.Scanner;

public class EIPURCHASE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long V = sc.nextInt();
        int T = sc.nextInt();
        long N = sc.nextLong();
        long M = sc.nextLong();

        double low = 0.0;
        double high = 1.0;
        double eps = 1e-9;
        while (high - low > eps) {
            double mid = (low + high) / 2;
            double balance = V - N;
            for (int i = 1; i <= T; i++) {
                balance = balance * (1 + mid) - M;
            }
            if(balance > 0){
                high = mid;
            } else {
                low = mid;
            }

        }
        double result = (high +  low) / 2;
        System.out.println(Math.round(result * 1000000) / 1000000D);
        sc.close();

    }
}
