package 特殊性质.Final;

public class fianl03 {
    public static void main(String[] args) {

        new DD().method();
        System.out.println(EE.n3);

    }
}
class CC{
    final public  void method(){
        System.out.println("CC的method方法被继承了");

    }

}
class DD extends
        CC{

}



class EE {
    public final static int n3 = 1000;

    static {
        System.out.println("DD的静态代码块不会被执行");

    }
}