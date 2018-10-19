package scanner;

import java.util.Scanner;

public class Scannercenter {
    public static void main(String agrs[]) {

        Scanner scan = new Scanner(System.in);
        System.out.println(" 정수 3개를 입력>>");
        int array[] = new int[3];
//        int center = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array.length - 1; j++) {
//                if (array[j] > array[j + 1]) {
//                    center = array[1];
//                    array[j] = array[j + 1];
//                    array[j + 1] = center;
//                }
//            }
//        }
//        System.out.println("중간 값은"+array[1]+"입니다");
    }
}