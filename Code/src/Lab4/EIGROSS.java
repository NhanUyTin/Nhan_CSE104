import java.util.Scanner;

public class EIGROSS {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double rate = 10 / 100D;
        for (int i = 0; i < n; i++) {
            double net = sc.nextDouble();
            double tax = (net / ((1 / rate) - 1));
            System.out.println((Math.round(tax * 100)) / 100D);
        }
        sc.close();

    }
}
