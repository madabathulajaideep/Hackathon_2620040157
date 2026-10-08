import java.util.Scanner;

public class MovieTickets {
    private String movieName;
    private double ticketPrice;
    private int numberOfTickets;

    public MovieTickets(String movieName, double ticketPrice, int numberOfTickets) {
        this.movieName = movieName;
        this.ticketPrice = ticketPrice;
        this.numberOfTickets = numberOfTickets;
    }

    public double calculateTotal() {
        return ticketPrice * numberOfTickets;
    }

    public double calculateDiscount() {
        if (numberOfTickets >= 5) {
            return calculateTotal() * 0.10;
        }
        return 0.0;
    }

    public double calculateFinalAmount() {
        return calculateTotal() - calculateDiscount();
    }

    public void displayBill() {
        System.out.println("\n------------------------------------");
        System.out.println("        CINEMA BOOKING BILL         ");
        System.out.println("------------------------------------");
        System.out.println("Movie Name        : " + movieName);
        System.out.printf("Ticket Price      : $%.2f%n", ticketPrice);
        System.out.println("Number of Tickets : " + numberOfTickets);
        System.out.printf("Total Amount      : $%.2f%n", calculateTotal());
        System.out.printf("Discount          : $%.2f%n", calculateDiscount());
        System.out.println("------------------------------------");
        System.out.printf("Final Amount      : $%.2f%n", calculateFinalAmount());
        System.out.println("------------------------------------");
    }
}

class CinemaBookingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Movie Name: ");
        String movieName = scanner.nextLine();
        System.out.print("Enter Ticket Price: ");
        double ticketPrice = scanner.nextDouble();
        System.out.print("Enter Number of Tickets: ");
        int numberOfTickets = scanner.nextInt();
        MovieTickets ticket = new MovieTickets(movieName, ticketPrice, numberOfTickets);
        ticket.displayBill();
        scanner.close();
    }
}