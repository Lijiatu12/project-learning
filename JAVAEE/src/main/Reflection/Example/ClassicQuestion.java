package Example;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class ClassicQuestion {
    public static void main(String[] args) {
        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream("D:\\Program development\\The Road to JAVA\\JAVASE\\Reflection\\Example\\re.properties"));

            String classfullpath = properties.get("classfullpath").toString();
            String methodName = properties.get("method").toString();

            System.out.println("classpath: " + classfullpath);
            System.out.println("method: " + methodName);

            // 加载类，返回Class类型的对象
            Class<?> cls = Class.forName(classfullpath);
            // 创建类的实例
            Object o = cls.newInstance();

            // 获取方法对象
            Method method1 = cls.getMethod(methodName);

            System.out.println("===============================");

            // 反射调用方法
            method1.invoke(o);
        } catch (IOException | ClassNotFoundException | InstantiationException | NoSuchMethodException | IllegalAccessException |
                 InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
