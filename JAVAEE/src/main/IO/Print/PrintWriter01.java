package Print;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

@SuppressWarnings({"all"})
public class PrintWriter01 {
    public static void main(String[] args) throws IOException {


       // PrintWriter printWriter = new PrintWriter(System.out);
        PrintWriter printWriter = new PrintWriter(new FileWriter("D:\\Program development\\JAVA基础\\JAVASE\\IO\\Print\\F2.txt"));


        printWriter.println("hi，北京你好");
        printWriter.close();

    }
}
