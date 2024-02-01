

import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;

@SuppressWarnings({"all"})
 public class  FileInputStream01{
     public static void main(String[] args) {

     }



@Test         //文件输入流   由文件输入到程序
    public void FileInputStreamFile01()
    {
        String filePath = "D:\\Program development\\JAVA基础\\JAVASE\\Input Output Stream\\InputStream\\news5.txt";

        int readData = 0;
        FileInputStream fileInputStream = null;
        try
        {
          fileInputStream = new FileInputStream(filePath);

            while ((readData = fileInputStream.read()) != -1) {
                System.out.print((char) readData);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
               e.printStackTrace();
            }
        }
    }


     //使用read[byte[] b) 加快读取文件提高效率

     @Test
     public void FileInputStreamFile02()
     {
         String filePath = "D:\\Program development\\JAVA基础\\JAVASE\\Input Output Stream\\InputStream\\news5.txt";

         int readData = 0;
         byte[ ]  buf = new byte[8];
         int readlen = 0;
         FileInputStream fileInputStream = null;
         try
         {
             fileInputStream = new FileInputStream(filePath);

             while ((readlen = fileInputStream.read(buf))!= -1){
                 System.out.print(new String(buf,0,readlen));
             }
         } catch (IOException e) {
             e.printStackTrace();
         }
         finally {
             try {
                 fileInputStream.close();
             } catch (IOException e) {
                 e.printStackTrace();
             }
         }
     }
 }





