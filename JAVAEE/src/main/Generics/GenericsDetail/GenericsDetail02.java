package GenericsDetail;


import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"all"})
public class GenericsDetail02 {
    public static void main(String[] args) {
        //第一种方法
        A a1 ;
        a1= new A("jack");

        Pig<A> aPig1;
        aPig1 = new Pig<>(a1);


        A a =    aPig1.getE();      //重新学习编译类型    运行类型     返回值方法的使用；
        System.out.println(a.getName());



        //另一种方法
        Pig<A> a2;
        a2= new Pig<>(new A("rose"));
        A a4= a2.getE();
        System.out.println(a4.getName());

        Pig<A> aPig2;
        aPig2= new Pig<>(new B("tom"));
        aPig2.f();

    }
}
class A{
    private String name;

    public A(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
class B extends A{
    public B(String name) {
        super(name);
    }
}
class Pig<E>{
    E e;

    public Pig(E e) {
        this.e = e;
    }

    public E getE() {
        return e;
    }

    public void setE(E e) {
        this.e = e;
    }
    public  void f(){
        System.out.println(e.getClass());
    }
}