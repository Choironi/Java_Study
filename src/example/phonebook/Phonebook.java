package example.phonebook;

import java.util.Scanner;

public class Phonebook {
    public static void main(String[] args) {
        int num;
        Scanner scanner = new Scanner(System.in);

        System.out.print("인원수>>");
        num = scanner.nextInt();
        Phone[] information = new Phone[num];
        for (int i = 0; i < num; i++) {
            System.out.println("이름과 전화번호 입력(이름과 번호는 빈 칸없이 입력)>>");
            information[i] = new Phone(scanner.next(), scanner.next());
        }

        System.out.println("저장되었습니다.");

        while (true) {
            System.out.println("검색할 이름 입력>>");
            String search = scanner.next();
            boolean haveName = false;

            if (search.equals("그만")) {
                break;
            }

            for (int j = 0; j < information.length; j++) {
                if (search.equals(information[j].name)) {
                    System.out.println(information[j].name + "의 전화번호는" + information[j].tel);
                    haveName = true;
                    break;
                }
            }
            if (haveName == false) {
                System.out.println(search + "님의 이름은 없습니다");
            }
        }
    }
}

