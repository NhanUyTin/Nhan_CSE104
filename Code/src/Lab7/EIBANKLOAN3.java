package Lab7;

import java.util.Scanner;

public class EIBANKLOAN3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double noGoc = sc.nextDouble();
        double maxPay = sc.nextDouble();
        int thang = sc.nextInt();
        double rate = sc.nextDouble() / 100D / 12;
        double phiPhatTraTrc = sc.nextDouble() / 100D;
        int soThang = 1;
        double noThang = noGoc / thang;
        double temp = noThang;

        while (noGoc > 0) {
            double soDuConLai = noGoc * rate;
            double tienTraTruoc = (maxPay - soDuConLai - temp);

            if (tienTraTruoc > 0)
                tienTraTruoc /= (1 + phiPhatTraTrc);
            else
                tienTraTruoc = 0;
            noGoc = noGoc - temp - tienTraTruoc;

            if (noThang - tienTraTruoc > 0)
                temp = noThang - tienTraTruoc;
            else
                temp = 0;

            if (noGoc < 0)
                noGoc = 0;
            System.out.println(soThang + " " + Math.round(noGoc));
            soThang++;
            sc.close();
        }

    }

}
