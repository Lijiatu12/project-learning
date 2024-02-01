package CollectionDetail;

import java.util.ArrayList;
import java.util.Collection;

public class collection03 {


    public static void main(String[] args) {

        @SuppressWarnings({"all"})

        Collection collection = new ArrayList();


        collection.add(new Book("三国演义","罗贯中",10.1));
        collection.add(new Book("小李飞刀","古龙",5.1));
        collection.add(new Book("红楼梦","曹雪芹",34.6));



        //增强for循环:集合  数组都可以使用    本质是迭代器遍历的简化版   快捷键  I


        for ( Object book : collection){

            System.out.println("book" + book);

        }


    }
}
