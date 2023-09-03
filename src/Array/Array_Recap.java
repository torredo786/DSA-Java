package Array;

import java.util.*;
public class Array_Recap {
    public static void main(String[] args) {
        System.out.println("Hello and welcome Saif!");

        //Array with initial value (size determined automatically)
        int[] arr = {5,6,7,8,9};

        //Empty array with size = 5 . initially all values are 0.
        int[] arr2 = new int[5];

        System.out.println(Arrays.toString(arr));
        System.out.println(arr.length);
        System.out.println(arr[2]);
        arr[2]= 30;
        System.out.println(Arrays.toString(arr));
        for(int i=0; i<arr.length;i++){
            System.out.print(i); //"print" will give output in 1 line unlike println.
        }
    }
}
