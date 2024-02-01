
package Wrapperclass;

public class Wrapperclass02 {


    public static void main(String[] args) {

        String str4 = "12345";

        //  parseInt()可以解析一个字符串，并返回一个整数基本类型
        int i2 = Integer.parseInt(str4);
        //  valueOf可以解析一个字符串，并返回一个整数对象类型
        Integer i3 = Integer.valueOf(str4);

        System.out.println("ok····");
        System.out.println(i2);
        System.out.println(i3.toString());


        //包装类===string
        Integer i = 100;
        String str1 = i + " ";
        String str2 = i.toString();
        String str3 = String.valueOf(i);

        Person person = new Person("小明", 18);
        System.out.println(person.toString());


    }


}
class  Person

{

    private String name;
    private int old;

    public Person(String name, int old) {
        this.name = name;
        this.old = old;

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", old=" + old +
                '}';
    }
}

