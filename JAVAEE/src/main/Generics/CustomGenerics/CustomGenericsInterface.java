package CustomGenerics;

public class CustomGenericsInterface {
    public static void main(String[] args) {


    }
}

interface IUSB<U,R>{
    int n = 10;

   // U name = "hsp";
    R  get(U u);
    void hi(R r);
    void run(R r1,R r2,U u1,U u2);

    default R method( U u){
        return  null;
    }
}
 //继承接口时
interface IA extends  IUSB<String,Double>{

}
class AA implements  IA{

    @Override
    public Double get(String s) {
        return null;
    }

    @Override
    public void hi(Double aDouble) {

    }

    @Override
    public void run(Double r1, Double r2, String u1, String u2) {

    }

    @Override
    public Double method(String s) {
        return IA.super.method(s);
    }
}
//实现接口
class BB implements  IUSB<Integer,Float>{
    @Override
    public Float get(Integer integer) {
        return null;
    }

    @Override
    public void hi(Float aFloat) {

    }

    @Override
    public void run(Float r1, Float r2, Integer u1, Integer u2) {

    }

    @Override
    public Float method(Integer integer) {
        return IUSB.super.method(integer);
    }
}