package tests;

import base.BaseScheduling;
import io.restassured.http.ContentType;
import org.json.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.greaterThan;

public class SchedulingTest extends BaseScheduling {

    @Test (priority=0)
    public void getAllScheduling(){
    	try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        given().
                when().get("/employees")
                .then().statusCode(200)
                .body("status", equalTo("success"))
                .body("data.size()",greaterThan(0))
                .log().body();

    }
    @Test (priority=1)
    public void getSingleScheduling(){
    	try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        // String id = SchedulingJsonReader.getValue("getSingleScheduling", "id");
        given().
                when().get("/employee/1")
                .then().statusCode(200)
                .body("status", equalTo("success"))
                .body("data.id",equalTo(1))
                .log().body();
    }
    @Test (priority=2)
    public void createScheduling(){
    	try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        JSONObject schedulingObject = new  JSONObject();
        schedulingObject.put("name", "Vaishnavi");
        schedulingObject.put("salary", "800000");
        schedulingObject.put("age", "30");
        given().
                contentType(ContentType.JSON)
                .body(schedulingObject.toString())
                .when().post("/create")
                .then().statusCode(200)
                .body("status", equalTo("success"))
                .log().all();


    }
    @Test (priority=3)
    public void updateScheduling(){
    	try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        JSONObject schedulingObject = new  JSONObject();
        schedulingObject.put("name", "Vaish");
        schedulingObject.put("salary", "1000000");
        schedulingObject.put("age", "30");
        given().
                contentType(ContentType.JSON)
                .body(schedulingObject.toString())
                .when().put("/update/38")
                .then().statusCode(200)
                .body("status", equalTo("success"))
                .log().all();

    }
    @Test (priority=4)
    public void deleteScheduling(){
    	try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        given().
                when().delete("/delete/35")
                .then().statusCode(200)
                .body("status", equalTo("success"))
                .log().body();
    }
}