# 내부(Inner) 클래스 
## : 클래스 안에 또 다른 클래스를 선언하는 것으로 이렇게 하면 두 클래스의 멤버에 쉽게 접근할 수 있음

```java

package ce.innerouter;

public class MainClass {

    public static void main(String[] args){

        OuterClass oc = new OuterClass();
        System.out.println("oc.num :"+ oc.num);
        System.out.println("oc.str1 :"+ oc.str1);

        System.out.println();

        //멤버 Inner 클래스
        OuterClass.InnerClass in = oc.new InnerClass();
        System.out.println("in.num :"+ in.num);
        System.out.println("in.str2 :"+ in.str2);

        System.out.println();

        // static inner 클래스
        OuterClass.SInnerClass si = new OuterClass.SInnerClass();
        System.out.println("si.num :"+ si.num);
        System.out.println("si.str3 :"+ si.str3);

        System.out.println();
    }
}
```

```java

package ce.innerouter;

public class OuterClass {

    int num = 10;
    String str1 = "javastudy";
    static String str11 = "studywell";
    public OuterClass() {
        System.out.println("OuterClass constructor");
    }
    class InnerClass {

        int num = 100;
        String str2 = str1;

        public InnerClass() {
            System.out.println("MainClass constructor");
        }
    }
    static class SInnerClass {

        int num = 1000;
        String str3 = str11;

        public SInnerClass() {
            System.out.println("Static MainClass constructor");
        }
    }
}

```
# 익명(Anonymous) 클래스
## : 이름이 없는 클래스로 주로 메서드를 재정의 하는 목적으로 사용됨

```java

 //익명(Anonymous) 클래스
        new AnonymousClass() { //이름이없음 -> 한번쓰고 재사용x 

            @Override //재정의
            public void method() {
                System.out.println("AnonymousClass's Override method");
            }
        }.method();
    }
}

```

```java

package ce.innerouter;

public class AnonymousClass {

    public AnonymousClass() {
        System.out.println("AnonymousClass constructor");
    }
    public void method(){
        System.out.println("AnonymousClass's method");
    }
}

```
