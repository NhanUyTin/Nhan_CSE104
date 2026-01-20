package Lab1;

import java.util.Scanner;

public class EIEVERYN {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            boolean[] check = new boolean[n + 1];
            for (int i = 0; i < m; i++) {
                int temp = sc.nextInt();
                if (temp >= 1 && temp <= n)
                    check[temp] = true;
            }
            boolean flag = true;
            for (int i = 1; i <= n; i++) {
                if (!check[i]) {
                    flag = false;
                    break;
                }
            }
            if (flag)
                System.out.println("Yes");
            else
                System.out.println("No");

        }

    }

}
