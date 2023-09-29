package Java8Feactures.Streams;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class streamWithFilter {
    public static void main(String[] args) {
        List<String> productlIst= Arrays.asList("MObile","Battery","Refrigrator","Bat","lAPTOP");
        //iterate using method referance
        //productlIst.forEach(System.out::println);

        //using predicates we filter the list
        List<String> startWithB=productlIst.stream().filter(x->x.startsWith("B")).collect(Collectors.toList());
        System.out.println("Starts With B : "+startWithB);


    }
}
