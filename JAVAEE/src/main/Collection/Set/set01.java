package Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;



@SuppressWarnings({"all"})
public class set01 {
    public static void main(String[] args) {

        Set set = new HashSet();

        set.add("john");
        set.add("lucy");
        set.add("john");
        set.add("jack");
        set.add(null);
        set.add(null);
        for (int i = 0; i < 10; i++) {
            System.out.println(set);
        }


        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);

        }

        for (Object object : set) {
            System.out.println(object);

        }


    }
}
