import java.util.Scanner;

public class BANKRATE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        double laiSuatThang = 0.09 / 12;
        double total = n * (1 + laiSuatThang * m);
        System.out.println(total);
        sc.close();
    }

}
