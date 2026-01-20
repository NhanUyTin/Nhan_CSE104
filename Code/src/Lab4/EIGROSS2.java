import java.util.Scanner;

public class EIGROSS2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long net = sc.nextLong();
        long[] levels = { 5000000, 5000000, 8000000, 14000000, 20000000, 28000000, Long.MAX_VALUE };
        int[] rates = { 5, 10, 15, 20, 25, 30, 35 };
        long tax = 0;
        long remaining = net;

        for (int i = 0; i < levels.length; i++) {
            if (remaining <= 0)
                break;

            long amount = Math.min(remaining, levels[i]);
            tax += amount * rates[i] / 100;
            remaining -= amount;
        }

        System.out.println(net + tax);
        sc.close();
    }
}