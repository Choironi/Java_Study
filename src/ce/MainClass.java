package ce;

public class MainClass {

    public static void main(String[] args) {
        University student = new University("computer engineering", "Choironi", 2);
        student.info();
//        // 파라미터 주입
//        SalmonBread sb = new SalmonBread();
//        System.out.println(sb);
//        sb.taste = "달댜";
//        sb.texture = "쫀득";

//        SalmonBread sb = new SalmonBread();
//        System.out.println(sb.getTaste());
//        sb.setTaste("달다");
//        sb.setTexture("쫀득하다");

        //SalmonBread sb = new SalmonBread("달다","쫀득하다");
    }
}

