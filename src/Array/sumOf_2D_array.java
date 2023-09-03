package Array;

import java.sql.SQLOutput;

public class sumOf_2D_array {
    public static void main(String[] args){
        int[][] arr = new int[5][6];
        //set
        arr[1][3] = 10;

        //get
        System.out.println(arr[1][3]);
        System.out.println(arr[1][4]);

        //row count
        System.out.println(arr.length);

        //col count
        System.out.println(arr[0].length);

        //traversal
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.println(i);
            }
        }
    }
}
