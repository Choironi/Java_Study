package scanner;

import java.util.Scanner;

public class Scannercircle {
    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);

        System.out.println(" 원의 중심과 반지름 입력>> ");
        int x = scan.nextInt();
        int y = scan.nextInt();
        double r = scan.nextDouble();
        System.out.println(" 점 입력>> ");
        double a = scan.nextInt();
        double b = scan.nextInt();
        if ((x-a)*(x-a)+(y-a)*(y-a)<r*r){
            System.out.println("점" + a + "와" + b + "는" + "원 안에 존재합니다.");
        }else
            System.out.println("원 안에 존재하지 않습니다");
        scan.close();
        }
}
