#클래스

## 클래스는 멤버 변수 (속성), 메서드(기능), 생성자 등으로 구분 

```java

package ce;

import com.sun.tools.javac.Main;

public class University{ //  클래스 이름 : 일반적으로 첫글자 대문자

    public String major; // 멤버 변수(속성)
    public String name; // 멤버 변수(속성)
    public int grade;

    public University(){ // 이 클래스로 부터 가장 먼저 호출, 생성자는 클래스 이름과 동일하게 만들어 줄 것
        System.out.println("use or not");  // 필요시에 사용
    }

    public void info(){ // 메서드(기능) : 접근제한자/데이터의 자료형/메서드의 이름 순 작성
        System.out.println("run university information"); // 메서드를 실행했을때 run 출력
        System.out.println("major : " + major);
        System.out.println("name : " + name);
        System.out.println("grade : " + grade);
    }
}
    
```

## 객체 생성 : 클래스로 부터 'new'키워드를 이용해 객체를 생성한다

```java

package ce;

public class MainClass {

    public static void main(String[] args) {
        
        University student = new University();
        student.major = "computer_engineering"; // 도트접근자(.)를 이용해 가리킴(레퍼런스)
        student.name = "Choironi";
        student.grade = 2;
        student.info();
        
    }
}

```

### Run'MainClass.Main()'

```java

use or not
run university information
major : computer_engineering
name : Choironi
grade : 2

```

#생성자

## 클래스에서 객체를 생성할 때 가장 먼저 호출된다.

```java

package ce;

import com.sun.tools.javac.Main;

public class University{ //  클래스 이름 : 일반적으로 첫글자 대문자

    public String major; // 멤버 변수(속성)
    public String name; // 멤버 변수(속성)
    public int grade;

    public University(String m, String n, int g){ //string m,n, int g 값을 받음
        System.out.println("use or not");  
        major = m; 
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
    
```
```java

package ce;

public class MainClass {

    public static void main(String[] args) {
        University student = new University("computer engineering", "Choironi", 2);
        student.info();
    }
}

```

출력값 동일

```java

use or not
run university information
major : computer_engineering
name : Choironi
grade : 2

```




