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

