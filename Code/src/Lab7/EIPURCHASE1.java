package Lab7;

import java.util.Scanner;

public class EIPURCHASE1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double V = sc.nextDouble(); // số tiền ban đâu
        int T = sc.nextInt(); // số tháng
        double N = sc.nextDouble(); // số tiền đã trả trước
        double M = sc.nextDouble(); // số tiền trả hàng tháng
        double soTienCanTra = V - N;
        double left = 0;
        double right = 1;
        while (right - left > 1e-9) {
            double mid = (left + right) / 2;
            if (purchase1(soTienCanTra, M, T, mid) > 0) {
                right = mid;
            } else {
                left = mid;
            }
        }
        System.out.printf("%.3f", right);
        sc.close();
    }

    public static double purchase1(double V, double M, int T, double r) {
        double current = V;
        for (int i = 0; i < T; i++) {
            current = current * (1 + r) - M;
        }
        return current;
        
    }
}
