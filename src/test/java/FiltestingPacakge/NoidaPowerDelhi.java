package FiltestingPacakge;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.io.File;

import static io.restassured.RestAssured.given;

public class NoidaPowerDelhi {

    @Test(enabled = false)
    public void NoidaPowerDelhiTest1() {

        RestAssured.baseURI = "https://metaex.bpaassolutions.com/indus-eb";

        File file = new File("D:\\Indus Tower\\Invoices 500\\Delhi\\Delhi\\Noida Power Company Limited\\" +
                "QEB-IN-1001878-20241230-8576463_IN-1001878-2000057674-20241230174118.pdf");

        Response response = given().multiPart("file", file).header("API-Key", "a07f9a07-d992-44ee-aaaa-04876716c423").when().post().then().statusCode(200).extract().response();

        System.out.println("Account Values are: "+response.jsonPath().getString("data.AccountNo_1"));

        System.out.println("Response Body:\n" + response.prettyPrint());

    }


    @Test(enabled = false)
    public void NoidaPowerDelhiTest2() {

        RestAssured.baseURI = "https://metaex.bpaassolutions.com/indus-eb";

        File file = new File("D:\\Indus Tower\\Invoices 500\\Delhi\\Delhi\\Noida Power Company Limited\\QEB-IN-1001991-20250104-8602471_IN-1001991-2000057672-20250104433416.pdf");

        Response response = given().multiPart("file", file).header("API-Key", "a07f9a07-d992-44ee-aaaa-04876716c423").when().post().then().statusCode(200).extract().response();

        System.out.println("Account Values are: "+response.jsonPath().getString("data.AccountNo_1"));
        System.out.println("EBAmount Values are: "+response.jsonPath().getString("data.EBAmountAfterDue_1"));


        System.out.println("Response Body:\n" + response.prettyPrint());

    }

    @Test(enabled = false)
    public void NoidaPowerDelhiTest3() {

        RestAssured.baseURI = "https://metaex.bpaassolutions.com/indus-eb";

        File file = new File("D:\\Indus Tower\\Invoices 500\\Delhi\\Delhi\\Noida Power Company Limited\\QEB-IN-1007290-20241228-8572012_IN-1007290-2000026674-20241228462517.pdf");

        Response response = given().multiPart("file", file).header("API-Key", "a07f9a07-d992-44ee-aaaa-04876716c423").when().post().then().statusCode(200).extract().response();

        System.out.println("DemandCharge Values are: "+response.jsonPath().getString("data.DemandCharges_2"));

//        System.out.println("Response Body:\n" + response.prettyPrint());

    }

    @Test(enabled = false)
    public void NoidaPowerDelhiTest4() {

        RestAssured.baseURI = "https://metaex.bpaassolutions.com/indus-eb";

        File file = new File("D:\\Indus Tower\\Invoices 500\\Delhi\\Delhi\\Noida Power Company Limited\\" +
                "QEB-IN-1007325-20241228-8572013_IN-1007325-2000057677-20241228512517.pdf");

        Response response = given().multiPart("file", file).header("API-Key", "a07f9a07-d992-44ee-aaaa-04876716c423").when().post().then().statusCode(200).extract().response();

        System.out.println("DemandCharge Values are: "+response.jsonPath().getString("data.DemandCharges_2"));

//        System.out.println("Response Body:\n" + response.prettyPrint());

    }


    @Test(enabled = false)
    public void NoidaPowerDelhiTest5() {

        RestAssured.baseURI = "https://metaex.bpaassolutions.com/indus-eb";

        File file = new File("D:\\Indus Tower\\Invoices 500\\Delhi\\Delhi\\Noida Power Company Limited\\" +
                "QEB-IN-1007330-20241228-8572014_IN-1007330-2000057676-20241228562517.pdf");

        Response response = given().multiPart("file", file).header("API-Key", "a07f9a07-d992-44ee-aaaa-04876716c423").when().post().then().statusCode(200).extract().response();

        System.out.println("DemandCharge Values are: "+response.jsonPath().getString("data.DemandCharges_2"));

        System.out.println("EBAmountAfterDue Values are: "+response.jsonPath().getString("data.EBAmountAfterDue_1"));

//        System.out.println("Response Body:\n" + response.prettyPrint());

    }

    @Test(enabled = false)
    public void NoidaPowerDelhiTest6() {

        RestAssured.baseURI = "https://metaex.bpaassolutions.com/indus-eb";

        File file = new File("D:\\Indus Tower\\Invoices 500\\Delhi\\Delhi\\Noida Power Company Limited\\" +
                "QEB-IN-1007378-20241202-8359251_IN-1007378-2000058846-20241202270712.pdf");

        Response response = given().multiPart("file", file).header("API-Key", "a07f9a07-d992-44ee-aaaa-04876716c423").when().post().then().statusCode(200).extract().response();

        System.out.println("EBAmountAfterDue Values are: "+response.jsonPath().getString("data.EBAmountAfterDue_1"));

//        System.out.println("Response Body:\n" + response.prettyPrint());

    }

    @Test(enabled = false)
    public void NoidaPowerDelhiTest7() {

        RestAssured.baseURI = "https://metaex.bpaassolutions.com/indus-eb";

        File file = new File("D:\\Indus Tower\\Invoices 500\\Delhi\\Delhi\\Noida Power Company Limited\\QEB-IN-1010268-20241231-8578041_IN-1010268-2000026650-20241231402313.pdf");

        Response response = given().multiPart("file", file).header("API-Key", "a07f9a07-d992-44ee-aaaa-04876716c423").when().post().then().statusCode(200).extract().response();

        System.out.println("DemandCharge Values are: "+response.jsonPath().getString("data.DemandCharges_2"));

//        System.out.println("Response Body:\n" + response.prettyPrint());

    }

    @Test(enabled = false)
    public void NoidaPowerDelhiTest8() {

        RestAssured.baseURI = "https://metaex.bpaassolutions.com/indus-eb";

        File file = new File("D:\\Indus Tower\\Invoices 500\\Delhi\\Delhi\\Noida Power Company Limited\\QEB-IN-1011131-20241231-8578043_IN-1011131-2000026690-20241231502313.pdf");

        Response response = given().multiPart("file", file).header("API-Key", "a07f9a07-d992-44ee-aaaa-04876716c423").when().post().then().statusCode(200).extract().response();

        System.out.println("DemandCharge Values are: "+response.jsonPath().getString("data.DemandCharges_2"));

//        System.out.println("Response Body:\n" + response.prettyPrint());

    }

    @Test(enabled = false)
    public void NoidaPowerDelhiTest9() {

        RestAssured.baseURI = "https://metaex.bpaassolutions.com/indus-eb";

        File file = new File("D:\\Indus Tower\\Invoices 500\\Delhi\\Delhi\\Noida Power Company Limited\\QEB-IN-1039397-20250104-8602477_IN-1039397-2000055384-20250104063516.pdf");

        Response response = given().multiPart("file", file).header("API-Key", "a07f9a07-d992-44ee-aaaa-04876716c423").when().post().then().statusCode(200).extract().response();

        System.out.println("DemandCharge Values are: "+response.jsonPath().getString("data.DemandCharges_2"));

//        System.out.println("Response Body:\n" + response.prettyPrint());

    }

    @Test(enabled = false)
    public void NoidaPowerDelhiTest10() {

        RestAssured.baseURI = "https://metaex.bpaassolutions.com/indus-eb";

        File file = new File("D:\\Indus Tower\\Invoices 500\\Delhi\\Delhi\\Noida Power Company Limited\\QEB-IN-1044536-20241228-8572022_IN-1044536-2000026657-20241228352617.pdf");

        Response response = given().multiPart("file", file).header("API-Key", "a07f9a07-d992-44ee-aaaa-04876716c423").when().post().then().statusCode(200).extract().response();

        System.out.println("DemandCharge Values are: "+response.jsonPath().getString("data.DemandCharges_2"));

//        System.out.println("Response Body:\n" + response.prettyPrint());

    }

    @Test(enabled = false)
    public void NoidaPowerDelhiTest11() {

        RestAssured.baseURI = "https://metaex.bpaassolutions.com/indus-eb";

        File file = new File("D:\\Indus Tower\\Invoices 500\\Delhi\\Delhi\\Noida Power Company Limited\\QEB-IN-1045411-20241223-8550249_IN-1045411-2000026691-20241223265912.pdf");

        Response response = given().multiPart("file", file).header("API-Key", "a07f9a07-d992-44ee-aaaa-04876716c423").when().post().then().statusCode(200).extract().response();

        System.out.println("DemandCharge Values are: "+response.jsonPath().getString("data.DemandCharges_2"));

//        System.out.println("Response Body:\n" + response.prettyPrint());

    }

    @Test()
    public void NoidaPowerDelhiTest12() {

        RestAssured.baseURI = "https://metaex.bpaassolutions.com/indus-eb";

        File file = new File("D:\\Indus Tower\\Invoices 500\\Delhi\\Delhi\\Noida Power Company Limited\\QEB-IN-1045411-20250121-8764007_IN-1045411-2000026691-20250121294419.pdf");

        Response response = given().multiPart("file", file).header("API-Key", "a07f9a07-d992-44ee-aaaa-04876716c423").when().post().then().statusCode(200).extract().response();

        System.out.println("DemandCharge Values are: "+response.jsonPath().getString("data.DemandCharges_2"));

//        System.out.println("Response Body:\n" + response.prettyPrint());

    }

}
