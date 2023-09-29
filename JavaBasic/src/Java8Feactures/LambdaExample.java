package Java8Feactures;


import java.sql.SQLOutput;

public class LambdaExample {
    public static void main(String[] args) {
        //lambda expression//automatically understand this value coming from interface
        //optimize the length of code
        WebpageFunctionalInterface w1=(value,age)->{System.out.println(value.length()+" age "+age); };
        WebpageFunctionalInterface w2=(value,age)->{System.out.println("hii  "+value.toUpperCase()+" age "+age); };
        w2.header("Naveen",20);

        w1.header("google",30);
//        Webpage w2=new Webpage() {
//            //implementation of all method in interface is required
//            @Override
//            public void header(String value) {
//                System.out.println("hello  "+value);
//            }
//        };
     //   w2.header("Facebook");

    }
}
