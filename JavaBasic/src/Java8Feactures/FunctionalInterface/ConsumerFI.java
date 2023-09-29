package Java8Feactures.FunctionalInterface;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerFI {
    public static void main(String[] args) {

    /*
    -Take one arguments and return nothing
    -method is accept()
     */
        Consumer<String> c = x -> System.out.println(x);
        c.accept("This is rutuja here");


        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 56, 7);
        list.forEach(x-> System.out.print(x+" "));
        list.forEach(System.out::println);

    }

}
