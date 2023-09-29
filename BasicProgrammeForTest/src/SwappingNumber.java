public class SwappingNumber {
    public static void main(String[] args) {
        int a = 10, b = 50;
        int t;
        //1.third variable
//        t=a;//t=10
//        a=b;//a=50
//        b=t;//b=10
//        System.out.println("A:"+a+" "+"B:"+b);
//
        System.out.println("-------------------------");
      //  2.+ and - operator
//        a=a+b;//10+50=60
//        b=a-b;//60-50=10//b=10
//        a=a-b;//60-10//a=50
//        System.out.println("A:"+a+" "+"B:"+b);

        //
        a=a*b;//50*10=500
        b=a/b;//500/50=10
        a=a/b;//500/10=50
               System.out.println("A:"+a+" "+"B:"+b);


    }

}
