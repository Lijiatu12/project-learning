package Set;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
@SuppressWarnings({"all"})
public class LinkedHashSet01 {
    public static void main(String[] args) {

    Set linkedHashSet01 = new LinkedHashSet();
    linkedHashSet01.add(new String("AA"));
    linkedHashSet01.add(456);
    linkedHashSet01.add(456);
    linkedHashSet01.add(new Customer("刘",1001) );
    linkedHashSet01.add(123);
    linkedHashSet01.add("hsp");
       // LinkedHashMap linkedHashMap = new LinkedHashMap();

        System.out.println(linkedHashSet01);
        System.out.println(linkedHashSet01.size());

    }
}
class Customer{

    private String name;
    private int no ;

    public Customer(String name, int no) {
        this.name = name;
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }
}