package lambda;

public class LambdaMain {
    public static void main(String[] args) {
        System.out.println("Hello Functional Interface.....");
//        MyInter obj=new MyInterImpl();
////        obj.display();
//        MyInter i = new MyInter() {
//            @Override
//            public void display() {
//                System.out.println("this my my Anonymeous Class....");
//            }
//        };
//        i.display();
//        MyInter i2=new MyInter() {
//            @Override
//            public void display() {
//                System.out.println("this is 2nd ANonymeous Class...");
//            }
//        };
//        i2.display();
//        MyInter i=()-> System.out.println("This is 1st FI code...");
//        i.display();
//        MyInter i2=()-> System.out.println("This is 2nd FI code...");
//        i2.display();
//        ParameterInter i1=(x,y)->x+y;
//        System.out.println(i1.sum(2,5));
//        System.out.println(i1.sum(99,65));
        LengthInter i=(s)-> s.length();
        System.out.println(i.stringLength("Hello my Name Is HASSAN."));
    }
}
