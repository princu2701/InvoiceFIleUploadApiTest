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
        System.out.println("EnergyCharges Values are: "+response.jsonPath().getString("data.EnergyCharges_1"));

    }

    @Test
    public void Retest2() {

        RestAssured.baseURI="https://metaex.bpaassolutions.com/indus-eb";

        File file = new File("D:\\Indus Tower\\Invoices 500\\UP East\\UP East\\Purvanchal Vidyut Vitaran Nigam Limited\\QEB-IN-1000848-20250106-8621507_IN-1000848-7565563000-20250106540418.pdf");

        Response response = given().multiPart("file", file).header("API-Key", "a07f9a07-d992-44ee-aaaa-04876716c423").when().post().then().statusCode(200).extract().response();

        System.out.println(response.asPrettyString());
        System.out.println("EnergyCharges Values are: "+response.jsonPath().getString("data.EBAmountAfterDue_1"));

    }

    @Test
    public void Retest3() {

        RestAssured.baseURI="https://metaex.bpaassolutions.com/indus-eb";

        File file = new File("D:\\Indus Tower\\Invoices 500\\UP East\\UP East\\Purvanchal Vidyut Vitaran Nigam Limited\\QEB-IN-1000860-20250123-8774380_IN-1000860-7405525000-20250123114114.pdf");

        Response response = given().multiPart("file", file).header("API-Key", "a07f9a07-d992-44ee-aaaa-04876716c423").when().post().then().statusCode(200).extract().response();

        System.out.println(response.asPrettyString());
        System.out.println("EBAmountBeforeDue_1 Values are: "+response.jsonPath().getString("data.EBAmountBeforeDue_1"));
        System.out.println("EBAmountAfterDue_1 Values are: "+response.jsonPath().getString("data.EBAmountAfterDue_1"));

    }

    @Test
    public void Retest4() {

        RestAssured.baseURI="https://metaex.bpaassolutions.com/indus-eb";

        File file = new File("D:\\Indus Tower\\Invoices 500\\UP East\\UP East\\Purvanchal Vidyut Vitaran Nigam Limited\\QEB-IN-1000887-20250115-8727875_IN-1000887-3010412000-20250115155512.pdf");

        Response response = given().multiPart("file", file).header("API-Key", "a07f9a07-d992-44ee-aaaa-04876716c423").when().post().then().statusCode(200).extract().response();

        System.out.println(response.asPrettyString());
        System.out.println("EBAmountBeforeDue_1 Values are: "+response.jsonPath().getString("data.EBAmountBeforeDue_1"));
        System.out.println("EBAmountAfterDue_1 Values are: "+response.jsonPath().getString("data.EBAmountAfterDue_1"));
        System.out.println("EnergyCharges Values are: "+response.jsonPath().getString("data.EnergyCharges_1"));



    }

    @Test
    public void Retest5() {

        RestAssured.baseURI="https://metaex.bpaassolutions.com/indus-eb";

        File file = new File("D:\\Indus Tower\\Invoices 500\\UP East\\UP East\\Purvanchal Vidyut Vitaran Nigam Limited\\QEB-IN-1000897-20250108-8656966_IN-1000897-4545648629-20250108463014.pdf");

        Response response = given().multiPart("file", file).header("API-Key", "a07f9a07-d992-44ee-aaaa-04876716c423").when().post().then().statusCode(200).extract().response();

        System.out.println(response.asPrettyString());
        System.out.println("EBAmountBeforeDue_1 Values are: "+response.jsonPath().getString("data.EBAmountBeforeDue_1"));
        System.out.println("EBAmountAfterDue_1 Values are: "+response.jsonPath().getString("data.EBAmountAfterDue_1"));
        System.out.println("EnergyCharges Values are: "+response.jsonPath().getString("data.EnergyCharges_1"));



    }

}
