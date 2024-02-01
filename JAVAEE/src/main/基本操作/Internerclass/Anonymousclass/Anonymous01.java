package Internerclass.Anonymousclass;

public class Anonymous01 {


    public static void main(String[] args) {

        outerAnonymous01 outerAnonymous01 = new outerAnonymous01();
        outerAnonymous01.method();
    }
}


class outerAnonymous01{


    private int  n1 =10;


        public void method() {
        IA tiger = new tiger();



        tiger.cry();

    }
}

interface  IA{

    public void cry();

}
class tiger  implements IA{
    @Override
    public void cry() {
        System.out.println("老虎叫唤....");
    }
}








