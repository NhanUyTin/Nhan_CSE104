package Lab1;

import java.util.Scanner;

public class EIUTHU {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        int dem = 0;
        for (int i = 1; i <= s2.length() && i <= s1.length(); i++) {
            if (s1.substring(s1.length() - i).equals(s2.substring(0, i))) {
                dem = i;
            }
        }
        int result = s1.length() + s2.length() - dem;
        System.out.println(result);
    }

}
