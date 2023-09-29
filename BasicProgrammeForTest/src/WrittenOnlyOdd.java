import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class WrittenOnlyOdd {
    public static void main(String[] args) {
        Stream.iterate(0,n->n+1).filter(x->x%2 !=0).limit(100).forEach(System.out::println);
        //String remove whitespaces
        String s=new String("      rutuja is my name");
        System.out.println(s.strip());

           }
}
