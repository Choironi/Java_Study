package ce;

import com.sun.tools.javac.Main;

public class University{ //  클래스 이름 : 일반적으로 첫글자 대문자

    public String major; // 멤버 변수(속성)
    public String name; // 멤버 변수(속성)
    public int grade;

    public University(String m, String n, int g){ //string m,n, int g 값을 받음
        System.out.println("use or not");  //
        major = m; //
        name = n;
        grade = g;
    }

    public void info(){ // 메서드(기능) : 접근제한자/데이터의 자료형/메서드의 이름 순 작성
        System.out.println("run university information"); // 메서드를 실행했을때 run 출력
        System.out.println("major : " + major);
        System.out.println("name : " + name);
        System.out.println("grade : " + grade);
    }
}
