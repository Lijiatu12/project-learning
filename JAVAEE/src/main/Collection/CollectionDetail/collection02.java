package CollectionDetail;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

class collection02 {

    public static void main(String[] args) {


        @SuppressWarnings({"all"})
        Collection collection = new ArrayList();


        collection.add(new Book("三国演义","罗贯中",10.1));
        collection.add(new Book("小李飞刀","古龙",5.1));
        collection.add(new Book("红楼梦","曹雪芹",34.6));


        Iterator iterator = collection.iterator();
        while (iterator.hasNext()){

            Object obj= iterator.next();
            System.out.println("obj"  +  obj);//注意编译类型与运行类型

        }
        //iterator.next(); 会报异常



        //重置迭代器，来进行遍历
        iterator = collection.iterator();
        while (iterator.hasNext()){

            Object obj= iterator.next();
            System.out.println("obj"  +  obj);//注意编译类型与运行类型

        }

        //使用itit快速生成while循环
        //ctrl   + j查询快捷键



    }
}

class Book
{
    private  String name;
    private  String auther;

    private double price;


    public Book(String name, String auther, double price) {

        this.name = name;
        this.auther = auther;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuther() {
        return auther;
    }

    public void setAuther(String auther) {
        this.auther = auther;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "collection.Book{" +
                "name='" + name + '\'' +
                ", auther='" + auther + '\'' +
                ", price=" + price +
                '}';
    }
}
