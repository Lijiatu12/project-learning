package Reader.InputStreamReader;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReader01 {

    public static void main(String[] args) throws IOException {

        String FilePath = "D:\\Program development\\JAVA基础\\JAVASE\\IO\\InputStream\\FileInputStream\\news5.txt";

        //流的转换
        InputStreamReader isr = new InputStreamReader(new FileInputStream(FilePath),"gbk");

        BufferedReader br = new BufferedReader(isr);


        //读取
        String s = br.readLine();

        System.out.println("读取内容 = " + s);



        //关流
        br.close();


    }
}
