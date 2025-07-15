package ticketbooking.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tickets")
public class TicketEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String passengerName;
    private String destination;
    private double price;

    public TicketEntity() {}

    public TicketEntity(int id,String passengerName, String destination, double price) {
        this.id=id;
        this.passengerName = passengerName;
        this.destination = destination;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public String getDestination() {
        return destination;
    }

    public double getPrice() {
        return price;
    }

    public void setPassengerName(String name) {
        this.passengerName = name;
    }

    public void setDestination(String dest) {
        this.destination = dest;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("Ticket[id=%d, name='%s', destination='%s', price=%.2f]",
                id, passengerName, destination, price);
    }
}

