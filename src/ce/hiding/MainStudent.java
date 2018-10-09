package ce.hiding;

public class MainStudent {

    public static void main(String[] args) {

        Student student = new Student("Choironi", 90);
        Student.getInfo();

        student.setScore(100); //90->100으로 변경가능
        student.getInfo();
    }
}
