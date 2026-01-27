import java.util.Scanner;

public class EITAX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long[] levels = {0, 5000000, 10000000, 18000000, 32000000, 52000000, 80000000, Long.MAX_VALUE / 2};
        double[] rates = {0.05, 0.10, 0.15, 0.20, 0.25, 0.30, 0.35};
        
        long salary = sc.nextLong();
        long taxable = salary - 9000000;
        double total = 0;

        for (int i = 0; i < rates.length && taxable > 0; i++) {
            long salaryIn = Math.min(taxable, levels[i + 1] - levels[i]);
            total += salaryIn * rates[i];
            taxable -= salaryIn;
        }
        System.out.println(Math.round(total));
    }
}
