package Properties;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Read {

    public static void main(String[] args) throws IOException {

        Properties properties = new Properties();


        properties.load(new FileReader("D:\\Program development\\JAVA基础\\JAVASE\\IO\\Properties\\mysql.properties"));


        properties.list(System.out);



        //根据k获取对应的值
        String user = properties.getProperty("user");


        String pwd = properties.getProperty("pwd");


        System.out.println(user);
        System.out.println(pwd);

    }
}
