package misc;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class JUnit4Tests {

    @BeforeClass
    public static void beforeClass(){
        System.out.println("BeforeClass method loaded successfully");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("AfterClass method loaded successfully");
    }

    @Before
    public void before(){
        System.out.println("Before method loaded successfully");
    }

    @After
    public void after(){
        System.out.println("After method loaded successfully");
    }

    @Test
    public void randomTest(){
        System.out.println("Random test loaded here...");
    }



}
