

public class Anonymous04 {
    public static void main(String[] args) {


        outerAnonymous04 outerAnonymous04 = new outerAnonymous04();
        outerAnonymous04.method();

    }
}


class outerAnonymous04 {
    private  int i =99;
    public void method() {


        new person(){


            //无需对象直接写===体现本质
            @Override
            public void hi() {
                System.out.println("匿名内部类重写了hi方法....");
                System.out.println("可以访问私有属性n1" + i);
            }

            @Override
            public void ok(String str) {
                super.ok(str);

            }


        }.ok("jack");



        System.out.println("对象做匿名内部类时，不同的调用方法============");



        //有对象才能分开写
        person person = new person() {

            @Override
            public void hi() {
                System.out.println("匿名内部类重写了hi方法....");
                System.out.println("可以访问私有属性n1" + i);
            }
            @Override
            public void ok(String str) {
                super.ok(str);

            }


        };
        person.hi();
        person.ok("jack");

    }
}
class person{
    public void hi(){

        System.out.println("person hi()");

    }

    public void ok(String str){
        System.out.println("ok()" + str);

    }


}