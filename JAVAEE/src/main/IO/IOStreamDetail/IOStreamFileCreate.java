

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
@SuppressWarnings({"all"})
public class IOStreamFileCreate {


    public static void main(String[] args) {


}


// 根据路径构建一个file 对象

@Test
public  void create01(){

        String filepath = "D:\\Program development\\JAVA基础\\JAVASE\\Input Output Stream\\IOStreamDetail\\news1.txt";
        File file = new File(filepath);           //为什么会有IO异常
        try {
            file.createNewFile();
            System.out.println("文件创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }



    //真正的过程呈现：  父目录 + 子路径构建
    @Test
public  void create02(){
    File parentfile = new File("D:\\Program development\\JAVA基础\\JAVASE\\Input Output Stream\\IOStreamDetail\\");
    String filename = "news2.txt";
    File file = new File(parentfile, filename); //这里file是内存中，而不是硬盘中

    try {
        file.createNewFile();
        System.out.println("文件创建成功");
    } catch (IOException e) {
       e.printStackTrace();
    }



}


//第三个方法:父目录 + 子路构建
    @Test
public  void create03(){
        String parentPath = "D:\\Program development\\JAVA基础\\JAVASE\\Input Output Stream\\IOStreamDetail\\";
        String fileName = "news3.txt";
    File file = new File(parentPath, fileName);

    try {
        file.createNewFile();
        System.out.println("创建成功");
    } catch (IOException e) {
        e.printStackTrace();
    }


}

}


