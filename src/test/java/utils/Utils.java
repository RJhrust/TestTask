package utils;
import io.restassured.RestAssured;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Utils {
InputStream fl;
    //Sets Base URI
    public void setBaseURI (){
        Properties prop = new Properties();
        String propFileName = "config.properties";
        try {

            fl = getClass().getClassLoader().getResourceAsStream(propFileName);
            if (fl !=null) {
                prop.load(fl);
            }else {
                throw new FileNotFoundException("Property file'" + propFileName + "' not found in the classpath");
            }
        }catch (IOException e){
            System.out.println(e);
        }
        String host = prop.getProperty("host");
        RestAssured.baseURI = host;
    }
}
