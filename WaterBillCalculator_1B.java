import java.util.Scanner;

public class WaterBillCalculator_1B {

    public static int calculateTotal(int morningUsage, int eveningUsage) {
        return morningUsage + eveningUsage;
    }

    public static void main(String[] args){
        System.out.println("\n=== 1b) Water Bill Calculation ===");
        
        Scanner sc5 = new Scanner(System.in);
        System.out.print("Enter water consumption in litres for billing: ");
        double consumption = sc5.nextDouble();

        int billAmount;
        if (consumption <= 500) {
            billAmount = 100;
        } else {
            billAmount = 200;
        }
        System.out.println("Water Bill: Rs." + billAmount);

    }
} 