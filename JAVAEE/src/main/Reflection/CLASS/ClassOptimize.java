package CLASS;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ClassOptimize {
    public static void main(String[] args) {



    }

    //反射调用优化 + 关闭访问检查
    public  static void m2() throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {

        Class cls = Class.forName("CLASS.CLASSComparion") ;


        Object o = cls.newInstance();

        Method hi = cls.getMethod("AA");

        hi.setAccessible(true);          //取消访问检查

        long start = System.currentTimeMillis();
        for (int i = 0; i < 90000000; i++) {

            hi.invoke(o);
        }

        long end = System.currentTimeMillis();

        System.out.println("m2（）调用 hi   耗时=" + (end -  start));
    }
}
