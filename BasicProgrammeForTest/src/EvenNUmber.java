import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EvenNUmber {
    public static void main(String[] args) {
       Stream even= Stream.iterate(0, n->n+1).limit(100).filter(n->n%2==0);
       even.forEach(System.out::println);

         }
}
