package Java8Feactures.Streams.flatmap;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StraemArraryWithFlatmap {
    public static void main(String[] args) {
        int data[] = {1, 2, 34, 5, 6, 7, 8, 90, 8};
        Stream<int[]> s = Stream.of(data);
        IntStream intStream=s.flatMapToInt(x -> Arrays.stream(x));
        intStream.forEach(x-> System.out.print(x+" "));

    }
}

