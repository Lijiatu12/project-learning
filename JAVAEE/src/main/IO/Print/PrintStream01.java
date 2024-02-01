package Print;


import java.io.IOException;
import java.io.PrintStream;

public class PrintStream01  {
    public static void main(String[] args) throws IOException {

        PrintStream out = System.out;


       //  PrintStream输出数据的位置是标准输出，即显示器
        out.println("john , hello");
        out.write("韩顺平，你好".getBytes());

        out.close();
        //改变输出流的位置或者设备

        System.setOut(new PrintStream("D:\\Program development\\JAVA基础\\JAVASE\\IO\\Print\\F1.txt"));
        System.out.println("hello ， 韩顺平教育~");

    }
}
