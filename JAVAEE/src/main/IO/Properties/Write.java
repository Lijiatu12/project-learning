package Properties;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Write {
    public static void main(String[] args) throws IOException {


         //使用并修改：没有key 创建   有key  就是修改

        Properties properties = new Properties();



        properties.setProperty("charset","utf8");

        properties.setProperty("user","汤姆");//是中文unicode码
        properties.setProperty("pwd", "123456");

      //添加注释
        properties.store(new FileOutputStream("D:\\Program development\\JAVA基础\\JAVASE\\IO\\Properties\\mysql.properties"),"hello world" );


        System.out.println("保存成功");





    }
}
