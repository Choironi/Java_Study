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

        //익명(Anonymous) 클래스
        new AnonymousClass() { //이름이없음 -> 한번쓰고 재사용x

            @Override //재정의
            public void method() {
                System.out.println("AnonymousClass's Override method");
            }
        }.method();
    }
}
