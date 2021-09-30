package common;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Properties;

public class EntityManagerProducer {

    public static EntityManager getEntityManager(Properties entityManagerProperties) {

        try {
            EntityManagerFactory entityManagerFactory;

            if (entityManagerProperties != null) {
                entityManagerFactory = Persistence.createEntityManagerFactory("ms-sql", entityManagerProperties);
            } else {
                entityManagerFactory = Persistence.createEntityManagerFactory("ms-sql");
            }

            return entityManagerFactory.createEntityManager(entityManagerProperties);
        } catch (Exception e) {
            System.out.println("Error while trying to create entity manager");
            e.printStackTrace();
        }
        return null;
    }
}
