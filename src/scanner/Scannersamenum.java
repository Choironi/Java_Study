package scanner;

import java.util.Scanner;

public class Scannersamenum {
    public static void main(String agrs[]) {

        int i;

        System.out.println("2자리수 정수 입력(10~99)>>");
        Scanner scan = new Scanner(System.in);
        i = scan.nextInt();

        if (i % 11 == 0){ //십의자리와 일의자리가 같다면 11의 배수.
            System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
        } else
            System.out.println("No! 10의 자리와 1의 자리가 다릅니다.");
        }
    }

