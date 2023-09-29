package Java8Feactures.FunctionalInterface;
  import java.util.function.BiFunction;
  import   java.util.function.BinaryOperator;


public class BinaryOperatorMethod{
    public static void main(String[] args) {
        /*BinaryOperator<T>
        Take two operand of same type and producing result of same type
        extend bifunctional
         */
        BinaryOperator<Integer> fun=(x,y)->x+y;
        int result=fun.apply(10,20);
        System.out.println(result);

        //biFunction interface:Take 3 arguments
        BiFunction<Integer,Integer,Integer> fun2=(x, y)->x+y;
        int result1=fun.apply(30,40);
        System.out.println(result1);


    }
}
