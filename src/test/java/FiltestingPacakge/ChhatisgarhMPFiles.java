package FiltestingPacakge;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.io.File;

import static io.restassured.RestAssured.given;

public class ChhatisgarhMPFiles {

    @Test
    public void mpfile1() {

        RestAssured.baseURI="https://metaex.bpaassolutions.com/indus-eb";

        File file = new File("D:\\Indus Tower\\Invoices 500\\Madhya Pradesh\\Madhya Pradesh\\Chhattisgarh State Power Distribution Company Limited\\QEB-IN-2022799-20241224-8558256_IN-2022799-1006804203-20241224550022.pdf");

        Response response = given().multiPart("file", file).header("API-Key", "a07f9a07-d992-44ee-aaaa-04876716c423").when().post().then().statusCode(200).extract().response();

        System.out.println(response.asPrettyString());
        System.out.println("EndDate Values are: "+response.jsonPath().getString("data.EndDate_1"));

    }

    @Test
    public void mpfile2() {

        RestAssured.baseURI = "https://metaex.bpaassolutions.com/indus-eb";

        File file = new File("D:\\Indus Tower\\Invoices 500\\Madhya Pradesh\\Madhya Pradesh\\Chhattisgarh State Power Distribution Company Limited\\QEB-IN-2022978-20250119-8751121_IN-2022978-1006774785-20250119323516.pdf");

        Response response = given().multiPart("file",file).header("API-Key", "a07f9a07-d992-44ee-aaaa-04876716c423").when().post().then().statusCode(200).extract().response();

//        System.out.println(response.asPrettyString());
        System.out.println("EndDate Values are: "+response.jsonPath().getString("data.EndDate_1"));
    }

    @Test
    public void mpfile3() {

        RestAssured.baseURI = "https://metaex.bpaassolutions.com/indus-eb";

        File file = new File("D:\\Indus Tower\\Invoices 500\\Madhya Pradesh\\Madhya Pradesh\\Chhattisgarh State Power Distribution Company Limited\\QEB-IN-2022984-20250119-8751142_IN-2022984-1001943139-20250119053716.pdf");

        Response response = given().multiPart("file",file).header("API-Key", "a07f9a07-d992-44ee-aaaa-04876716c423").when().post().then().statusCode(200).extract().response();

//        System.out.println(response.asPrettyString());
        System.out.println("CurrentBillLPSC with FilePath: "+ file.getAbsoluteFile() +"\n And their values are: "+response.jsonPath().getString("data.CurrentBillLPSC_1"));
    }

    @Test
    public void mpfile4() {

        RestAssured.baseURI = "https://metaex.bpaassolutions.com/indus-eb";

        File file = new File("D:\\Indus Tower\\Invoices 500\\Madhya Pradesh\\Madhya Pradesh\\Chhattisgarh State Power Distribution Company Limited\\QEB-IN-2023008-20250122-8772172_IN-2023008-1001291944-20250122015523.pdf");
        Response response = given().multiPart("file",file).header("API-Key", "a07f9a07-d992-44ee-aaaa-04876716c423").when().post().then().statusCode(200).extract().response();

//        System.out.println(response.asPrettyString());
        System.out.println("EBamountAfterDue with FilePath: "+ file.getAbsoluteFile() +"\n And their values are: "+response.jsonPath().getString("data.EBAmountAfterDue_1"));
    }

    @Test
    public void mpfile5() {

        RestAssured.baseURI = "https://metaex.bpaassolutions.com/indus-eb";

        File file = new File("D:\\Indus Tower\\Invoices 500\\Madhya Pradesh\\Madhya Pradesh\\Chhattisgarh State Power Distribution Company Limited\\QEB-IN-2023018-20250116-8739804_IN-2023018-1000083651-20250116444022.pdf");

        Response response = given().multiPart("file",file).header("API-Key", "a07f9a07-d992-44ee-aaaa-04876716c423").when().post().then().statusCode(200).extract().response();

        System.out.println("Response Status Received is: "+response.getStatusCode());
        System.out.println("\nPowerFactorPenalty with FilePath: "+ file.getAbsoluteFile() +"\n And their values are: "+response.jsonPath().getString("data.PowerFactorPenalty_1"));
    }

    @Test
    public void mpfile6() {

        RestAssured.baseURI = "https://metaex.bpaassolutions.com/indus-eb";

        File file = new File("D:\\Indus Tower\\Invoices 500\\Madhya Pradesh\\Madhya Pradesh\\Chhattisgarh State Power Distribution Company Limited\\QEB-IN-2023061-20241224-8558793_IN-2023061-1001616539-20241224494922.pdf");


        Response response = given().multiPart("file",file).header("API-Key", "a07f9a07-d992-44ee-aaaa-04876716c423").when().post().then().statusCode(200).extract().response();

        System.out.println("Response Status Received is: "+response.getStatusCode());
        System.out.println("EndDate with FilePath: "+ file.getAbsoluteFile() +"\nAnd their values are: "+response.jsonPath().getString("data.EndDate_1"));

    }

    @Test
    public void mpfile7() {

        RestAssured.baseURI = "https://metaex.bpaassolutions.com/indus-eb";

        File file = new File("D:\\Indus Tower\\Invoices 500\\Madhya Pradesh\\Madhya Pradesh\\Chhattisgarh State Power Distribution Company Limited\\QEB-IN-2023142-20250115-8733565_IN-2023142-1007070162-20250115360123.pdf");


        Response response = given().multiPart("file",file).header("API-Key", "a07f9a07-d992-44ee-aaaa-04876716c423").when().post().then().statusCode(200).extract().response();

        System.out.println("Response Status Received is: "+response.getStatusCode());
        System.out.println("EndDate with FilePath: "+ file.getName() +"\nAnd their values are: "+response.jsonPath().getString("data.EndDate_1"));

    }

    @Test
    public void mpfile8() {

        RestAssured.baseURI = "https://metaex.bpaassolutions.com/indus-eb";

        File file = new File("D:\\Indus Tower\\Invoices 500\\Madhya Pradesh\\Madhya Pradesh\\Chhattisgarh State Power Distribution Company Limited\\QEB-IN-2023194-20250116-8734021_IN-2023194-1001903532-20250116084809.pdf");


        Response response = given().multiPart("file",file).header("API-Key", "a07f9a07-d992-44ee-aaaa-04876716c423").when().post().then().statusCode(200).extract().response();

        System.out.println("Response Status Received is: "+response.getStatusCode());
        System.out.println("ROundOff with FileName as : "+ file.getName() +"\nAnd their values are: "+response.jsonPath().getString("data.RoundOffAmount"));

    }

    @Test
    public void mpfile9() {

        RestAssured.baseURI = "https://metaex.bpaassolutions.com/indus-eb";

        File file = new File("D:\\Indus Tower\\Invoices 500\\Madhya Pradesh\\Madhya Pradesh\\Chhattisgarh State Power Distribution Company Limited\\QEB-IN-2023199-20250113-8720414_IN-2023199-1005549018-20250113155622.pdf");


        Response response = given().multiPart("file",file).header("API-Key", "a07f9a07-d992-44ee-aaaa-04876716c423").when().post().then().statusCode(200).extract().response();

        System.out.println("Response Status Received is: "+response.getStatusCode());
        System.out.println("EndDate with FilePath: "+ file.getName() +"\nAnd their values are: "+response.jsonPath().getString("data.EndDate_1"));

    }

    @Test
    public void mpfile10() {

        RestAssured.baseURI = "https://metaex.bpaassolutions.com/indus-eb";

        File file = new File("D:\\Indus Tower\\Invoices 500\\Madhya Pradesh\\Madhya Pradesh\\Chhattisgarh State Power Distribution Company Limited\\QEB-IN-2023687-20250122-8772144_IN-2023687-1002001839-20250122205323.pdf");


        Response response = given().multiPart("file",file).header("API-Key", "a07f9a07-d992-44ee-aaaa-04876716c423").when().post().then().statusCode(200).extract().response();

        System.out.println(response.prettyPrint());
        System.out.println("Response Status Received is: "+response.getStatusCode());
        System.out.println("LPSC with FilePath: "+ file.getName() +"\nAnd their values are: "+response.jsonPath().getString("data.CurrentBillLPSC_1"));

    }

    @Test
    public void mpfile11with2issues11() {

        RestAssured.baseURI = "https://metaex.bpaassolutions.com/indus-eb";

        File file = new File("D:\\Indus Tower\\Invoices 500\\Madhya Pradesh\\Madhya Pradesh\\Chhattisgarh State Power Distribution Company Limited\\QEB-IN-2022809-20250119-8750803_IN-2022809-1006674006-20250119572016.pdf");


        Response response = given().multiPart("file",file).header("API-Key", "a07f9a07-d992-44ee-aaaa-04876716c423").when().post().then().statusCode(200).extract().response();

        System.out.println(response.prettyPrint());
        System.out.println("Response Status Received is: "+response.getStatusCode());
        System.out.println("LPSC with FilePath: "+ file.getName() +"\nAnd their values are: "+response.jsonPath().getString("data.CurrentBillLPSC_1"));
        System.out.println("PFP with FilePath: "+ file.getName() +"\nAnd their values are: "+response.jsonPath().getString("data.PowerFactorPenalty_1"));

    }

    @Test
    public void mpfile11with2issues12() {

        RestAssured.baseURI = "https://metaex.bpaassolutions.com/indus-eb";

        File file = new File("D:\\Indus Tower\\Invoices 500\\Madhya Pradesh\\Madhya Pradesh\\Chhattisgarh State Power Distribution Company Limited\\QEB-IN-2023090-20250113-8720226_IN-2023090-1000535921-20250113284722.pdf");


        Response response = given().multiPart("file",file).header("API-Key", "a07f9a07-d992-44ee-aaaa-04876716c423").when().post().then().statusCode(200).extract().response();

        System.out.println(response.prettyPrint());
        System.out.println("Response Status Received is: "+response.getStatusCode());
        System.out.println("LPSC with FilePath: "+ file.getName() +"\nAnd their values are: "+response.jsonPath().getString("data.CurrentBillLPSC_1"));
        System.out.println("PFP with FilePath: "+ file.getName() +"\nAnd their values are: "+response.jsonPath().getString("data.PowerFactorPenalty_1"));

    }

}
