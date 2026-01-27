import java.util.Scanner;

/**
 * Chương trình tính toán giảm giá theo bậc (Progressive Discount).
 */
public class LLM {

  // Các hằng số tránh Magic Number
  private static final double EXTRA_DISCOUNT_RATE = 0.98;
  private static final double HUNDRED_PERCENT = 100.0;

  public static void main(String[] args) {
    // Sử dụng try-with-resources để đảm bảo Scanner luôn được đóng
    try (Scanner scanner = new Scanner(System.in)) {
      if (!scanner.hasNextLong()) {
        return;
      }

      long payments = scanner.nextLong();
      
      // Khai báo mảng hằng số cục bộ (camelCase)
      long[] levels = {
          0, 5000000, 20000000, 100000000, 300000000, 600000000, 900000000, Long.MAX_VALUE / 2
      };
      double[] rates = {0, 3, 5, 7, 10, 12, 15};
      double discount = 0;

      // Đổi sang kiểu int/boolean vì đây là các cờ lựa chọn (flags)
      int isOnline = scanner.nextInt();
      int isVip = scanner.nextInt();
      int isSaiya = scanner.nextInt();

      // Vòng lặp tính giảm giá theo từng bậc
      for (int i = 0; i < rates.length; i++) {
        if (payments > levels[i]) {
          long taxableAmount = Math.min(payments, levels[i + 1]) - levels[i];
          discount += (taxableAmount * rates[i]) / HUNDRED_PERCENT;
        }
      }

      long finalPrice = payments - (long) discount;

      // Áp dụng các điều kiện giảm giá bổ sung
      if (isOnline == 1) {
        finalPrice *= EXTRA_DISCOUNT_RATE;
      }
      if (isVip == 1) {
        finalPrice *= EXTRA_DISCOUNT_RATE;
      }
      if (isSaiya == 1) {
        finalPrice *= EXTRA_DISCOUNT_RATE;
      }

      System.out.println(finalPrice);
    }
  }
}