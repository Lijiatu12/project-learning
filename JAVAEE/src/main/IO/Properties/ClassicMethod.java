package Properties;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;
@SuppressWarnings({"all"})
public class ClassicMethod {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new FileReader("D:\\Program development\\JAVA基础\\JAVASE\\IO\\Properties\\mysql.properties"));

    String line = " ";
    while ((line = br.readLine())!= null){

        String[] split = line.split("=");
        System.out.println(split[0] + "值是"  + split[1]);
    }
br.close();
    }

}
