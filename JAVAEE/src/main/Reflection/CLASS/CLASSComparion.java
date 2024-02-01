package CLASS;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class CLASSComparion {
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
m1();
m2();

    }


        //传统方法
    public  static void m1(){
        Cat cat = new Cat();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 90000000; i++) {

            cat.AA();
        }

        long end = System.currentTimeMillis();

        System.out.println("传统方法来调用 hi   耗时=" + (end -  start));
    }


     //反射机制
    public  static void m2() throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {

        Class cls = Class.forName("CLASS.Cat") ;


        Object o = cls.newInstance();

        Method hi = cls.getMethod("AA");



        long start = System.currentTimeMillis();
        for (int i = 0; i < 90000000; i++) {

          hi.invoke(o);
        }

        long end = System.currentTimeMillis();

        System.out.println("m2（）调用 hi   耗时=" + (end -  start));
    }
}


