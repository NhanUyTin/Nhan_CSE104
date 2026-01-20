import java.util.Scanner;

public class EISALARY2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double totalOfficeSalary = 0;
        double totalOvertimePay = 0;

        for (int i = 0; i < n; i++) {
            double[] hours = new double[5];
            for (int j = 0; j < 5; j++) {
                hours[j] = sc.nextDouble();
            }

            double wage = sc.nextDouble();
            double weeklySalary = 0;
            double weeklyOfficePay = 0;
            double weeklyOvertimePay = 0;

            for (int j = 0; j < 5; j++) {
                double regularHours = Math.min(hours[j], 8);
                double overtimeHours = Math.max(0, hours[j] - 8);
                double dailyOfficePay = regularHours * wage;
                double dailyOvertimePay = overtimeHours * wage * 1.5;

                weeklySalary += dailyOfficePay + dailyOvertimePay;
                weeklyOfficePay += dailyOfficePay;
                weeklyOvertimePay += dailyOvertimePay;
            }

            System.out.printf("%.0f%n", weeklySalary);

            totalOfficeSalary += weeklyOfficePay;
            totalOvertimePay += weeklyOvertimePay;
        }

        double avgOfficeHourSalary = totalOfficeSalary / n;
        double avgOvertimePay = totalOvertimePay / n;

        System.out.printf("%.2f%n", avgOfficeHourSalary);
        System.out.printf("%.2f%n", avgOvertimePay);

        sc.close();
    }
}