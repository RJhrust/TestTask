import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
import org.junit.*;
import org.junit.runners.MethodSorters;
import org.junit.FixMethodOrder;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class GetTest {

  @Test
  public void getQurePosetiv(){
      RestAssured.baseURI = "https://reqres.in";

      Response res = given().contentType("application/json").body("").when().get("/api/users/2");

      String body = res.getBody().asString();
      System.out.println(body);

  }

  @Test
  public void getQureNegativ(){
      RestAssured.baseURI = "https://reqres.in";

      Response res = given().contentType("application/json").body("").when().get("/api/users/!");

      String body = res.getBody().asString();
      System.out.println(body);
  }
}
