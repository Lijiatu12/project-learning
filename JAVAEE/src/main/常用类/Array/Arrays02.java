package Array;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays02 {
    public static void main(String[] args) {
        /*Integer[] integers= {1, -1, 7, 0, 89};

        Arrays.sort(integers, new Comparator(){

            @Override
            public int compare(Object o1, Object o2) {

                int i1 = (Integer) o1;
                int i2 = (Integer) o2;
                return i2 - i1;
            }

        });
        System.out.println(Arrays.toString(integers));*/

                  //深度理解版

        int[]  arr = {1,-1,8,0,20 };


        bubble01(arr, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {

                int i1 = (Integer) o1;
                int i2 = (Integer) o2;
                return i2-i1;
            }
            }
        );


        System.out.println(Arrays.toString(arr));

    }
public static void  bubble01(int[] arr,Comparator c ) {
    int temp = 0;
    for (int i = 0; i < arr.length - 1; i++) {

        for (int j = 0; j < arr.length - 1 - i; j++) {
            if (c.compare(arr[j], arr[j + 1]) > 0) {
                temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }

    }
}}
































