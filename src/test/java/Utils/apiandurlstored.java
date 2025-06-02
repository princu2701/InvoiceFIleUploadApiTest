package Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class apiandurlstored {

    public Properties properties;
    public String url;
    public FileInputStream propfile;

    public void karnatakapropertiesfetcher() throws IOException {


        properties=new Properties();

        propfile=new FileInputStream("C:\\Users\\Admin\\IdeaProjects\\Indus_RestAssured\\src\\test\\resources\\configfiles\\personaldatadriven");

        properties.load(propfile);

        url=properties.getProperty("baseurl");

    }

    public String getbaseurl() {

        return url;
    }

    public String getapikey() {

        return properties.getProperty("apikey");
    }
}
