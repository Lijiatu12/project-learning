package Internerclass.Staticclass;

public class static01 {
    public static void main(String[] args) {



        System.out.println("当静态内部类是公有的时候");

        outerstatic01.innnerstatic01 innnerstatic0101 = new outerstatic01.innnerstatic01();
        innnerstatic0101.say();

    }

}
class  outerstatic01{

    private int n1 = 10;
    private static String name = "张三";

    public static class innnerstatic01{

        public void say(){

            System.out.println(name);


        }

    }




}
