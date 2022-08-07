package testing1;


import org.testng.annotations.Test;
import org.json.simple.JSONObject;
import io.restassured.response.Response;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import static io.restassured.RestAssured.given;
import java.util.Random;

public class Test1 {
	int min = 1;
	int max = 10;
	Random random = new Random();
	int randomUser = random.nextInt(max + min) + min;
	@Test
	void Test_01()
	{
		
	    Response response = given().when().get("https://jsonplaceholder.typicode.com/users?id="+randomUser+"")
                .then().assertThat().statusCode(200).extract().response();
        String response_str = response.asString();

        JsonPath path = new JsonPath(response_str);
        String email = path.getString("email");
        System.out.println(email);
       
	
	
        
	}	 
	    @Test
	    void test_02() {
	    	 Response post_response = given().when().get("https://jsonplaceholder.typicode.com/posts?userId="+randomUser+"")
	                 .then().assertThat().statusCode(200).extract().response();
	         String responsePost = post_response.asString();

	         JsonPath postPath = new JsonPath(responsePost);
	 	    String title = postPath.getString("title");
	         System.out.println(title);
	 		JSONObject new_request = new JSONObject();
	 		new_request.put("userId",randomUser );
	 		new_request.put("id", "20");
	 		new_request.put("title", "hello");
	 		new_request.put("body", "bye");

	 		given().
	 		header("content-Type", "application/json").
	 		contentType(ContentType.JSON).
	 		accept(ContentType.JSON).
	 		
	 		body(new_request.toJSONString())
	 		.when()
	 		.post("https://jsonplaceholder.typicode.com/posts").
	 		then().statusCode(201) .log().all();
	 	
	 		System.out.println(new_request.toJSONString());

	    }
	}
