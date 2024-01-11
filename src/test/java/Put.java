import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Put {
    public static void main(String[] args) {
        RestAssured.baseURI = "https://reqres.in/api/users/2";
        RequestSpecification request = RestAssured.given();

        request.contentType(ContentType.JSON);
        request.body("{\"id\": 2,\r\n"
                + "        \"employee_name\": \"Garrett Winters\",\r\n"
                + "        \"employee_salary\": 99999,\r\n"
                + "        \"employee_age\": 63,\r\n"
                + "        \"profile_image\": \"\"}");
        Response response = request.put();
        response.prettyPrint();
    }
}
