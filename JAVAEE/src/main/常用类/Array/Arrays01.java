package Array;

import java.util.Arrays;


 class Arrays01 {
    public static void main(String[] args) {

        //因为int  s是引用类型，所以会影响到实参
        Integer[] integers = {1, 20, 90};
        System.out.println(Arrays.toString(integers));



//自定义排序

        Integer[] integers1 = {1, -1, 7, 0, 89};
        Arrays.sort(integers1);

        System.out.println(Arrays.toString(integers1));


//定制排序   new Comparator()接口的匿名内部类 ，实现compare方法
// integers1排序数组
    }}
