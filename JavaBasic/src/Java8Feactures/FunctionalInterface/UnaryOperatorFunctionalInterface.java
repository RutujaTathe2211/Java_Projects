package Java8Feactures.FunctionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryOperatorFunctionalInterface {
    public static void main(String[] args) {
        //take only one argument,extend function interface
        //generate same type result
        UnaryOperator<Integer> fun=x->x*7;
        int result= fun.apply(10);
        System.out.println(result);

        //function interface
        Function<Integer,Integer>fun2=x->x*10;
        System.out.println(fun2.apply(30));

        List<String>ar=new ArrayList<>();
        ar.add("rutu");
        ar.add("asmita");
        ar.add("sakshi");
        System.out.println(ar);

        ar.replaceAll(ele->ele+" naveen");
        System.out.println(ar);

    }
}
