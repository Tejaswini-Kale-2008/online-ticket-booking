package ticketbooking.dao;

import ticketbooking.entity.TicketEntity;
import jakarta.persistence.*;
import java.util.List;


public class TicketDAO {
    private static final EntityManagerFactory emf=Persistence.createEntityManagerFactory("TicketBooking");
    public void addTicket(TicketEntity ticket) {
        EntityManager em = JPAUtil.getEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(ticket);
        tx.commit();
        em.close();
    }

    public TicketEntity getTicket(int id) {
        EntityManager em = JPAUtil.getEntityManager();
        TicketEntity ticket = em.find(TicketEntity.class, id);
        em.close();
        return ticket;
    }

    public List<TicketEntity> getAllTickets() {
        EntityManager em = JPAUtil.getEntityManager();
        List<TicketEntity> tickets = em.createQuery("FROM TicketEntity", TicketEntity.class).getResultList();
        em.close();
        return tickets;
    }

    public void updateTicket(TicketEntity ticket) {
        EntityManager em = JPAUtil.getEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.merge(ticket);
        tx.commit();
        em.close();
    }

    public void deleteTicket(int id) {
        EntityManager em = JPAUtil.getEntityManager();
        TicketEntity ticket = em.find(TicketEntity.class, id);
        if (ticket != null) {
            EntityTransaction tx = em.getTransaction();
            tx.begin();
            em.remove(ticket);
            tx.commit();
        }
        em.close();
    }
}
