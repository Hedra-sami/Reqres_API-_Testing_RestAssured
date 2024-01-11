import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;

public class Get_List_Users {
    public static void main(String[] args) {
        RestAssured.baseURI = "https://reqres.in/api/users";
        RequestSpecification request = RestAssured.given();
        request.queryParam("page","2");
        Response response = request.get();
        response.prettyPrint();

        int status_code = response.getStatusCode();
        Assert.assertEquals(status_code,200);


    }
}
