package Example;

import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Properties;

public class Reflection01 {
    public static void main(String[] args) throws  Exception{

            Properties properties = new Properties();

            properties.load(new FileInputStream("D:\\Program development\\The Road to JAVA\\JAVASE\\Reflection\\Example\\re.properties"));

            String classfullpath = properties.get("classfullpath").toString();
            String methodName = properties.get("method").toString();

            System.out.println("classpath: " + classfullpath);
            System.out.println("method: " + methodName);

            Class cls = Class.forName(classfullpath);

            Object o = cls.newInstance();

            Method method1 = cls.getMethod(methodName);


            method1.invoke(o);

        System.out.println("===================================================");

        // getfield不能获取私有的属性
        Field nameField = cls.getField("age");
        System.out.println(nameField.get(o));


        //构造器
        Constructor constructor = cls.getConstructor();
        System.out.println(constructor);



        //传入String类的对象
        Constructor constructor2 = cls.getConstructor(String.class);
        System.out.println(constructor2);


    }











}
