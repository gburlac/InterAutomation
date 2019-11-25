package testApi;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static junit.framework.Assert.assertEquals;

public class TestAPI {

    @Test
 public void canAddTwoPlusTwo(){
        int answer = 2+2;
         assertEquals("2+2=4", 4, answer );
         }

   @Test
   public void testWithRestAssured(){

       given().log().all().when().get("/users/gburlac")
               .then().statusCode(403);
   }


}
