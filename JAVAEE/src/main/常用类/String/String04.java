package String;

public class String04 {
    public static void main(String[] args) {



       // new String04exercise01().method01();
        new String04exercise01().method03();



       // 变量相加  是在堆中常量相加在常量池
    }
}

class String04exercise01{
    public  void method01(){

        String a ="abc";
        String b ="abc";
        System.out.println(a == b);


        String c = new String();
        String d= new String();
        System.out.println(c == d);


    }
    public  void  method02(){
        int a = 1;
        int b = 1;
        System.out.println(a ==b);
    }

    public void method03(){


        String a ="abc";
        String b ="abc";

        String c = a + b;
        String d = "abc"+ "abc";

        System.out.println(c ==(a+b));

        System.out.println(d ==("abcabc"));


    }

}

