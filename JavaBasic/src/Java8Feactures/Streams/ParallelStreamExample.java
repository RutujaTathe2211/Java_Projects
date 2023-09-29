package Java8Feactures.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.BaseStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ParallelStreamExample {
    public static void main(String[] args) {
        ForkJoinPool corepool=ForkJoinPool.commonPool();
        System.out.println(corepool.getParallelism());

        //1.by using parallel()
        Stream stream =Stream.of("naveen","asmita","rutuja","nikita");
        BaseStream parallelStream=stream.parallel();
        Stream.of("naveen","asmita","rutuja","nikita").forEach(System.out::println);
        System.out.println("-----------------------------------");
        //parallel():data take in any order
        Stream.of("naveen","asmita","rutuja","nikita").parallel().forEach(System.out::println);

        //when we use array,collection then use parallelStream()//use parallelStream() for collection
        System.out.println("-----------------------------------");
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8);
        list.parallelStream().forEach(System.out::print);

        //simple stream
        System.out.println("\n-----Normal Stream-------");
        IntStream.range(1,10).forEach(System.out::print);
        System.out.println("\n-----Parallel Stream-------");//used when order not matter
        IntStream.range(1,10).parallel().forEach(System.out::print);
        System.out.println("\n"+listOfAlphabets());
        System.out.println("Series");
        listOfAlphabets().forEach(System.out::println);
        System.out.println("\nParallel");
        listOfAlphabets().parallelStream().forEach(System.out::println);

        //check stream run in parallel:isParallel() is used
       IntStream range= IntStream.range(1,10);
        System.out.println(range.isParallel());//check whether the stream running parallel or not

        IntStream range2= IntStream.range(1,10).parallel();
        System.out.println(range2.isParallel());//True


    }
    //print a---z(97--122)
    public static List<String> listOfAlphabets(){
        List<String> s=new ArrayList<>();
        int n=97;
        while(n<=122){
            char c=(char)n;
            //character value get converts into string
            s.add(String.valueOf(c));
            n++;
        }
        return s;

    }
}
