package FiltestingPacakge;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.io.File;

import static io.restassured.RestAssured.given;

public class MumbaiTatafiles {

    @Test
    public void tatafile1() {

        RestAssured.baseURI = "https://metaex.bpaassolutions.com/indus-eb";

        File file = new File("D:\\Indus Tower\\Invoices 500\\Mumbai\\Mumbai\\The Tata Power Company Limited\\QEB-IN-1016491-20250111-8699403_IN-1016491-900000033908-20250111345917.pdf");

        Response response = given().multiPart("file", file).header("API-Key", "a07f9a07-d992-44ee-aaaa-04876716c423").when().post().then().statusCode(200).extract().response();

        System.out.println("Response Status Received is: "+response.getStatusCode());
        System.out.println("Other Refund with FilePath: "+ file.getName() +"\nAnd their values are: "+response.jsonPath().getString("data.OtherRefund_1"));
        System.out.println("TCS_1 with FilePath: "+ file.getName() +"\nAnd their values are: "+response.jsonPath().getString("data.TCS_1")); //76
        System.out.println("TOD Tariff with FilePath: "+ file.getName() +"\nAnd their values are: "+response.jsonPath().getString("data.TODTarrif_1")); // 1193
        System.out.println(response.prettyPrint());




    }


    @Test
    public void tatafile2() {

        RestAssured.baseURI = "https://metaex.bpaassolutions.com/indus-eb";

        File file = new File("D:\\Indus Tower\\Invoices 500\\Mumbai\\Mumbai\\The Tata Power Company Limited\\QEB-IN-1098529-20250108-8652710_IN-1098529-900000071394-20250108552211.pdf");

        Response response = given().multiPart("file", file).header("API-Key", "a07f9a07-d992-44ee-aaaa-04876716c423").when().post().then().statusCode(200).extract().response();

        System.out.println("Response Status Received is: "+response.getStatusCode());
        System.out.println("Power Factor with FilePath: "+ file.getName() +"\nAnd their values are: "+response.jsonPath().getString("data.PowerFactorPenalty_1"));
        System.out.println("PromptPaymentRebate_1 with FilePath: "+ file.getName() +"\nAnd their values are: "+response.jsonPath().getString("data.PromptPaymentRebate_1"));
        System.out.println("TOD Tariff with FilePath: "+ file.getName() +"\nAnd their values are: "+response.jsonPath().getString("data.TODTarrif_1"));
        System.out.println(response.prettyPrint());




    }

    @Test
    public void tatafile3() {

        RestAssured.baseURI = "https://metaex.bpaassolutions.com/indus-eb";

        File file = new File("D:\\Indus Tower\\Invoices 500\\Mumbai\\Mumbai\\The Tata Power Company Limited\\QEB-IN-1325479-20250114-8725511_IN-1325479-900001044536-20250114220517.pdf");

        Response response = given().multiPart("file", file).header("API-Key", "a07f9a07-d992-44ee-aaaa-04876716c423").when().post().then().statusCode(200).extract().response();

        System.out.println("Response Status Received is: "+response.getStatusCode());
        System.out.println("EndDate_1 with FilePath: "+ file.getName() +"\nAnd their values are: "+response.jsonPath().getString("data.EndDate_1"));
        System.out.println("PromptPaymentRebate_1 with FilePath: "+ file.getName() +"\nAnd their values are: "+response.jsonPath().getString("data.PromptPaymentRebate_1"));
        System.out.println("Start Date with FilePath: "+ file.getName() +"\nAnd their values are: "+response.jsonPath().getString("data.StartDate_1"));
        System.out.println(response.prettyPrint());




    }

    @Test
    public void tatafile4() {

        RestAssured.baseURI = "https://metaex.bpaassolutions.com/indus-eb";

        File file = new File("D:\\Indus Tower\\Invoices 500\\Mumbai\\Mumbai\\The Tata Power Company Limited\\QEB-IN-3147235-20250111-8696194_IN-3147235-900001181161-20250111024814.pdf");

        Response response = given().multiPart("file", file).header("API-Key", "a07f9a07-d992-44ee-aaaa-04876716c423").when().post().then().statusCode(200).extract().response();

        System.out.println("Response Status Received is: "+response.getStatusCode());
//        System.out.println("EndDate_1 with FilePath: "+ file.getName() +"\nAnd their values are: "+response.jsonPath().getString("data.EndDate_1"));
        System.out.println("PromptPaymentRebate_1 with FilePath: "+ file.getName() +"\nAnd their values are: "+response.jsonPath().getString("data.PromptPaymentRebate_1"));
//        System.out.println("Start Date with FilePath: "+ file.getName() +"\nAnd their values are: "+response.jsonPath().getString("data.StartDate_1"));
        System.out.println("RegulatoryCharge with FilePath: "+ file.getName() +"\nAnd their values are: "+response.jsonPath().getString("data.RegulatoryCharges"));
        System.out.println("TCS_1 with FilePath: "+ file.getName() +"\nAnd their values are: "+response.jsonPath().getString("data.TCS_1"));
        System.out.println(response.prettyPrint());

    }

    @Test
    public void tatafile5() {

        RestAssured.baseURI = "https://metaex.bpaassolutions.com/indus-eb";

        File file = new File("D:\\Indus Tower\\Invoices 500\\Mumbai\\Mumbai\\The Tata Power Company Limited\\QEB-IN-1025798-20241224-8555821_IN-1025798-900000015787-20241224411115.pdf");

        Response response = given().multiPart("file", file).header("API-Key", "a07f9a07-d992-44ee-aaaa-04876716c423").when().post().then().statusCode(200).extract().response();

        System.out.println("Response Status Received is: "+response.getStatusCode());
        System.out.println("Fuels with FilePath: "+ file.getName() +"\nAnd their values are: "+response.jsonPath().getString("data.FuelSurcharge_1"));
//        System.out.println("PromptPaymentRebate_1 with FilePath: "+ file.getName() +"\nAnd their values are: "+response.jsonPath().getString("data.PromptPaymentRebate_1"));
//        System.out.println("Start Date with FilePath: "+ file.getName() +"\nAnd their values are: "+response.jsonPath().getString("data.StartDate_1"));
//        System.out.println("RegulatoryCharge with FilePath: "+ file.getName() +"\nAnd their values are: "+response.jsonPath().getString("data.RegulatoryCharges"));
//        System.out.println("TCS_1 with FilePath: "+ file.getName() +"\nAnd their values are: "+response.jsonPath().getString("data.TCS_1"));
        System.out.println("Other Refund with FilePath: "+ file.getName() +"\nAnd their values are: "+response.jsonPath().getString("data.OtherRefund_1"));
        System.out.println(response.prettyPrint());

    }

    @Test
    public void tatafile6() {

        RestAssured.baseURI = "https://metaex.bpaassolutions.com/indus-eb";

        File file = new File("D:\\Indus Tower\\Invoices 500\\Mumbai\\Mumbai\\The Tata Power Company Limited\\QEB-IN-1025852-20250108-8652729_IN-1025852-900000032574-20250108092411.pdf");

        Response response = given().multiPart("file", file).header("API-Key", "a07f9a07-d992-44ee-aaaa-04876716c423").when().post().then().statusCode(200).extract().response();

        System.out.println("Response Status Received is: "+response.getStatusCode());
        System.out.println("Power Factor Penalty with FilePath: "+ file.getName() +"\nAnd their values are: "+response.jsonPath().getString("data.PowerFactorPenalty_1"));
        System.out.println("TOD Tariff with FilePath: "+ file.getName() +"\nAnd their values are: "+response.jsonPath().getString("data.TODTarrif_1"));
//        System.out.println("Fuels with FilePath: "+ file.getName() +"\nAnd their values are: "+response.jsonPath().getString("data.FuelSurcharge_1"));
//        System.out.println("PromptPaymentRebate_1 with FilePath: "+ file.getName() +"\nAnd their values are: "+response.jsonPath().getString("data.PromptPaymentRebate_1"));
//        System.out.println("Start Date with FilePath: "+ file.getName() +"\nAnd their values are: "+response.jsonPath().getString("data.StartDate_1"));
//        System.out.println("RegulatoryCharge with FilePath: "+ file.getName() +"\nAnd their values are: "+response.jsonPath().getString("data.RegulatoryCharges"));
//        System.out.println("TCS_1 with FilePath: "+ file.getName() +"\nAnd their values are: "+response.jsonPath().getString("data.TCS_1"));
//        System.out.println("Other Refund with FilePath: "+ file.getName() +"\nAnd their values are: "+response.jsonPath().getString("data.OtherRefund_1"));
        System.out.println(response.prettyPrint());

    }

}
