import common.EntityManagerProducer;
import db.entities.family.Child;
import db.entities.family.Parent;

import javax.persistence.EntityManager;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        System.out.println("Not much happening yet");

        EntityManager em = EntityManagerProducer.getEntityManager(null);

        if(em != null){
            System.out.println("Successful connection to database");

            Parent dad = new Parent();
            dad.setFirstName("John");
            dad.setLastName("Doe");
            dad.setFatherName("Mick");
            dad.setDateOfBirth(LocalDateTime.now());


            Parent mom = new Parent();
            mom.setFirstName("Jana");
            mom.setLastName("Doe");
            mom.setFatherName("Alexander");
            mom.setDateOfBirth(LocalDateTime.now());



            em.getTransaction().begin();
            em.persist(dad);
            em.persist(mom);
            em.getTransaction().commit();
        }

    }
}
