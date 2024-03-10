import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import io.restassured.RestAssured;

class CalculatorControllerTest {

	@BeforeAll
	public static void setUp() {
		RestAssured.baseURI = "http://localhost:8080";
	} 

	@Test
	public void sumControllerTest() {
		RestAssured.given()
			.queryParam("number1", 2)
			.queryParam("number2", 2)
		.when()
			.basePath("calculator/api")
			.get("sum")		
		.then()
			.statusCode(200)
			.body(is("4.0"));
	}

	@Test
	public void subtractControllerTest() {
		RestAssured.given()
			.queryParam("number1", 2)
			.queryParam("number2", 2)
		.when()
			.basePath("calculator/api")
			.get("subtract")
		.then()
			.statusCode(200)
			.body(is("0.0"));
	}
	
	@Test
	public void multiplyControllerTest() {
		RestAssured.given()
			.queryParam("number1", 2)
			.queryParam("number2", 2)
		.when()
			.basePath("calculator/api")
			.get("multiply")
		.then()
			.statusCode(200)
			.body(is("4.0"));
	}
	
	@Test
	public void divideControllerTest() {
		RestAssured.given()
			.queryParam("number1", 2)
			.queryParam("number2", 2)
		.when()
			.basePath("calculator/api")
			.get("divide")
		.then()
			.statusCode(200)
			.body(is("1.0"));
	}
}
