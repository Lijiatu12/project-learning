package GenericsDetail;

public class GenericsDetail03
{

    public static void main(String[] args) {

        Person<String> hspjy = new Person<String>("hspjy");
        hspjy.t();

        Person<Integer> IntegerPerson = new Person<Integer>(100);
        IntegerPerson.t();

        Dog d1 = new Dog("旺财",10);
        Person<Dog> pp1 = new Person<Dog>(d1);
        pp1.t();


    }



}
class Person<E>{

  E s;//在编译期间就已经知道是什么类型的了；
    public Person(E s) {
        this.s = s;
    }

   public E f(){
        return  s;

   }

    public E getS() {
        return s;
    }

    public void setS(E s) {
        this.s = s;
    }

    public  void  t(){
       System.out.println(s);

        System.out.println(s.getClass());
   }

}
class Dog{

    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}