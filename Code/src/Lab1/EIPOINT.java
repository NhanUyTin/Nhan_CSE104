package Lab1;

import java.util.Scanner;

public class EIPOINT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] grade = { 90, 85, 80, 75, 70, 65, 60, 55, 53, 52, 50, 0 };
        String[] levels = { "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "D-", "F" };
        for (int i = 0; i < levels.length; i++) {
            if (n >= grade[i]) {
                System.out.println(levels[i]);
                break;

            }
        }

    }
}
