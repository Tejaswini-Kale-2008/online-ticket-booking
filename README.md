 online-ticket-booking
 2nd repository of online-ticket-booking using Hibernate-JPA
 🎫 Online Ticket Booking System

This is a console-based Java application for managing an online ticket booking system using **Hibernate (7.0.5.Final)** and **JPA** with a PostgreSQL.

---

 📘 Introduction

This project demonstrates how to build a simple but real-world Java application using:
- **Object-Oriented Programming (OOP)**
- **Java Persistence API (JPA)**
- **Hibernate ORM (v7.x)** for data persistence
- **PostgreSQL** as the relational database

The system allows passengers to book tickets, update or delete bookings, and retrieve all or individual 
ticket information via a menu-driven console interface.

---

🚀 Features

- ➕ Add a new ticket (passenger name, destination, price)
- 🔍 View a ticket by ID
- 📋 View all booked tickets
- ✏️ Update ticket details
- ❌ Delete a ticket by ID
- 🗂️ Data is stored in PostgreSQL using Hibernate ORM
- 🧩 Fully modular: DAO, Entity, and Main classes separated

---

 🛠 Tech Stack

| Component      | Technology                   |
|----------------|------------------------------|
| Language       | Java                         |
| Build Tool     | Maven                        |
| ORM Framework  | Hibernate ORM 7.0.5.Final    |
| JPA API        | Jakarta Persistence 3.1.0    |
| Database       | PostgreSQL                   |
| IDE (Optional) | Eclipse / IntelliJ IDEA      |

---

🧾 How to Run

1. ✅ Make sure PostgreSQL is installed and running
2. ✅ Create the database:

🗂️ Database

  CREATE TABLE tickets (
    id SERIAL PRIMARY KEY,
    passengerName VARCHAR NOT NULL,
    destination VARCHAR NOT NULL,
    price DOUBLE PRECISION NOT NULL
);

✅ Dependencies (in pom.xml)

<dependency>
    <groupId>org.hibernate.orm</groupId>
    <artifactId>hibernate-core</artifactId>
    <version>7.0.5.Final</version>
</dependency>

<dependency>
    <groupId>jakarta.persistence</groupId>
    <artifactId>jakarta.persistence-api</artifactId>
    <version>3.1.0</version>
</dependency>

<dependency>
    <groupId>org.postgresql</groupId>
    <artifactId>postgresql</artifactId>
    <version>42.7.3</version>
</dependency>

💡DEMO output





👩‍💻 Author
Name - Tejaswini Kale
📧 emil account - kaletejaswini36@gmail.com
🔗 GitHub Profile - Tejaswini-Kale-2008

