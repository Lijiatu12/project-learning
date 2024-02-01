package InputStream.ObjectInputStream;

import OutputStream.ObjectOutputStream.Dog;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectInputStream01 {

    public static void main(String[] args) throws Exception {


        //ObjectInputStream的需求：：用于序列化serializable、externalizable与反序列化
        String filepath = "D:\\Program development\\JAVA基础\\JAVASE\\IO\\OutputStream\\ObjectOutputStream\\data.dat ";


        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filepath));





        //反序列化必须和你保存数据(序列化）保持一致

        System.out.println(ois.readInt());
        System.out.println(ois.readBoolean());
        System.out.println(ois.readChar());
        System.out.println(ois.readDouble());
        System.out.println(ois.readUTF());



        //dog的编译类型 Object  dog的运行类型时  Dog

        Object dog= ois.readObject();
        System.out.println("运行类型" + dog.getClass());

        System.out.println("狗的信息" + dog);// tostring到底有什么用


       Dog  dog2 = (Dog) dog;


        System.out.println(dog2.getName());

        //避免资源浪费，关闭外层流
        ois.close();


    }


}

         // 看不懂  继续看



