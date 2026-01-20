package Lab1;

import java.util.Arrays;
import java.util.Scanner;

public class EIUTRIGLE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();
        System.out.println(countTriangle(arr));
    }

    public static int countTriangle(int[] arr) {
        int count = 0;
        int n = arr.length;
        Arrays.sort(arr);
        for (int k = n - 1; k >= 2; k--) {
            int i = 0;
            int j = k - 1;
            while (i < j) {
                if (arr[i] + arr[j] > arr[k]) {
                    count += (j - i);
                    j--;
                } else
                    i++;
            }
        }
        return count;
    }
}
