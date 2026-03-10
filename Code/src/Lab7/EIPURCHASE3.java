package Lab7;

import java.util.Scanner;

public class EIPURCHASE3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double p = sc.nextDouble();
        double m = sc.nextDouble();
        int months = sc.nextInt();
        double rate = sc.nextDouble();
        double remain = p - m;
        //cong thuc: p - m * (rate * (1+ rate)^thang) / ((1 + rate)^thang - 1)
        double x = remain * (rate * Math.pow(1 + rate, months)) / (Math.pow(1 + rate, months) - 1);
        System.out.println(Math.round(Math.floor(x)));
        sc.close();
    }

}
