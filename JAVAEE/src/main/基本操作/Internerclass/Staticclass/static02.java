package Internerclass.Staticclass;
@SuppressWarnings({"all"})
public class static02 {
    public static void main(String[] args) {
        outerstatic02.innnerstatic02 innnerstatic02 = new outerstatic02.innnerstatic02();

        System.out.println("调用类要有statci方法");
        innnerstatic02.say();

        outerstatic02 outerstatic02 = new outerstatic02();
        outerstatic02.show();


        System.out.println("================");

        System.out.println("内部类返回方法");

        outerstatic02.innnerstatic02 getinnerstatic02 = outerstatic02.getinnerstatic02();

        getinnerstatic02.say();

    }

 static  class outerstatic02 {
    private int n1 = 10;
    private static String name = "张三";

    private static class innnerstatic02 {

        public void say() {

            System.out.println(name);


        }

    }
        public static void show() {
            innnerstatic02 innnerstatic02 = new innnerstatic02();
            innnerstatic02.say();

        }

    public static innnerstatic02 getinnerstatic02() {


        return new innnerstatic02();

    }

}}

