import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Test {
    public static void main(String[] args) throws IOException {
       Properties properties = new Properties();
       properties.setProperty("name", "tom");
       properties.setProperty("age", "20");

       System.out.println(properties.getProperty("name"));


       Properties db =new Properties();
       db.load(new FileInputStream("db.properties"));
       db.forEach((k, v) -> System.out.println(k + "=" + v));
    }
}
