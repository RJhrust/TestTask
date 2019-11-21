package utils;


import java.io.*;
import java.util.Properties;

public class Utils {

    public String setURL()throws IOException {
        String host = "";
        try {
            InputStream conf =new FileInputStream("C:\\Users\\Anton.Rozov\\IdeaProjects\\TestTask\\src\\resources");

            Properties prop = new Properties();
            prop.load(conf);
           host = prop.getProperty("host");
        }catch (IOException e){

        }

        return host;
    }
}
