//import utils.Utils;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
import org.junit.*;
import org.junit.experimental.categories.Category;
import org.junit.runners.MethodSorters;

import java.io.IOException;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
//@Category(AllApiTest.class)
public class PostTest {


    @Test
    public void postQurePosetiv()throws IOException {
        RestAssured.baseURI = "https://reqres.in";
     //   RestAssured.baseURI = utils.setURL();

        Response res = given().contentType("application/json").body("{\"email\":\"eve.holt@reqres.in\",\"password\":\"pistol\"}").when().post("/api/register");

        String body = res.getBody().asString();
        System.out.println(body);

    }

    @Test
    public void postQureNegativ(){
        RestAssured.baseURI = "https://reqres.in";

        Response res = given().contentType("application/json").body("{\"email\":\"eve.holt@reqres.in\"}").when().post("/api/register");

        String body = res.getBody().asString();
        System.out.println(body);
    }
}
