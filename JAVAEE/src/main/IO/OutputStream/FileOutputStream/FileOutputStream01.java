


import org.junit.Test;

import java.io.FileOutputStream;

import java.io.IOException;
@SuppressWarnings({"all"})
 class FileOutputStream01 {
    public static void main(String[] args) {

    }


            //输入字符串
    @Test
    public void writeFile() {
        String filepath = "D:\\Program development\\JAVA基础\\JAVASE\\Input Output Stream\\OutputStream\\FileOutputStream\\a.txt";
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(filepath,true );

            String content = "hello，world！";
            String string = "hanxun,加油！";


            byte[] contentInBytes = content.getBytes();


            //fileOutputStream.write(contentInBytes);
            fileOutputStream.write(string.getBytes(),0,string.length());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}