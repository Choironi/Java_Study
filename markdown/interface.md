# 인터페이스
## : 외부를 서로 이어주는 다리역할

- 인터페이스 내에 존재하는 메소드는 무조건 public abstract로 선언

- 인터페이스 내에 존재하는 변수는 무조건 public static final로 선언

- 인터페이스는 다중 상속과 비슷한 기능을 제공

#### 인터페이스 구현 

```java

package ce;

public interface Introduce {
    void introduce();
}

```


#### 클래스 -> 인터페이스 참조 

```java

package ce;

public class Class1 implements Introduce {

    @Override
    public void introduce() {
        System.out.println("Class1");
    }
}

```