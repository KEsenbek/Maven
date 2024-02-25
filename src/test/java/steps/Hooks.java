package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;

public class Hooks {

    @Before
    public void setUp(){
        System.out.println("Setting up Cucumber before hooks");
    }
    @Before(order = 1)
    public void setUpDatabase() {

        System.out.println("Setting up database before hooks");
    }

    @Before(order = 2, value = "@ui")
    public void setUpWebdriver() {

        System.out.println("Setting up webdriver before hooks");
    }

    @After
    public void cleanUp(){
        System.out.println("Clean Up in Cucumber");
    }

    @BeforeAll
    public static void globalSetup(){
        System.out.println("It should only run once before the entire suite");
    }
}
