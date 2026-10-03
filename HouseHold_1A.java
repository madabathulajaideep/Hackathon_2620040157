import java.util.Scanner;

public class HouseHold_1A{

    public static int calculateTotal(int morningUsage, int eveningUsage) {
        return morningUsage + eveningUsage;
    }

    public static void main(String[] args) {

        System.out.println("=== 1a) Household Details ===");
        
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter house number: ");
        int houseNumber = sc1.nextInt();

        Scanner sc2 = new Scanner(System.in);
        System.out.print("Enter number of family members: ");
        int familyMembers = sc2.nextInt();

        Scanner sc3 = new Scanner(System.in);
        System.out.print("Enter water consumed in litres: ");
        double waterConsumed = sc3.nextDouble();

        Scanner sc4 = new Scanner(System.in);
        System.out.print("Enter water usage status (character, e.g., 'N'): ");
        char usageStatus = sc4.next().charAt(0);

        System.out.println("\n-- Household Details Output --");
        System.out.println("House Number: " + houseNumber);
        System.out.println("Family Members: " + familyMembers);
        System.out.println("Water Consumed: " + waterConsumed + " litres");
        System.out.println("Usage Status: " + usageStatus);
    }
}