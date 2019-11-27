package testApi;

import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static junit.framework.Assert.assertEquals;
import static org.hamcrest.CoreMatchers.equalTo;

public class TestAPI {

    @Test
    public void canAddTwoPlusTwo() {
        int answer = 2 + 2;
        assertEquals("2+2=4", 4, answer);
    }

    @Test
    public void testWithRestAssured() {

        given().log().all().when().get("/users/gburlac")
                .then().statusCode(403);
    }

    String xmlendpoint =
            "http://compendiumdev.co.uk/apps/mocktracks/projectsxml.php";

    @Test
    public void simpleXmlRestAssuredExample() {
        RestAssured.when().get(xmlendpoint).
                then().log().all().assertThat().
                body("projects.project[0].name",
                        equalTo("A New Projectaniheeiadtatd"));
    }

    String jsonendpoint =
            "http://compendiumdev.co.uk/apps/mocktracks/projectsjson.php";

    @Test
    public void simpleJSONRestAssuredExample() {
        RestAssured.
                when().
                get(jsonendpoint).
                then().log().all().assertThat().
                body("projects.project[0].name",
                        equalTo("A New Projectaniheeiadtatd"));
    }

    String xmlBnm = "https://www.bnm.md/ro/official_exchange_rates?get_xml=1&date=26.11.2019";

    @Test
    public void xmlRestAssEx() {
        RestAssured.when().get(xmlBnm).then().log().all().assertThat().body("ValCurs.Valute[0].CharCode", equalTo("EUR"));
    }

}
