import java.util.Scanner;

public class Calculator {
    public static void main(String args[]) {

        String sign;
        int x;
        int y;
        int answer;

        Scanner scan = new Scanner(System.in);
        System.out.println("연산>>");
        x = scan.nextInt();
        sign = scan.next();
        y = scan.nextInt();

        if (sign.equals("+")) {
            answer = x + y;
        } else if (sign.equals("-")) {
            answer = x - y;
        } else if (sign.equals("*")) {
            answer = x * y;
        } else if (sign.equals("%")) {
            System.out.println("");
        } else {
            System.out.println("연산부호를 잘못 입력하셨습니다.");
            scan.close();
        }
    }
}


