
package Lab3;

import java.util.Scanner;

public class EIUCHRMS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long total = 0;
        long[] levels = {0, 2000000, 5000000, 10000000, 20000000, 50000000, 100000000, 200000000, Long.MAX_VALUE / 2};
        double[] rates = {0.0, 0.03, 0.04, 0.05, 0.06, 0.07, 0.08, 0.09, 0.1};

        for (int i = 0; i < n; i++) {
            long bill = sc.nextLong();
            double rate = 0;
            for (int j = 0; j < levels.length; j++) {
                if (bill <= levels[j]) {
                    rate = rates[j];
                    break;
                }
            }
            total += Math.round(bill * (1 - rate));

        }
        System.out.println(total);

    }   
}
