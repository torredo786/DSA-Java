import java.util.*;
public class Array_Recap {
    public static void main(String[] args) {
        System.out.println("Hello and welcome Saif!");

        int[] arr = {5,6,7,8,9};

        System.out.println(Arrays.toString(arr));
        System.out.println(arr.length);
        System.out.println(arr[2]);
        arr[2]= 30;
        System.out.println(Arrays.toString(arr));
        for(int i=0; i<arr.length;i++){
            System.out.println(i);
        }
    }
}
