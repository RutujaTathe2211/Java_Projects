package Java8Feactures.Streams.flatmap;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;

public class StreamsWithFlatMap {
    public static void main(String[] args) {
        /* functions: sum,distinct,filter
        stream<String[]> is.filter()--not possible
        stream<List<String>>is.filter()--not possible
        stream<Set<Object>>is.filter()--not possible
        */

       String data[][]=new String[][]{{"a","b"},{"c","d"},{"e","f"}};
//        Stream<String[]> s=Arrays.stream(data);
//        //apply flatmap on s
//        Stream<String> sFlatMap= s.flatMap(x->Arrays.stream(x));
//
//        Stream<String> sFilter =  sFlatMap.filter(x->"a".equals(x.toString()));
//        sFilter.forEach(System.out::println);

        /*
        1.convert two-dimensional array to stream
        2.use flatmap of stream
        3.after that use filter method to filter the data
         */
        Stream<String> finalStream=Arrays.stream(data).flatMap(x->Arrays.stream(x)).filter(x->"a".equals(x.toString()));
        finalStream.forEach(System.out::println);

    }
}
