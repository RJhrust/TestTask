import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
import static junit.framework.TestCase.assertEquals;
import org.junit.*;
import org.junit.runners.MethodSorters;
import utils.Utils;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PostTest {
Utils utils = new Utils();

@Before
public void setup(){
    utils.setBaseURI();
}

    @Test
    public void postQurePosetiv() {
    int sucsescod = 200;
    Response res = given().contentType("application/json").body("{\"email\":\"eve.holt@reqres.in\",\"password\":\"pistol\"}").when().post("/api/register");

        String body = res.getBody().asString();
        int recod = res.getStatusCode();
       assertEquals(sucsescod , recod);
    }

    @Test
    public void postQureNegativ(){
        Response res = given().contentType("application/json").body("{\"email\":\"eve.holt@reqres.in\"}").when().post("/api/register");

        String body = res.getBody().asString();
        Assert.assertEquals("{"+"\"error\":\"Missing password\""+"}",body);
    }
}
