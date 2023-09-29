package Java8Feactures.FunctionalInterface;

import java.util.function.Function;

public class FunctionMethod {
    public static void main(String[] args) {
/*
Function<T,R>
T-type of input to function
R-Type of output of function
 */
        //String-input,Integer-Output
        //Functional interface
        //Function<Input,Output>
        Function<String,Integer>fun=x->x.length();
        int length=fun.apply("hello,my name is rutuja dffggg jhhjdfjednj");
        System.out.println(length);

        //ansThen(): first function result combine with second function
        Function<Integer,Integer>fun2=x->x*2;
        int size=fun.andThen(fun2).apply("India");
        System.out.println("size after combining result of first function : "+size);

    }
}
