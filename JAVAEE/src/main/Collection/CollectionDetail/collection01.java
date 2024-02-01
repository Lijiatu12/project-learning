package CollectionDetail;

import java.util.ArrayList;
import java.util.List;

 class collection01 {
    public static void main(String[] args) {

        @SuppressWarnings({"all"})
        List list = new ArrayList();
        list.add("JACK");
        list.add(10);
        list.add(true);
        System.out.println("list =" +list);


        list.remove(0);
        list.remove(true);
        System.out.println("lsit =" + list);

        System.out.println(list.contains("jack"));


        ArrayList list2= new ArrayList();
        list2.add("红楼梦");
        list2.add("三国演义");

        list.addAll(list2);


        System.out.println(list);
        System.out.println(list.containsAll(list2));





    }
}
