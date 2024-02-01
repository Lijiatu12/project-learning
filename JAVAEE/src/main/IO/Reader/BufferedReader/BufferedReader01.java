package BufferedReader;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReader01 {

    public static void main(String[] args) throws  Exception{

String filepath = "D:\\Program development\\JAVA基础\\JAVASE\\基本操作\\Internerclass\\Anonymousclass\\Anonymous01.java ";

        BufferedReader bufferedReader = new BufferedReader(new FileReader(filepath));

        String line;//按行读取，效率高

        while ((line = bufferedReader.readLine()) != null){

            System.out.println(line);

        }


        //关闭节点流
        bufferedReader.close();

    }
}
