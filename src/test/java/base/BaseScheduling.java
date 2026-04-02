package base;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;

public class BaseScheduling {
    @BeforeClass
    public void SchedulingSetup(){

        RestAssured.baseURI = "https://dummy.restapiexample.com/api/v1";

    }
}