package Internerclass.Anonymousclass;

public class Anonymous03 {

    public static void main(String[] args) {

        System.out.println("接口做匿名内部类对象时===============");


        outerAnonymous03 outerAnonymous03 = new outerAnonymous03();
        outerAnonymous03.method();

    }
}



class outerAnonymous03{

    private int i =20;
    public void method(){//运行类型即是接口 IB，编译类型在计算机底层
        IB tiger = new IB(){

            @Override
            public void cry() {
                System.out.println("老虎叫唤.....");
            }
        };
        tiger.cry();   //匿名内部类只能用一次，但是对象可以用无数次
        //动他绑定机制
        System.out.println("tiger的运行类型是" +tiger.getClass());
    }


}

interface  IB{

    public void cry();

}
