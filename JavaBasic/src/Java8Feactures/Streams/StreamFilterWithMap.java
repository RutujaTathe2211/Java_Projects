package Java8Feactures.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterWithMap {
    public static void main(String[] args) {
        List<customer> customerlist= Arrays.asList(
                new customer("peter",30),
                new customer("swamini",40),
                new customer("pranjal",70),
                new customer("nikita",22)
        );
        String name=customerlist.stream().
                filter(x->"peter".equals(x.getName())).
                map(customer::getName).
                findAny().
                orElse(null);
        System.out.println(name);

        //print all the names from list
       List<String>customerNames= customerlist.stream().map(customer::getName).collect(Collectors.toList());
        System.out.println(customerNames);

        //print all id's
        List<Integer> idCustomer=customerlist.stream().map(customer::getId).collect(Collectors.toList());
        System.out.println(idCustomer);


    }
}
