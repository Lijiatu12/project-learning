package Reader.FileReader;

import java.io.FileReader;
import java.io.IOException;

class FileReader02 {
    public static void main(String[] args) {


        String filepath = "D:\\Program development\\JAVA基础\\JAVASE\\Input Output Stream\\Reader\\story.txt";


        FileReader fileReader = null;

      int readlen = 0;

      char[] buf = new char[8];



        try {
            fileReader = new FileReader(filepath);

            //实际读取到的字符数

            while ((readlen= fileReader.read(buf) )!= -1){

                System.out.println( new String(buf,0,readlen));

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
