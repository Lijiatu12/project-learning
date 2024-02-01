package String;

public class String03 {
    public static void main(String[] args) {


        new String03exercise01().method01();


        String04exercise01 String0401 = new String04exercise01();
        String03exercise01 String0402 = new String03exercise01();
        System.out.println(String0401.equals(String0402));

        //什么时候会有两个对象的内存地址是一样的呢？

        new String03exercise01().method02();
    }
}




class String03exercise01{
    public  void method01(){



        Double x = 2.0;
        Double y = 3.0;
        System.out.println(x.equals(y));



    }
    public void method02(){
        String a ="abc";
        String b = "abc";
        System.out.println(a.equals(b));



        System.out.println(a.equals(b.intern()));
    }
}