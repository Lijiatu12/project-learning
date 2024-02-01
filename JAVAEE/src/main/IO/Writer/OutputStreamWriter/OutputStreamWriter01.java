package Writer.OutputStreamWriter;

import java.io.*;

public class OutputStreamWriter01
{

    public static void main(String[] args) throws Exception {


        String FilePath = "D:\\Program development\\JAVA基础\\JAVASE\\IO\\OutputStream\\FileOutputStream\\a.txt";

        String charset = "utf-8";
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(FilePath ),charset);


        osw.write("hi , 韩顺平教育");

        osw.close();


        System.out.println("按照" + charset + "保存文件成功");





    }
}
