# 데이터 은닉
## 멤버 변수의 private 설정 
## : 멤버 변수(속성)은 주로 private로 설정해서, 외부로부터 데이터가 변질되는 것을 막음

```java

package ce;

public class Student {

    private String name;
    private int score; //score는 private로 막혀있음 추후 데이터 변경시 변경불가

    public Student(String n, int s){
        this.name = n;
        this.score = s;
    }

    public void getinfo(){
        System.out.println("name"+ name);
        System.out.println("score"+ score);
    }
}

```

```java

package ce;

public class MainStudent {

    public static void main(String[] args) {

        Student student = new Student("Choironi", 90);
        Student.getinfo();
    }
}

```
# getter setter 

```java

package ce;

public class Student {

    private String name;
    private int score; //score는 private로 막혀있음 추후 데이터 변경시 변경불가

    public Student(String n, int s){
        this.name = n;
        this.score = s;
    }

    public void getinfo(){
        System.out.println("name"+ name);
        System.out.println("score"+ score);
    }
    public String getName(){
        return name;
    }
    public String setName(String name){
            this.name = name; 
    }
    public int getScore(){
        return score;
    }
    public void setScore(int score){ // private -> public
        this.score = score;
    }
}

```
```java

package ce;

public class MainStudent {

    public static void main(String[] args) {

        Student student = new Student("Choironi", 90);
        Student.getinfo();
        
        student.setScore(100); //90->100으로 변경가능
    }
}

```
