package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class list02
{
    @SuppressWarnings({"all"})
    public static void main(String[] args) {

       // List list = new ArrayList();
        List list = new Vector();
        list.add("jack");
        list.add("tom");
        list.add("marry");
        list.add("hsp");
        list.add("tom");

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object object =  iterator.next();
            System.out.println(object);
        }

        System.out.println("============= ");
        for (Object object : list) {
            System.out.println("object=" + object);
            
        }


        System.out.println("==================================");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("对象 =" + list.get(i));

        }

    }
}
