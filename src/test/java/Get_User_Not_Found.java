import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;

public class Get_User_Not_Found {
    public static void main(String[] args) {
        RestAssured.baseURI = "https://reqres.in/api/users";
        RequestSpecification request = RestAssured.given();
        request.queryParam("id","200");
        Response response = request.get();
        response.prettyPrint();

        int status_code = response.getStatusCode();
        Assert.assertEquals(status_code,404);

    }
}
