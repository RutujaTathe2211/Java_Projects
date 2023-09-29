package Java8Feactures.Streams;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SequentialStream {
    public static void main(String[] args) {
        //directly with stream
        //we can not use already used stream ones again
        Stream person=Stream.of("Nikita","Asmita","salvin","suraj","neel");
        person.forEach(System.out::println);

        Arrays.asList(1,2,3,4,5,6,7,8,9,10).stream()
                .findFirst().
                ifPresent(System.out::println);

        //IntStream:we store integer value in this interface
        //3.print range from 1 to 5
        System.out.println("------------------");
        IntStream.range(1,5).forEach(System.out::println);

        //4.
        Arrays.stream(new int[]{1,2,3,4,5}).
                //map(n->n*2+1).
         average().ifPresent(System.out::println);

        //5.string object
        System.out.println("-------------------");
        Stream.of("a1","a2","a3").
                map(s->s.substring(1)).
                mapToInt(Integer::parseInt).max().
                ifPresent(System.out::println);

        //double to string
        System.out.println("-------------------");
        Stream.of(2.0,34.0,55.0,33.0).
                mapToInt(Double::intValue).
                mapToObj(i->"a"+i).
                forEach(System.out::println);

        //Limit
        System.out.println("-------------------");
        Stream.iterate(0,n->n+1).limit(10).forEach(System.out::println);

        //we get 10 even number
        Stream.iterate(0,n->n+1).filter(n->n%2==0).limit(10).forEach(System.out::println);
    }

}
