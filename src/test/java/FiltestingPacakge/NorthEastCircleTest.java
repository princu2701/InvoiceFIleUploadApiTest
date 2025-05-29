package FiltestingPacakge;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.io.File;

import static io.restassured.RestAssured.given;

public class NorthEastCircleTest {

    @Test(enabled = false)
    public void testFileUploadAndValidateField1() {
        RestAssured.baseURI = "https://metaex.bpaassolutions.com/indus-eb";

        File file = new File("D:\\Indus Tower\\Invoices 500\\North East\\North East\\MANIPUR STATE POWER DISTRIBUTION COMPAY LTD\\QEB-IN-2032808-20250117-8744909_IN-2032808-777772358055-20250117353418.pdf");

        Response response = given()
                .header("API-Key", "a07f9a07-d992-44ee-aaaa-04876716c423")
               .multiPart("file", file)
                .contentType("multipart/form-data")
                .when()
                .post()
                .then()
                .extract()
                .response();

        System.out.println("Response Body:\n" + response.prettyPrint());

        // Extract and validate "FixedCharges_1"
        String fixedCharges = response.jsonPath().getString("FixedCharges_1");
        System.out.println("FixedCharges_1 value: " + fixedCharges);

        if (fixedCharges == null || fixedCharges.trim().isEmpty()) {
            System.out.println("✅ FixedCharges_1 is blank.");
        } else {
            System.out.println("❌ FixedCharges_1 is not blank. Value: " + fixedCharges);
        }
    }


    @Test(enabled = false)
    public void testFileUploadAndValidateField2() {
        RestAssured.baseURI = "https://metaex.bpaassolutions.com/indus-eb";

        File file = new File("D:\\Indus Tower\\Invoices 500\\North East\\North East\\MANIPUR STATE POWER DISTRIBUTION COMPAY LTD\\QEB-IN-2032814-20250116-8734786_IN-2032814-072000000608-20250116545912.pdf");

        Response response = given()
                .header("API-Key", "a07f9a07-d992-44ee-aaaa-04876716c423")
                .multiPart("file", file)
                .contentType("multipart/form-data")
                .when()
                .post()
                .then()
                .extract()
                .response();

        System.out.println("Response Body:\n" + response.prettyPrint());

        // Extract and validate "FixedCharges_1"
        String fixedCharges = response.jsonPath().getString("FixedCharges_1");
        System.out.println("FixedCharges_1 value: " + fixedCharges);

        if (fixedCharges == null || fixedCharges.trim().isEmpty()) {
            System.out.println("✅ FixedCharges_1 is blank.");
        } else {
            System.out.println("❌ FixedCharges_1 is not blank. Value: " + fixedCharges);
        }
    }

    @Test(enabled = false)
    public void testFileUploadAndValidateField3() {
        RestAssured.baseURI = "https://metaex.bpaassolutions.com/indus-eb";
        File file= new File("D:\\Indus Tower\\Invoices 500\\North East\\North East\\MANIPUR STATE POWER DISTRIBUTION COMPAY LTD\\QEB-IN-2032829-20250117-8742007_IN-2032829-6230032-20250117104014.pdf");

        Response response = given().multiPart("file", file)
        .header("API-Key", "a07f9a07-d992-44ee-aaaa-04876716c423")
        .post()
        .then()
        .statusCode(200)
        .extract()
        .response();

        System.out.println("Response Body:\n" + response.prettyPrint());

        // Extract and validate "FixedCharges_1"
        String fixedCharges = response.jsonPath().getString("FixedCharges_1");
        System.out.println("FixedCharges_1 value: " + fixedCharges);

        if (fixedCharges == null || fixedCharges.trim().isEmpty()) {
            System.out.println("✅ FixedCharges_1 is blank.");
        } else {
            System.out.println("❌ FixedCharges_1 is not blank. Value: " + fixedCharges);
        }
    }


    @Test(enabled = false)
    public void NorthEastManipurDoc6(){

        RestAssured.baseURI = "https://metaex.bpaassolutions.com/indus-eb";

        File file= new File("D:\\Indus Tower\\Invoices 500\\North East\\North East\\MANIPUR STATE" +
                " POWER DISTRIBUTION COMPAY LTD\\QEB-IN-2032838-20250111-8704433_IN-2032838-777712150010-20250111162723.pdf");

        Response response = given().multiPart("file",file).header("API-Key","a07f9a07-d992-44ee-aaaa-04876716c423")
                .post().then().statusCode(200).extract().response();

        System.out.println("Fixed Charges field value: " + response.jsonPath().getString("FixedCharges_1"));

        System.out.println("Response Body:\n"+response.prettyPrint());

        String fixedchargs=response.jsonPath().getString("FixedCharges_1");

        if (fixedchargs==null || fixedchargs.trim().isEmpty()){

            System.out.println("Fixed Charges Field is blank");
        }else{
            System.out.println("Some Data Found in Fixed Charges Field");
        }
    }

    @Test(enabled = false)
    public void NorthEastManipurDoc7(){

        RestAssured.baseURI = "https://metaex.bpaassolutions.com/indus-eb";

        File file=new File("D:\\Indus Tower\\Invoices 500\\North East\\North East\\MANIPUR STATE " +
        "POWER DISTRIBUTION COMPAY LTD\\QEB-IN-2032869-20250117-8742015_IN-2032869-777772398459-20250117344014.pdf");
        Response response = given().multiPart("file",file).header("API-Key","a07f9a07-d992-44ee-aaaa-04876716c423")
                .post().then().statusCode(200).extract().response();

        System.out.println("Fixed Charges field value: " + response.jsonPath().getString("FixedCharges_1"));

        System.out.println("Response Body:\n"+response.prettyPrint());

        String fixedchargs=response.jsonPath().getString("FixedCharges_1");

        if (fixedchargs==null || fixedchargs.trim().isEmpty()){

            System.out.println("Fixed Charges Field is blank");
        }else{
            System.out.println("Some Data Found in Fixed Charges Field");
        }
    }


    @Test(enabled = false)
    public void NorthEastManipurDoc8(){

        RestAssured.baseURI = "https://metaex.bpaassolutions.com/indus-eb";

        File file=new File("D:\\Indus Tower\\Invoices 500\\North East\\North East\\MANIPUR STATE POWER DISTRIBUTION COMPAY LTD" +
                "\\QEB-IN-2032900-20250107-8638641_IN-2032900-777748218967-20250107115415.pdf");
        Response response = given().multiPart("file",file).header("API-Key","a07f9a07-d992-44ee-aaaa-04876716c423")
                .post().then().statusCode(200).extract().response();

        System.out.println("Fixed Charges field value: " + response.jsonPath().getString("FixedCharges_1"));

        System.out.println("Response Body:\n"+response.prettyPrint());

        String fixedchargs=response.jsonPath().getString("FixedCharges_1");

        if (fixedchargs==null || fixedchargs.trim().isEmpty()){

            System.out.println("Fixed Charges Field is blank");
        }else{
            System.out.println("Some Data Found in Fixed Charges Field");
        }
    }


    @Test(enabled = false)
    public void NorthEastManipurDoc9(){

        RestAssured.baseURI = "https://metaex.bpaassolutions.com/indus-eb";

        File file=new File("D:\\Indus Tower\\Invoices 500\\North East\\North East\\MANIPUR STATE POWER DISTRIBUTION COMPAY LTD\\QEB-IN-2032928-20250117-8742019_IN-2032928-100000102262-20250117434014.pdf");
        Response response = given().multiPart("file",file).header("API-Key","a07f9a07-d992-44ee-aaaa-04876716c423")
                .post().then().statusCode(200).extract().response();

        System.out.println("Fixed Charges field value: " + response.jsonPath().getString("FixedCharges_1"));

        System.out.println("Response Body:\n"+response.prettyPrint());

        String fixedchargs=response.jsonPath().getString("FixedCharges_1");

        if (fixedchargs==null || fixedchargs.trim().isEmpty()){

            System.out.println("Fixed Charges Field is blank");
        }else{
            System.out.println("Some Data Found in Fixed Charges Field");
        }
    }

    @Test(enabled = false)
    public void NorthEastManipurDoc10(){

        RestAssured.baseURI = "https://metaex.bpaassolutions.com/indus-eb";

        File file=new File("D:\\Indus Tower\\Invoices 500\\North East\\North East\\MANIPUR STATE POWER DISTRIBUTION COMPAY LTD\\" +
                "QEB-IN-2032957-20250117-8742021_IN-2032957-72000000693-20250117484014.pdf");
        Response response = given().multiPart("file",file).header("API-Key","a07f9a07-d992-44ee-aaaa-04876716c423")
                .post().then().statusCode(200).extract().response();

        System.out.println("Fixed Charges field value: " + response.jsonPath().getString("FixedCharges_1"));

        System.out.println("Response Body:\n"+response.prettyPrint());

        String fixedchargs=response.jsonPath().getString("FixedCharges_1");

        if (fixedchargs==null || fixedchargs.trim().isEmpty()){

            System.out.println("Fixed Charges Field is blank");
        }else{
            System.out.println("Some Data Found in Fixed Charges Field");
        }


    }

    @Test(enabled = false)
    public void NorthEastManipurDoc11(){

        RestAssured.baseURI = "https://metaex.bpaassolutions.com/indus-eb";

        File file=new File("D:\\Indus Tower\\Invoices 500\\North East\\North East\\MANIPUR STATE POWER DISTRIBUTION COMPAY LTD\\" +
                "QEB-IN-2032960-20250111-8704437_IN-2032960-060000005140-20250111282723.pdf");
        Response response = given().multiPart("file",file).header("API-Key","a07f9a07-d992-44ee-aaaa-04876716c423")
                .post().then().statusCode(200).extract().response();

        System.out.println("Fixed Charges field value: " + response.jsonPath().getString("FixedCharges_1"));

        System.out.println("Response Body:\n"+response.prettyPrint());

        String fixedchargs=response.jsonPath().getString("FixedCharges_1");

        if (fixedchargs==null || fixedchargs.trim().isEmpty()){

            System.out.println("Fixed Charges Field is blank");
        }else{
            System.out.println("Some Data Found in Fixed Charges Field");
        }
    }

    @Test(enabled = false)
    public void NorthEastManipurDoc12(){

        RestAssured.baseURI = "https://metaex.bpaassolutions.com/indus-eb";

        File file=new File("D:\\Indus Tower\\Invoices 500\\North East\\North East\\MANIPUR STATE POWER DISTRIBUTION COMPAY LTD\\" +
                "QEB-IN-2033001-20250109-8675487_IN-2033001-651011-20250109552017.pdf");
        Response response = given().multiPart("file",file).header("API-Key","a07f9a07-d992-44ee-aaaa-04876716c423")
                .post().then().statusCode(200).extract().response();

        System.out.println("Fixed Charges field value: " + response.jsonPath().getString("FixedCharges_1"));

        System.out.println("Response Body:\n"+response.prettyPrint());

        String fixedchargs=response.jsonPath().getString("FixedCharges_1");

        if (fixedchargs==null || fixedchargs.trim().isEmpty()){

            System.out.println("Fixed Charges Field is blank");
        }else{
            System.out.println("Some Data Found in Fixed Charges Field");
        }
    }


    @Test(enabled = false)
    public void NorthEastManipurDoc13(){

        RestAssured.baseURI = "https://metaex.bpaassolutions.com/indus-eb";

        File file=new File("D:\\Indus Tower\\Invoices 500\\North East\\North East\\MANIPUR STATE POWER DISTRIBUTION COMPAY LTD\\QEB-IN-2033036-20250117-8741116_IN-2033036-72000000650-20250117181812.pdf");
        Response response = given().multiPart("file",file).header("API-Key","a07f9a07-d992-44ee-aaaa-04876716c423")
                .post().then().statusCode(200).extract().response();

        System.out.println("Fixed Charges field value: " + response.jsonPath().getString("FixedCharges_1"));

        System.out.println("Response Body:\n"+response.prettyPrint());

        String fixedchargs=response.jsonPath().getString("FixedCharges_1");

        if (fixedchargs==null || fixedchargs.trim().isEmpty()){

            System.out.println("Fixed Charges Field is blank");
        }else{
            System.out.println("Some Data Found in Fixed Charges Field");
        }
    }

    @Test(enabled = false)
    public void NorthEastManipurDoc14(){

        RestAssured.baseURI = "https://metaex.bpaassolutions.com/indus-eb";

        File file=new File("D:\\Indus Tower\\Invoices 500\\North East\\North East\\MANIPUR STATE POWER DISTRIBUTION COMPAY LTD\\" +
                "QEB-IN-2033052-20250121-8762134_IN-2033052-111000104518-20250121114610.pdf");
        Response response = given().multiPart("file",file).header("API-Key","a07f9a07-d992-44ee-aaaa-04876716c423")
                .post().then().statusCode(200).extract().response();

        System.out.println("Fixed Charges field value: " + response.jsonPath().getString("FixedCharges_1"));

        System.out.println("Response Body:\n"+response.prettyPrint());

        String fixedchargs=response.jsonPath().getString("FixedCharges_1");

        if (fixedchargs==null || fixedchargs.trim().isEmpty()){

            System.out.println("Fixed Charges Field is blank");
        }else{
            System.out.println("Some Data Found in Fixed Charges Field");
        }
    }


    @Test()
    public void NorthEastManipurDoc15(){

        RestAssured.baseURI = "https://metaex.bpaassolutions.com/indus-eb";

        File file=new File("D:\\Indus Tower\\Invoices 500\\North East\\North East\\MANIPUR STATE POWER DISTRIBUTION COMPAY LTD\\QEB-IN-2033195-20250113-8711568_IN-2033195-48857103-20250113461316.pdf");
        Response response = given().multiPart("file",file).header("API-Key","a07f9a07-d992-44ee-aaaa-04876716c423")
                .post().then().statusCode(200).extract().response();

        System.out.println("Fixed Charges field value: " + response.jsonPath().getString("FixedCharges_1"));

        System.out.println("Response Body:\n"+response.prettyPrint());

        String fixedchargs=response.jsonPath().getString("FixedCharges_1");

        if (fixedchargs==null || fixedchargs.trim().isEmpty()){

            System.out.println("Fixed Charges Field is blank");
        }else{
            System.out.println("Some Data Found in Fixed Charges Field");
        }
    }


}

