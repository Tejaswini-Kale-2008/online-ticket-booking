package ticketbooking.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JPAUtil {
    private static final EntityManagerFactory emf; 
  try{
           emf = Persistence.createEntityManagerFactory("TicketBooking");
}
catch(Exception e){
  e.printStackTrace();
}
    public static EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public static void shutdown() {
         {
            emf.close();
        }
    }
}
