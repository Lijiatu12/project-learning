package Writer.FileWriter;


import java.io.FileWriter;
import java.io.IOException;

@SuppressWarnings({"all"})
public class FileWriter01 {
    public static void main(String[] args) {

        String  filepath = "D:\\Program development\\JAVA基础\\JAVASE\\Input Output Stream\\Writer\\note.txt";

        FileWriter fileWriter = null;


        char[] chars = {'a','b','c'};     //追加写法

        try {
            fileWriter = new FileWriter(filepath);


            fileWriter.write('H');

            fileWriter.write(chars);

            fileWriter.write("韩顺平教育".toCharArray(),0,3);

            fileWriter.write("你好  北京~");

            fileWriter.write("上海天津",0,2);

            fileWriter.write("风雨之后，定见彩虹");

        } catch (Exception e) {
           e.printStackTrace();
        } finally {

            try {
                fileWriter.flush();
                //fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        System.out.println("程序结束");


    }
}
