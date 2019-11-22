import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
import org.junit.*;
import org.junit.runners.MethodSorters;
import org.junit.FixMethodOrder;
import utils.Utils;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class GetTest {
    Utils utils = new Utils();

    @Before
    public void setup(){
        utils.setBaseURI();
    }

  @Test
  public void getQurePosetiv(){
      Response res = given().contentType("application/json").body("").when().get("/api/users/2");
      String body = res.getBody().asString();
      Assert.assertEquals("{" +"\"data\":{"+"\"id\":2,"+"\"email\":\"janet.weaver@reqres.in\","+"\"first_name\":\"Janet\","+"\"last_name\":\"Weaver\","+"\"avatar\":\"https://s3.amazonaws.com/uifaces/faces/twitter/josephstein/128.jpg\""+"}"+"}",body);

  }

  @Test
  public void getQureNegativ(){
      Response res = given().contentType("application/json").body("").when().get("/api/users/!");
      Assert.assertEquals(404,res.getStatusCode());

  }
}
