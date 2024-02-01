package BufferedCopy;

import java.io.*;
@SuppressWarnings({"all"})
public class BufferedCopy {

    public static void main(String[] args) {

        //BufferedReader、BufferedWriter是安装字符操作 不要去操作二进制文件，可能会造成文件损坏
String srcFilePath = "D:\\Program development\\JAVA基础\\JAVASE\\Input Output Stream\\Writer\\BufferedWriter\\BufferedWriter01.java";

String  destFilePath = "D:\\Program development\\JAVA基础\\JAVASE\\Input Output Stream\\Writer\\BufferedCopy\\BufferedWriterreplica.java";


BufferedReader br = null;
BufferedWriter bw = null;
String line;


        try {

            br = new BufferedReader(new FileReader(srcFilePath));
            bw = new BufferedWriter(new FileWriter(destFilePath));


            //readline读取一行内容，但是没有换行
            while ((line = br.readLine()) != null ){


                //每读取一行，就写入
                bw.write(line);

                bw.newLine();


            }

            System.out.println("拷贝完毕");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {
                if (br != null) {
                    br.close();
                }
                if (bw == null) {
                    bw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
            }


        }
    }
}
