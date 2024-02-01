
package Wrapperclass;

public class Wrapperclass04 {
    public static void main(String[] args) {
        Integer x=1;
        Double y = 2.0;
        Object obj1 = true?  x: y;
        System.out.println(obj1);



        Object obj2;
        if (true){
            Integer j = 1;
            obj2 = j;}
        else{
            Double k = 2.0;
            obj2 = k;}

        System.out.println(obj2);
    }
}