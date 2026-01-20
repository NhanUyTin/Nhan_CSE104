package Lab1;

import java.util.Scanner;

public class EIINCRDES {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        boolean increased = true, decreased = true;
        for (int i = 1; i < n; i++) {
            if (a[i] <= a[i - 1])
                increased = false;
            if (a[i] >= a[i - 1])
                decreased = false;

        }
        if (increased)
            System.out.println("increasing");
        else if (decreased)
            System.out.println("decreasing");
        else
            System.out.println("none");
    }
}
