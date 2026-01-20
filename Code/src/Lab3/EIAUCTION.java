package Lab3;

import java.util.Scanner;

public class EIAUCTION {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] count = new int[7];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            count[arr[i]]++;
        }
        int winner = -1;
        for (int v = 6; v >= 1; v--) {
            if (count[v] == 1) {
                winner = v;
                break;
            }
        }
        if (winner == -1) {
            System.out.println("none");
        } else {
            for (int i = 0; i < winner; i++) {
                if (arr[i] == winner) {
                    System.out.println(i + 1);
                    break;
                }
            }
        }
    }
}
