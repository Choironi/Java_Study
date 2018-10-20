package yj;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {7,5,2,10,1};

//        int result = 0; // 7, 5 ,2

        // 최소 값
//        for(int i = 0 ; i < arr.length ; i++){
//            if(i == 0 || result < arr[i]){
//                result = arr[i];
//            }
//        }
        for(int i : arr) System.out.println(i); //1

        Arrays.sort(arr);
        System.out.println("-----------------");
        for(int i : arr) System.out.println(i); //2

        System.out.println(arr[0]); // 최솟값
        System.out.println(arr[arr.length-1]); // 최대값

    }
}
