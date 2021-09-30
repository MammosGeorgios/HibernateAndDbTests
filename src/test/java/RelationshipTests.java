import common.EntityManagerProducer;
import db.entities.family.Parent;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.*;
import org.junit.runners.JUnit4;

import javax.persistence.EntityManager;
import java.time.LocalDateTime;

@RunWith(JUnit4.class)
public class RelationshipTests {

    private static EntityManager entityManager = null;


    @Before
    public void setup() {
        System.out.println("Starting Before setup");
        entityManager = EntityManagerProducer.getEntityManager(null);
    }

//    @Before
//    public void init() {
//        System.out.println("Starting Before setup");
//        if (entityManager != null) {
//            if (entityManager.getTransaction().isActive()) {
//                entityManager.getTransaction().rollback();
//            } else {
//                entityManager.getTransaction().begin();
//            }
//        }
//    }

    @AfterClass
    public static void tearDown() {
        System.out.println("Starting AfterClass setup");
        entityManager.close();
    }

    @Test
    public void entityManagerIsNotNull() {
        assert entityManager != null;
    }


    @Test(expected = Test.None.class)
    public void addSingleEntity() {
        Parent father = new Parent();

        father.setFirstName("Test");
        father.setLastName("Valid new entity");
        father.setFatherName("");
        father.setDateOfBirth(LocalDateTime.now());

        entityManager.getTransaction().begin();
        entityManager.persist(father);
        entityManager.getTransaction().commit();
    }

    @Test(expected = Exception.class)
    public void nonNullableFieldLeftEmpty_shouldThrow_Exception(){

        Parent father = new Parent();

//        father.setFirstName("Test");
        father.setLastName("Invalid new entity");
        father.setFatherName("");
        father.setDateOfBirth(LocalDateTime.now());

        entityManager.getTransaction().begin();
        entityManager.persist(father);
        entityManager.getTransaction().commit();
    }

    @Test
    public void validSpouseRelationTest(){
        String modifier = "validSpouseRelationTest";
        Parent father = new Parent();

        father.setFirstName("Father");
        father.setLastName("Valid new entity");
        father.setFatherName("J");
        father.setDateOfBirth(LocalDateTime.now());
        father.setModifiedBy(modifier);

        Parent mother = new Parent();

        mother.setFirstName("Mother");
        mother.setLastName("Valid new entity");
        mother.setFatherName("M");
        mother.setDateOfBirth(LocalDateTime.now());
        mother.setModifiedBy(modifier);


        entityManager.getTransaction().begin();
        entityManager.persist(father);
        entityManager.persist(mother);

        father.setSpouse(mother);

        entityManager.getTransaction().commit();

    }

}
