package Map;

import java.util.HashMap;
import java.util.Set;

@SuppressWarnings({"all"})
public class Map02 {
    public static void main(String[] args) {
        HashMap map = new HashMap();

        map.put("no1" , "hsp");
        map.put("no2","张无忌");


        Set set = map.entrySet();
        System.out.println(set.getClass());
        for (Object entry : set) {

        }

    }
}
