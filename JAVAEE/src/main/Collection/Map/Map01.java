package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"all"})
public class Map01 {
    public static void main(String[] args) {

        Map map = new HashMap();


        person person01 = new person("hanxun",18);
        map.put("no1","hsp");
        map.put("no2","xiaoming");
        map.put("no1","xiaozhang");
        map.put("no3","xiaozhang");
        map.put(null,null);
        map.put(null,"abc");
        map.put(1,1);
        map.put(person01,"金毛狮王");

        map.put(new Object(),"张无忌");

        //System.out.println(map);
        System.out.println(map.get(person01));



        System.out.println(map.get(new Object()));


    }
}
class person{
    private String name;
    private  int old;

    public person(String name, int old) {
        this.name = name;
        this.old = old;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOld() {
        return old;
    }

    public void setOld(int old) {
        this.old = old;
    }
}
