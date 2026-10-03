import java.util.Scanner;

public class TotalWaterConsumption_1C {
    public static int calculateTotal(int morningUsage, int eveningUsage) {
        return morningUsage + eveningUsage;
    }
public static void main(String[] args) {

        System.out.println("\n=== 1c) Total Water Consumption ===");
        
        Scanner sc6 = new Scanner(System.in);
        System.out.print("Enter morning water usage: ");
        int morningUsage = sc6.nextInt();

        Scanner sc7 = new Scanner(System.in);
        System.out.print("Enter evening water usage: ");
        int eveningUsage = sc7.nextInt();

        int totalUsage = calculateTotal(morningUsage, eveningUsage);
        System.out.println("Total Water Consumption: " + totalUsage + " litres");
    }
}