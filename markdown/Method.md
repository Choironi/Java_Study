 # 메서드
 ## : 메서드도 변수와 같이 선언 및 정의 후 필요시에 호출해 사용함
 
```java

package ce;

import java.sql.SQLOutput;

public class MainMethodex {

    public static void main(String[] args){


    Methodex methodex = new Methodex();

    methodex.name = "Choironi"; 
    methodex.major = "computer engineering";
    methodex.grade = 2;

    methodex.getinfo(); //호출부

    }
}
```

- 메서드 호출 : 클래스명.메서드 명(매개변수); , 도트 접근자를 이용해 호출

```java

package ce;

public class Methodex {

   public String name;
   public String major;
   public int grade;

   public Methodex() {
        System.out.println("example MainMethodex run");
   }

   public void getinfo(){ // 선언부
        System.out.println("name : "+name); //정의부
        System.out.println("major : "+major); //정의부
        System.out.println("grade : "+grade); //정의부

   }
}

```

# 매개변수(Parameter)

## : 메서드를 호출할 때 데이터를 전달할 수 있음

- 필요시에만 정의되며 매개변수는 자료형과 변수(지역변수)로 이루어진다

```java

package ce;

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


```

```java

package ce;

import java.sql.SQLOutput;

public class MainMethodex {

    public static void main(String[] args){


        Methodex methodex = new Methodex();

        methodex.setInfo("Choironi","computer engineering",2); // setInfo에서 매개변수를 던져줌

//        methodex.name = "Choironi";
//        methodex.major = "computer engineering";
//        methodex.grade = 2;

        methodex.getinfo(); // 호출부

    }
}
```

모두 출력값 동일

```java

example MainMethodex run
name : Choironi
major : computer engineering
grade : 2

```

# 중복메서드(Overloading)

## : 이름은 같고, 매개변수의 개수 또는 타입이 다른 메서드를 만들 수 있다

- public void getInfo() : 매개변수 없음
- public void getInfo(int x, int y) : 2개, int 형
- public void getInfo(String s1, String s2) : int <-> String 자료형의 차이

중복 메서드를 선언 및 정의했다면, 매개변수(Parameter)의 개수와 자료형에 맞춰서 사용할 것

# 접근자

## : 메서드를 호출할 때 접근자에 따라서 호출이 불가할 수 있음

- public : 모든 접근을 허용함
- protected : 같은 패키지(폴더)에 있는 객체와 상속관계의 객체들만 허용함
- default : 같은 패키지(폴더)에 있는 객체들만 허용함
- private : 현재 객체 내에서만 허용함

