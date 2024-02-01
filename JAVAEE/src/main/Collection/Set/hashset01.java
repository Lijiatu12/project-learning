package Set;

import java.util.HashSet;
import java.util.Set;

public class hashset01 {
    public static void main(String[] args) {

        Set hashSet = new HashSet();
        hashSet.add(null);
        hashSet.add(null);
        hashSet.add(new Dogs("tom"));
        hashSet.add(new Dogs("tom"));
        hashSet.add(new String("hsp"));
        hashSet.add(new String("hsp"));




        System.out.println(hashSet);

        //hashSet = new HashSet();



    }
}
class Dogs{
    private String name;

    public Dogs(String name) {
        this.name = name;
    }
}
