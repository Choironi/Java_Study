package ce.method;

public class Methodex {

    public String name;
    public String major;
    public int grade;

    public Methodex() {
        System.out.println("example MainMethodex run");
    }

    public void setInfo(String n, String m, int g) { // 호출할 때 n,m,g값을 입력해주면 됨
        name = n;
        major = m;
        grade = g;
    }

    public void getinfo(){ // 선언부
        System.out.println("name : "+name); //정의부
        System.out.println("major : "+major); //정의부
        System.out.println("grade : "+grade); //정의부

    }
}