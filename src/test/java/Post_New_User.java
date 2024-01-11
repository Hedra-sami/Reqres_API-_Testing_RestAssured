import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;

public class Post_New_User {
    public static void main(String[] args) {
        RestAssured.baseURI = "https://reqres.in/api/users";
        RequestSpecification request = RestAssured.given();
        request.header("Content-Type","application/json");
        request.body("{\n" +
                "    \"name\": \"morpheus\",\n" +
                "    \"job\": \"leader\"\n" +
                "}");
        Response response = request.post();
        response.prettyPrint();
        int status_code = response.getStatusCode();
        Assert.assertEquals(status_code,201);
    }
}
