package Java8Feactures.FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateFI {
    public static void main(String[] args) {
        /*
        PredicateFUnctionalInterface:
        -reperesent boolean value function
        -Take one operand
         */
        Predicate<Integer>fun=x->x>5;
        List<Integer> l= Arrays.asList(1,2,3,3,4,5,6,7,8,9);
        List<Integer> list=l.stream().filter(fun).collect(Collectors.toList());
        System.out.println(list);

        //predicate with and operator
        Predicate<Integer> fun2=x->x>5 && x<9;
        List<Integer> clist=l.stream().filter(fun2).collect(Collectors.toList());
        System.out.println(clist);

        //predicate with negate
        List<String> negate=Arrays.asList("Rutuja","Sakshi","Asmita","Ravina","Radha","Nikita","Ankita");
        Predicate<String> negateExpression=x->x.startsWith("R");
        //negate():negate the output
        List<String> negateOutput=negate.stream().filter(negateExpression.negate()).collect(Collectors.toList());
        System.out.println(negateOutput);

    }
}
