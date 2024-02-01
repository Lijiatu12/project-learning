package BufferedWriter;

import org.junit.Test;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferedWriter01 {

    public static void main(String[] args) throws Exception {


        String  filepath = "D:\\Program development\\JAVA基础\\JAVASE\\Input Output Stream\\Writer\\BufferedWriter\\ok.txt ";

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filepath));

        bufferedWriter.write("hello,韩顺平教育！");
        bufferedWriter.newLine();
        bufferedWriter.write("hello2,韩顺平教育！");
        bufferedWriter.newLine();
        bufferedWriter.write("hello3,韩顺平教育！");
        bufferedWriter.newLine();

        //关闭外层流即可，传入的  new FileWriter(filePath) ,会在底层关闭
        bufferedWriter.close();



    }


@Test
        //实现追加
    public  void supplement() throws Exception{
        String  filepath = "D:\\Program development\\JAVA基础\\JAVASE\\Input Output Stream\\Writer\\BufferedWriter\\ok.txt ";

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filepath,true));

        bufferedWriter.write("hello,韩顺平教育！");
        bufferedWriter.newLine();
        bufferedWriter.write("hello2,韩顺平教育！");
        bufferedWriter.newLine();
        bufferedWriter.write("hello3,韩顺平教育！");
        bufferedWriter.newLine();

        //关闭外层流即可，传入的  new FileWriter(filePath) ,会在底层关闭
        bufferedWriter.close();

    }
    }




