package misc;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@RunWith(JUnit4.class)
public class EntityManagerTests {

    EntityManagerFactory entityManagerFactory;

    @BeforeClass
    public static void init(){
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ms-sql");
    }


    @Test
    public void successfulCreationOfEntityManager(){
        EntityManager entityManager = entityManagerFactory.createEntityManager();


    }
}
