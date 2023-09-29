package Java8Feactures;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaExpressionAndMethodRefrance {
    public static void main(String[] args) {
        /*
        forEach()-
         */
        List<String > list= Arrays.asList("rutuja","asmita","nikita","ankita");

        //1.antonyms class
        list.forEach(new Consumer<String>() {//antonyms class
            @Override
            public void accept(String s) {
                System.out.println(s);

            }
        });
        System.out.println(".........................");

        //2.lambda --  ->
        list.forEach(str-> System.out.println(str));
        System.out.println(".........................");

        //3.Method reference
        list.forEach(System.out::println);

    }
}
