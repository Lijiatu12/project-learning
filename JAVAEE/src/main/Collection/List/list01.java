package List;

import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class list01
{
    @SuppressWarnings({"all"})
    public static void main(String[] args) {

        List list = new ArrayList();
       //支持重复
        list.add("jack");
        list.add("tom");
        list.add("marry");
        list.add("hsp");
        list.add("tom");

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);

        }
          //支持顺序索引
        System.out.println(list.get(3));
        //定点插入
        list.add(1,"hsp");
        System.out.println(list);

        //多元素定点插入
        List list2 = new ArrayList();
        list2.add("xiaoming");
        list2.add("xiaohong");
        list.add(1,list2);
        System.out.println(list);


    }
}
