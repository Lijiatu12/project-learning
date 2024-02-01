package Anonymousclass;

public class Anonymous02 {



        public static void main(String[] args) {



            outerAnonymous02 outerAnonymous02 = new outerAnonymous02();
            outerAnonymous02.method();



        }
    }

    class outerAnonymous02{


        private int  n1 =10;

        public void method() {

            father01 father01 = new father01("jack"){
                @Override
                public void test() {
                    System.out.println("匿名内部类重写了test方法");
                }


            };

            System.out.println(father01.getName());//调用的内部属性

            System.out.println("father01对象的运行类型="+father01.getClass());

            father01.test();



            animal animal =new animal(){
                @Override
                void eat() {
                    System.out.println("小狗吃骨头...");
                }

            };
            animal.eat();
        }
    }

    class father01{
        private String name ="tom";

        public father01(String name){
            System.out.println("name ="+name);//调用的外部参数

        }

        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void test() {

        }


    }
    abstract class animal{
        abstract void eat();
    }


