package Java8Feactures.Streams;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ParallelStreamWithprimeNumber {
    public static void main(String[] args) {
       // System.out.println(primenumber(50));
       // long t1=System.currentTimeMillis();
        long count=Stream.iterate(0,n->n+1).
                limit(100000)//.parallel().
                .filter(ParallelStreamWithprimeNumber::primenumber).
                peek(x-> System.out.println(x))
                .count();
        System.out.println("Total prime no are: "+count);
        //long t2=System.currentTimeMillis();
      //  System.out.println("Total time taken: "+(t2-t1)/1000);

        /*For parallel:
        Total prime no are: 50000
        Total time taken: -4

        for serial:
        Total prime no are: 50000
        Total time taken: 9*/

    }
    public static boolean primenumber(int number){
        if(number<=1) return false;
        return !IntStream.rangeClosed(2,number/2).anyMatch(x->number%2==0);
    }
}
