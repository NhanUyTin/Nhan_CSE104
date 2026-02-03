package app_final;
import java.util.*;

public class EIVCHR3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long[] discounts = new long [n]; 
        long totalSum = 0;
        
        for (int i = 0; i < n; i++) {
            long price = sc.nextLong();
            totalSum += price; 
            long discount = (price * 30) / 100;
            if (discount > 50000) {
                discount = 50000;
            }
            discounts[i] = discount;
        }
        Arrays.sort(discounts);
        int vouchersToUse = Math.min(n, m);
        
        long totalDiscount = 0;
        for (int i = 0; i < vouchersToUse; i++) {
            totalDiscount += discounts[i];
        }
        
        System.out.println(totalSum - totalDiscount);
    }
}


