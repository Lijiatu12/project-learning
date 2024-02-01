package Wrapperclass;

public class Wrapperclass01 {
    public static void main(String[] args) {


        //手动装箱
       /*int n1 =100;
        Integer integer = new Integer(n1);
        Integer Integer = Integer.valueOf(n1);
        */

     // 手动拆箱
        /*int i = integer.intValue();*/

        int n2 =200;
        //自动装箱
        Integer integer2 = n2;
        //手动装箱
        int n3= integer2;


    }
}

