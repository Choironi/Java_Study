package ce.hiding;

public class Student {

    private static String name;
    //private String name;
    private static int score;
    //private int score; //score는 private로 막혀있고, 추후 데이터 변경시 변경불가

    public Student(String n, int s){
        this.name = n;
        this.score = s;
    }

    public static void getInfo(){
        System.out.println("name"+ name);
        System.out.println("score"+ score);
    }
    public String getName(){
        return name;
    }
    public int getScore(){
        return score;
    }
    public void setScore(int score){ // private -> public
        this.score = score;
    }
}