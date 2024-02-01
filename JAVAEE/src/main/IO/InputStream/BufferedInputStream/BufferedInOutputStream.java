package InputStream.BufferedInputStream;

import java.io.*;
@SuppressWarnings({"all"})
public class BufferedInOutputStream {
    public static void main(String[] args) {

        // 字节流可以操作二进制文件，也可以操作文本文件

String srcFilePath = "D:\\Program development\\JAVA基础\\JAVASE\\Input and Output\\OutputStream\\FileOutputStream\\fengjing.webp ";

String desFilePath = "D:\\Program development\\JAVA基础\\JAVASE\\Input and Output\\InputStream\\BufferedInputStream\\fengjingreplica.webp";

        BufferedInputStream bis = null;

       BufferedOutputStream bos = null;

        try {
            bis = new BufferedInputStream(new FileInputStream(srcFilePath));

            bos = new BufferedOutputStream(new FileOutputStream(desFilePath));


            byte[] buff = new byte[1024];

            int readlen = 0;

//当返回-1时代表读取完毕
            while ((readlen = bis.read(buff)) != -1){

            bos.write(buff, 0 ,readlen);
            }
            System.out.println("文件拷贝完成");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            //关闭外层流接口
            try {
                if (bis != null) {
                    bis.close();
                }

                if (bos != null) {

                    bos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
            }

        }


    }
}
