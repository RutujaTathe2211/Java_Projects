package Java8Feactures.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamUsingFindAnyOrElse {
    public static void main(String[] args) {
        List<customer> customerlist= Arrays.asList(
                new customer("peter",30),
                new customer("swamini",40),
                new customer("pranjal",70),
                        new customer("nikita",22)
        );
        customer cust=customerlist.stream()//convert list to stream
                .filter(x->"peter".equals(x.getName()))//find it for peter
                .findAny()//if it finds then return list
                .orElse(null) ;

        System.out.println(cust.getName()+" "+cust.getId());

        //go to orElse()
        System.out.println("---------------");
        customer cust1=customerlist.stream()//convert list to stream
                .filter(x->"Naveen".equals(x.getName()))//find it for peter//as naveen is not their so it return null
                .findAny()//if it finds then return list
                .orElse(null) ;
        System.out.println(cust1);

        //filter with multiple conditions
        System.out.println("---------------");
        customer cust3=customerlist.stream().
                filter(x->"swamini".equals(x.getName())&& 40==x.getId())
                .findAny().orElse(null);
        System.out.println(cust3.getName()+" "+cust3.getId());

    }
}
