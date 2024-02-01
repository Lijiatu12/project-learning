

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;


@SuppressWarnings({"all"})

public class IOStreamFileDirectory_ {

    public static void main(String[] args) {

    }


    public IOStreamFileDirectory_() {
    }

    @Test
    public  void   m1() {




        String filepath = "D:\\Program development\\JAVA基础\\JAVASE\\Input Output Stream\\IOStreamDetail\\ news1.txt";

        File file = new File(filepath);

        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }


        if (file.exists()) {
            if (file.delete()) {
                System.out.println(filepath + " 删除成功");
            } else {
                System.out.println(filepath + "删除失败");
            }

        } else {
            System.out.println("该文件不存在");


        }
    }

@Test
public  void   m2() {


    String directoryPath = "D:\\Program development\\JAVA基础\\JAVASE\\Input Output Stream\\IOStreamDetail\\demo02\\a\\b\\c";

    File file = new File(directoryPath);



//mkdirs()与mkdir的区别


    if (file.exists()) {
        System.out.println(directoryPath + "存在");
        } else {
           if(file.mkdirs()){
               System.out.println(directoryPath + "创建成功");

        }else {
               System.out.println(directoryPath + "创建失败...");
           }

    }
}}


