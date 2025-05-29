package RetestingthroughRestAssured;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.io.File;

import static io.restassured.RestAssured.given;

public class PurvanchalRetest {

    @Test
    public void Retest1() {

        RestAssured.baseURI="https://metaex.bpaassolutions.com/indus-eb";

        File file = new File("D:\\Indus Tower\\Invoices 500\\UP East\\UP East\\Purvanchal Vidyut Vitaran Nigam Limited\\QEB-IN-1000825-20250107-8637000_IN-1000825-0957977000-20250107334414.pdf");

        Response response = given().multiPart("file", file).header("API-Key", "a07f9a07-d992-44ee-aaaa-04876716c423").when().post().then().statusCode(200).extract().response();

        System.out.println(response.asPrettyString());
        System.out.println("EnergyCharge Values are: "+response.jsonPath().getString("data.EnergyCharges_1"));

    }
}
