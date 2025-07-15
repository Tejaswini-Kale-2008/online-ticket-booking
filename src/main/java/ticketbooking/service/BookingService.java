package ticketbooking.service;

import java.io.FileWriter;
import java.io.IOException;

import ticketbooking.dao.TicketDAO;
import ticketbooking.entity.Ticket;

public class BookingService implements Runnable {

    private Ticket ticket;

    public BookingService(Ticket ticket) {
        this.ticket = ticket;
    }

    @Override
    public void run() {
        try {
          
            try (FileWriter writer = new FileWriter("tickets.txt", true)) {
                writer.write(ticket.toString() + "\n");
            }

           
            TicketDAO dao = new TicketDAO();
            dao.saveTicket(ticket);

            System.out.println("✅ Ticket booked for: " + ticket.getName());
        } catch (IOException e) {
            System.err.println("❌ File write error: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("❌ Booking error: " + e.getMessage());
        }
    }
}
