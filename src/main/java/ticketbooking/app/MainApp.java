package ticketbooking.app;

import ticketbooking.dao.TicketDAO;
import ticketbooking.dao.JPAUtil;
import ticketbooking.entity.TicketEntity;
import java.util.*;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TicketDAO dao = new TicketDAO();
        int choice;

        do {
            System.out.println("\n=== Online Ticket Booking ===");
            System.out.println("1. Book Ticket");
            System.out.println("2. View All Tickets");
            System.out.println("3. View Ticket by ID");
            System.out.println("4. Update Ticket");
            System.out.println("5. Cancel Ticket");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Destination: ");
                    String dest = sc.nextLine();
                    System.out.print("Price: ");
                    double price = sc.nextDouble();
                    dao.addTicket(new TicketEntity(name, dest, price));
                    System.out.println("🎫 Ticket booked.");
                }
                case 2 -> dao.getAllTickets().forEach(System.out::println);
                case 3 -> {
                    System.out.print("Enter ID: ");
                    TicketEntity t = dao.getTicket(sc.nextInt());
                    System.out.println(t != null ? t : "Ticket not found.");
                }
                case 4 -> {
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt(); sc.nextLine();
                    TicketEntity t = dao.getTicket(id);
                    if (t != null) {
                        System.out.print("New Name: ");
                        t.setPassengerName(sc.nextLine());
                        System.out.print("New Destination: ");
                        t.setDestination(sc.nextLine());
                        System.out.print("New Price: ");
                        t.setPrice(sc.nextDouble());
                        dao.updateTicket(t);
                        System.out.println("Ticket updated.");
                    } else System.out.println("Ticket not found.");
                }
                case 5 -> {
                    System.out.print("Enter ID: ");
                    dao.deleteTicket(sc.nextInt());
                    System.out.println("Ticket deleted (if exists).");
                }
                case 6 -> {
                    System.out.println("Exiting...");
                    JPAUtil.shutdown();
                }
                default -> System.out.println("Invalid choice.");
            }
        } while (choice != 6);
    }
}

