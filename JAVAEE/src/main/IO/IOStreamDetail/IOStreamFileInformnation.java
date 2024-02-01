

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
@SuppressWarnings({"all" })

public class IOStreamFileInformnation {
    public static void main(String[] args) {


    }

@Test
    public void info(){

    File file = new File("D:\\Program development\\JAVA基础\\JAVASE\\Input Output Stream\\IOStreamDetail\\ news4.txt");
    try {
        file.createNewFile();
        System.out.println("文件创建成功");
    } catch (IOException e) {
        e.printStackTrace();
    }


    //文件名字
    System.out.println(file.getName());
    //绝对路径
    System.out.println(file.getAbsolutePath());
    //父级目录
    System.out.println(file.getParent());
    //文件字节
    System.out.println(file.length());
    //是不是一个目录
    System.out.println(file.isDirectory());




}


}
