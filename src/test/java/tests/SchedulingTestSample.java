/*
package tests;

import base.BaseScheduling;
import io.restassured.http.ContentType;
import org.json.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class SchedulingTestSample extends BaseScheduling {

    @Test
    public void getAllUsers() {

        given()
        .header("Content-Type", "application/json")
        .header("x-api-key", "YOUR_REAL_API_KEY")
        .when()
            .get("/users?page=2")
        .then()
            .statusCode(200)
            .log().all();
    }

    @Test
    public void getSingleUser() {

        given()
        .header("Content-Type", "application/json")
        .header("x-api-key", "YOUR_REAL_API_KEY")
        .when()
            .get("/users/2")
        .then()
            .statusCode(200)
            .log().all();
    }

    @Test
    public void createUser() {

        JSONObject obj = new JSONObject();
        obj.put("name", "Vaishnavi");
        obj.put("job", "QA Engineer");

        given()
            .header("x-api-key", "YOUR_REAL_API_KEY")  // 🔥 MISSING BEFORE
            .contentType(ContentType.JSON)
            .body(obj.toString())
        .when()
            .post("/users")
        .then()
            .statusCode(201)
            .log().all();
    }

    @Test
    public void updateUser() {

        JSONObject obj = new JSONObject();
        obj.put("name", "Vaishnavi");
        obj.put("job", "Senior QA");

        given()
        .header("x-api-key", "YOUR_REAL_API_KEY")  
            .contentType(ContentType.JSON)
            .body(obj.toString())
        .when()
            .put("/users/2")
        .then()
            .statusCode(200)
            .log().all();
    }

    @Test
    public void deleteUser() {

        given()
        .header("Content-Type", "application/json")
        .header("x-api-key", "YOUR_REAL_API_KEY")
        .when()
            .delete("/users/2")
        .then()
            .statusCode(204)   // IMPORTANT
            .log().all();
    }
} */