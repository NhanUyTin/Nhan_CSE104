package Lab2;

import java.util.Scanner;

public class EIUCUBES2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int k = sc.nextInt();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < k; i++) {
                if (sc.hasNextLong()) {
                    long n = sc.nextLong();
                    sb.append(solve(n)).append(" ");
                }
            }
            if (sb.length() > 0) {
                System.out.println(sb.toString().trim());
            }
        }
    }

    private static long solve(long n) {
        long low = 0, high = 2000000;
        long ans = 0;
        while (low <= high) {
            long mid = low + (high - low) / 2;
            long required = mid * (mid + 1) * (mid + 2) / 6;
            if (required <= n) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }
}
