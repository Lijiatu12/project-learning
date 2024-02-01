package CustomGenerics;

public class CustomGenericsMethod {
    public static void main(String[] args) {
        Car car = new Car();
        car.fly("宝马",100);
        System.out.println("============");
        car.fly(300,100.1);


    }
}
class Car{
    public  <T,R> void  fly(T t,R r){
        System.out.println(t.getClass());
        System.out.println(r.getClass());
    }
}

class Fish<T,R>{
    public  void run(){

    }
    public <U,M>  void eat(U u,M m){

    }

    public void hi(T t){

    }
    public<K> void hello(R r, K k){

    }
}

