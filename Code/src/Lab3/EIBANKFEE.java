package Lab3;

import java.util.Scanner;

public class EIBANKFEE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double soTien = sc.nextDouble();
        double soTamSec = sc.nextDouble();
        double total = bankFee(soTien, soTamSec);
        System.out.println(total);

    }

    public static double bankFee(double soTien, double soTamSec) {
        double tienTheoThang = 0;
        double check = 0;
        double total = 0;
        if (soTien < 500) {
            tienTheoThang = 12.0;
            check = 0.2;

        } else if (soTien >= 500 && soTien < 2000) {
            tienTheoThang = 7.5;
            check = 0.2;

        } else if (soTien >= 2000 && soTien < 5000) {
            tienTheoThang = 5.0;
            check = 0.1;
        } else {
            tienTheoThang = 0;
            check = 0;
        }
        total = tienTheoThang + (soTamSec * check);
        return total;
    }

}
