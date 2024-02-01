package Reader.FileReader;

import java.io.FileReader;
import java.io.IOException;

 class FileReader01 {
    public static void main(String[] args) {


        String filepath = "D:\\Program development\\JAVA基础\\JAVASE\\Input Output Stream\\Reader\\story.txt";


         FileReader fileReader = null;

         int data = 0;


        try {
          fileReader = new FileReader(filepath);

            //单字符读取

            while ((data = fileReader.read() )!= -1){

                System.out.println((char) data);

            }

        } catch (IOException e) {
           e.printStackTrace();

        } finally {
            if (fileReader != null) {

                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }



        }


    }


}
