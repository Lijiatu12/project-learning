package String;

public class String01 {
    public static void main(String[] args) {
     String s = "hsp";
     /*栈空间的s先从常量池查看有没有hsp  如果有直接指向   如果没有，创建再指向，
     s最终指向那个常量池的空间地址*/

     String s2 = new String("hsp");
     /*
     堆中创建空间，里面有value属性，指向那个常量池的hsp，池中如果没有hsp，创建再指向，如果有直接指向，
     栈空间的s2最终指向堆中的空间地址
      */



    }


}
