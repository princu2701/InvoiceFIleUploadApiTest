package FiltestingPacakge;

import Utils.apiandurlstored;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

public class hublielectricsupplyandkarnatakafiles {

    @Test
    public void file1with1issue() throws IOException {

        apiandurlstored apiandurlstored=new apiandurlstored();
        apiandurlstored.karnatakapropertiesfetcher();

        RestAssured.baseURI=apiandurlstored.getbaseurl();

        File file = new File("D:\\Indus Tower\\Invoices 500\\Karnataka\\Karnataka\\Hubli Electricity Supply Company Limited\\QEB-IN-1019510-20250103-8592510_IN-1019510-1308210-20250103343918.pdf");

        Response response=given()
                .multiPart("file",file)
                .header("API-Key", apiandurlstored.getapikey())
                .when()
                .post()
                .then().statusCode(200).extract().response();

//        System.out.println(response.asPrettyString());

        System.out.println("FuelSurcharge values are: "+response.jsonPath().getString("data.FuelSurcharge_2"));

    }

    @Test
    public void file2with3issues() throws IOException {

        apiandurlstored apiandurlstored = new apiandurlstored();
        apiandurlstored.karnatakapropertiesfetcher();

        RestAssured.baseURI = apiandurlstored.getbaseurl();

        File file = new File("D:\\Indus Tower\\Invoices 500\\Karnataka\\Karnataka\\Hubli Electricity Supply Company Limited\\QEB-IN-1019726-20250103-8593988_IN-1019726-2998073-20250103452619.pdf");

        Response response= given().multiPart("file",file)
                .header("API-Key",apiandurlstored.getapikey())
                .when()
                .post()
                .then()
                .statusCode(200)
                .extract().response();

        System.out.println("Response Status Received is: "+response.jsonPath().getString("data.ArrearAmount_1"));
        System.out.println("EndDate values are: "+response.jsonPath().getString("data.EndDate_2"));
        System.out.println("FuelSurcharge values are: "+response.jsonPath().getString("data.FuelSurcharge_2"));

        System.out.println(response.asPrettyString());
    }

    @Test
    public void file3with3issues() throws IOException {

        apiandurlstored apiandurlstored = new apiandurlstored();
        apiandurlstored.karnatakapropertiesfetcher();

        RestAssured.baseURI = apiandurlstored.getbaseurl();

        File file = new File("D:\\Indus Tower\\Invoices 500\\Karnataka\\Karnataka\\Hubli Electricity Supply Company Limited\\QEB-IN-1020022-20250102-8583266_IN-1020022-1495277-20250102233314.pdf");

        Response response= given().multiPart("file",file)
                .header("API-Key",apiandurlstored.getapikey())
                .when()
                .post()
                .then()
                .statusCode(200)
                .extract().response();

      System.out.println("FuelSurcharge values are: "+response.jsonPath().getString("data.FuelSurcharge_2"));
        System.out.println("OtherRefund values are: "+response.jsonPath().getString("data.OtherRefund"));
        System.out.println("OtherRefund_1 values are: "+response.jsonPath().getString("data.OtherRefund_1"));

        System.out.println(response.asPrettyString());
    }


    @Test
    public void file4with2issues() throws IOException {

        apiandurlstored apiandurlstored = new apiandurlstored();
        apiandurlstored.karnatakapropertiesfetcher();

        RestAssured.baseURI = apiandurlstored.getbaseurl();

        File file = new File("D:\\Indus Tower\\Invoices 500\\Karnataka\\Karnataka\\Hubli Electricity Supply Company Limited\\QEB-IN-1019569-20250104-8608937_IN-1019569-3846076-20250104581220.pdf");

        Response response= given().multiPart("file",file)
                .header("API-Key",apiandurlstored.getapikey())
                .when()
                .post()
                .then()
                .statusCode(200)
                .extract().response();

        System.out.println("Account values are: "+response.jsonPath().getString("data.AccountNo_2"));
        System.out.println("FuelSurcharge values are: "+response.jsonPath().getString("data.FuelSurcharge_2"));
        System.out.println(response.asPrettyString());
    }

    @Test
    public void file5with2issues() throws IOException {

        apiandurlstored apiandurlstored = new apiandurlstored();
        apiandurlstored.karnatakapropertiesfetcher();

        RestAssured.baseURI = apiandurlstored.getbaseurl();

        File file = new File("D:\\Indus Tower\\Invoices 500\\Karnataka\\Karnataka\\Hubli Electricity Supply Company Limited\\QEB-IN-1019666-20250103-8594003_IN-1019666-191446-20250103582619.pdf");

        Response response= given().multiPart("file",file)
                .header("API-Key",apiandurlstored.getapikey())
                .when()
                .post()
                .then()
                .statusCode(200)
                .extract().response();

        System.out.println("FixedCharges values are: "+response.jsonPath().getString("data.FixedCharges_2"));
        System.out.println("FuelSurcharge values are: "+response.jsonPath().getString("data.FuelSurcharge_2"));
        System.out.println(response.asPrettyString());
    }


    @Test
    public void file6with2issues() throws IOException {

        apiandurlstored apiandurlstored = new apiandurlstored();
        apiandurlstored.karnatakapropertiesfetcher();

        RestAssured.baseURI = apiandurlstored.getbaseurl();

        File file = new File("D:\\Indus Tower\\Invoices 500\\Karnataka\\Karnataka\\Hubli Electricity Supply Company Limited\\QEB-IN-1019667-20250109-8673419_IN-1019667-191128-20250109285614.pdf");

        Response response= given().multiPart("file",file)
                .header("API-Key",apiandurlstored.getapikey())
                .when()
                .post()
                .then()
                .statusCode(200)
                .extract().response();

        System.out.println("EndDate values are: "+response.jsonPath().getString("data.EndDate_2"));
        System.out.println("FuelSurcharge values are: "+response.jsonPath().getString("data.FuelSurcharge_2"));
        System.out.println(response.asPrettyString());
    }

    @Test
    public void file7with1issue() throws IOException {

        apiandurlstored apiandurlstored = new apiandurlstored();
        apiandurlstored.karnatakapropertiesfetcher();

        RestAssured.baseURI = apiandurlstored.getbaseurl();
        File file = new File("D:\\Indus Tower\\Invoices 500\\Karnataka\\Karnataka\\Hubli Electricity Supply Company Limited\\QEB-IN-1019520-20250104-8609243_IN-1019520-3676934-20250104402320.pdf");

        Response response= given().multiPart("file",file)
                .header("API-Key",apiandurlstored.getapikey())
                .when()
                .post()
                .then()
                .statusCode(200)
                .extract().response();

        System.out.println("FuelSurcharge values are: "+response.jsonPath().getString("data.FuelSurcharge_2"));
        System.out.println(response.asPrettyString());
    }

    @Test
    public void file8with1issue() throws IOException {

        apiandurlstored apiandurlstored = new apiandurlstored();
        apiandurlstored.karnatakapropertiesfetcher();

        RestAssured.baseURI = apiandurlstored.getbaseurl();
        File file = new File("D:\\Indus Tower\\Invoices 500\\Karnataka\\Karnataka\\Hubli Electricity Supply Company Limited\\QEB-IN-1019555-20250102-8582180_IN-1019555-1837509-20250102305613.pdf");

        Response response= given().multiPart("file",file)
                .header("API-Key",apiandurlstored.getapikey())
                .when()
                .post()
                .then()
                .statusCode(200)
                .extract().response();

        System.out.println("FuelSurcharge values are: "+response.jsonPath().getString("data.FuelSurcharge_2"));
        System.out.println(response.asPrettyString());
    }

    @Test
    public void file9with1issue() throws IOException {

        apiandurlstored apiandurlstored = new apiandurlstored();
        apiandurlstored.karnatakapropertiesfetcher();

        RestAssured.baseURI = apiandurlstored.getbaseurl();
        File file = new File("D:\\Indus Tower\\Invoices 500\\Karnataka\\Karnataka\\Hubli Electricity Supply Company Limited\\QEB-IN-1019563-20250103-8593685_IN-1019563-6026563000-20250103411519.pdf");

        Response response= given().multiPart("file",file)
                .header("API-Key",apiandurlstored.getapikey())
                .when()
                .post()
                .then()
                .statusCode(200)
                .extract().response();

        System.out.println("TaxesNDuties values are: "+response.jsonPath().getString("data.TaxesNDuties_1"));
        System.out.println(response.asPrettyString());
    }

    @Test
    public void file10with1issue() throws IOException {

        apiandurlstored apiandurlstored = new apiandurlstored();
        apiandurlstored.karnatakapropertiesfetcher();

        RestAssured.baseURI = apiandurlstored.getbaseurl();
        File file = new File("D:\\Indus Tower\\Invoices 500\\Karnataka\\Karnataka\\Hubli Electricity Supply Company Limited\\QEB-IN-1019564-20250104-8608638_IN-1019564-3216181-20250104130120.pdf");

        Response response= given().multiPart("file",file)
                .header("API-Key",apiandurlstored.getapikey())
                .when()
                .post()
                .then()
                .statusCode(200)
                .extract().response();

        System.out.println("FuelSurcharge values are: "+response.jsonPath().getString("data.FuelSurcharge_2"));
        System.out.println(response.asPrettyString());
    }

    @Test
    public void file11with1issue() throws IOException {

        apiandurlstored apiandurlstored = new apiandurlstored();
        apiandurlstored.karnatakapropertiesfetcher();

        RestAssured.baseURI = apiandurlstored.getbaseurl();
        File file = new File("D:\\Indus Tower\\Invoices 500\\Karnataka\\Karnataka\\Hubli Electricity Supply Company Limited\\QEB-IN-1019608-20250102-8583273_IN-1019608-2884169-20250102393314.pdf");

        Response response= given().multiPart("file",file)
                .header("API-Key",apiandurlstored.getapikey())
                .when()
                .post()
                .then()
                .statusCode(200)
                .extract().response();

        System.out.println("FuelSurcharge values are: "+response.jsonPath().getString("data.FuelSurcharge_2"));
        System.out.println(response.asPrettyString());
    }

    @Test
    public void file12with1issue() throws IOException {

        apiandurlstored apiandurlstored = new apiandurlstored();
        apiandurlstored.karnatakapropertiesfetcher();

        RestAssured.baseURI = apiandurlstored.getbaseurl();
        File file = new File("D:\\Indus Tower\\Invoices 500\\Karnataka\\Karnataka\\Hubli Electricity Supply Company Limited\\QEB-IN-1019662-20250103-8592535_IN-1019662-156323-20250103034018.pdf");

        Response response= given().multiPart("file",file)
                .header("API-Key",apiandurlstored.getapikey())
                .when()
                .post()
                .then()
                .statusCode(200)
                .extract().response();

        System.out.println("FuelSurcharge values are: "+response.jsonPath().getString("data.FuelSurcharge_2"));
        System.out.println(response.asPrettyString());
    }
}
