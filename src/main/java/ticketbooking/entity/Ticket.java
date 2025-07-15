package ticketbooking.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tickets")
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String passengerName;

    @Column(nullable = false)
    private String destination;

    @Column(nullable = false)
    private double price;

    public Ticket() {}

    public Ticket(String passengerName, String destination, double price) {
        this.passengerName = passengerName;
        this.destination = destination;
        this.price = price;
    }

    public int getId() { return id; }
    public String getPassengerName() 
  {
    return passengerName;
  }
    public void setPassengerName(String passengerName) 
  {
    this.passengerName = passengerName; 
  }
    public String getDestination() {
      return destination; 
    }
    public void setDestination(String destination) {
      this.destination = destination;
    }
    public double getPrice() {
      return price; 
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
