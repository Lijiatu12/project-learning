package OutputStream.ObjectOutputStream;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;


         // 序列化对象

public class ObjectOutputStream01 {

    public static void main(String[] args) throws Exception {

        String filepath = "D:\\Program development\\JAVA基础\\JAVASE\\IO\\OutputStream\\ObjectOutputStream\\data.dat ";

        ObjectOutputStream oos= new ObjectOutputStream (new FileOutputStream(filepath));



        //自动装箱
         oos.writeInt(100);

         oos.writeBoolean(true);

         oos.writeChar('a');

         oos.writeDouble(9.5);

         oos.writeUTF("韩顺平教育");

         oos.writeObject(new Dog("旺财",10,"日本","白色"));



         oos.close();
        System.out.println("数据以序列化形式保存完毕");

    }}



