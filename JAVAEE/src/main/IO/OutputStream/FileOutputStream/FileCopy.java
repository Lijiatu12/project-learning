package OutputStream.FileOutputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

    public static void main(String[] args) {

     //文件从d盘到c盘，过程是读取部分数据，就写入到指定文件，其中使用循环的方法


        String Srcfilepath = "D:\\Program development\\JAVA基础\\JAVASE\\Input Output Stream\\OutputStream\\fengjing.webp";
        String  FileCopy = "F:\\fengjing2.webp";

        FileInputStream  fileInputStream = null;
        FileOutputStream fileOutputStream = null;


        try {
            fileInputStream = new FileInputStream(Srcfilepath);
            fileOutputStream= new FileOutputStream(FileCopy);

            byte[] buf  = new byte[2048];
            int readlen = 0;
            while ((readlen = fileInputStream.read(buf)) != -1){

                fileOutputStream.write(buf,0,readlen);
            }
            System.out.println("拷贝成功");

        } catch (IOException e) {
         e.printStackTrace();
        } finally {
            try {

                //关闭输入流  输出流  释放内存
                if (fileInputStream != null) {
                    fileInputStream.close();

                }
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }


    }
}
